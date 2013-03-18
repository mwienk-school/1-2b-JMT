package bank.authentication;

import java.rmi.Naming;
import java.rmi.RemoteException;

import bank.Account;
import bank.BankCard;
import bank.BankService;
import bank.Client;
import bank.access.DataAccess;
import bank.access.DataAccessException;
import bank.access.DataAccessImpl;

public class AuthenticationImpl implements Authentication {
	
	/**
	 * Returns the Authentication of the bank identified by bankCode
	 * @param bankCode
	 * @return
	 * @throws RemoteException
	 */
	private static Authentication getRemoteAuthentication(String bankCode) throws RemoteException {
		System.out.println("Getting remote auth");
		try {
			String url = BankService.getBankService().getInterbank().lookupAuthenticator(bankCode);
			System.out.println("URL:" + url);
			return (Authentication) Naming.lookup(url);
		} catch (Exception e) {
			System.err.print("An error has occurred while looking for bank " + bankCode +":");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Client authenticateHBClient(String username, String password)
			throws RemoteException, AuthenticationException {
		Client client = null;
		if(username.contains(".")) {
			//Username contains a domain separator. Use the interbanking system.
			String bankID = username.substring(0, username.indexOf("."));
			System.out.println(username.substring(0, username.indexOf(".")));
			System.out.println(username.substring(username.indexOf(".")+1));
			client = getRemoteAuthentication(bankID).authenticateHBClient(username.substring(username.indexOf(".")+1), password);
			if(client == null) throw new AuthenticationException("Invalid remote username/password combination.");
		} else {
			//Username is a local username
			DataAccess dataAccess = DataAccessImpl.getInstance();
			try {
				client = dataAccess.getClient(username);
			} catch (DataAccessException e) {
				throw new AuthenticationException (e.getMessage());
			}
			
			if (client == null) {
				throw new AuthenticationException("Invalid username");
			}
		
			// verify password
			if (client != null) {
				if (!client.getPassword().equals(password)) {
					throw new AuthenticationException("Invalid password");
				}
			}
		}
		return client;
	}

	@Override
	public Client authenticateCDClient(String cardId, String PIN)
			throws RemoteException, AuthenticationException {
		Client client = null;
		if(cardId.contains(".")) {
			//Card ID contains a domain separator. Use the interbanking system.
			String bankID = cardId.substring(0, cardId.indexOf("."));
			client = getRemoteAuthentication(bankID).authenticateCDClient(cardId.substring(cardId.indexOf(".")+1), PIN);
			if(client == null) throw new AuthenticationException("Invalid remote cardId/PIN combination.");
		} else {
			DataAccess dataAccess = DataAccessImpl.getInstance();
			BankCard bankCard = null;
		
			// Retrieve BankCard from dataAccess
			try {
				bankCard = dataAccess.getBankCard(cardId);
			} catch (DataAccessException e) {
				throw new AuthenticationException ("Error: " + e.getMessage());
			}
		
			if (bankCard == null) {
				throw new AuthenticationException("Invalid bank card ID");
			}

			// Verify pin and retrieve client
			if (bankCard != null) {
				if (bankCard.getPIN().equals(PIN)) {
					try {
						Account account = dataAccess.getAccount(bankCard.getAccountId());
						client = dataAccess.getClient(account.getUserName());
					} catch (DataAccessException e) {
						throw new AuthenticationException ("Error: " + e.getMessage());
					}
				} else {
					throw new AuthenticationException("Invalid PIN");
				}
			}
		}
		return client;
	}
}
