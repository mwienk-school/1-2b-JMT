package jmt.bank.server;

import javax.servlet.http.HttpSession;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import jmt.bank.beans.Account;
import jmt.bank.beans.BankCard;
import jmt.bank.beans.Client;
import jmt.bank.client.BankService;
import jmt.bank.shared.AuthenticationException;
import jmt.bank.shared.TransactionException;

@SuppressWarnings("serial")
public class BankImpl extends RemoteServiceServlet implements BankService {

	@Override
	public void init() {
		Account.createAccounts();
	}

	@Override
	public String transfer(String debitAccountId, String creditAccountId,
			float amount) throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposit(String creditAccountId, float amount)
			throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String withdraw(String debitAccountId, float amount)
			throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBalance(String accountId) throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void authenticateClient(String username, String password)
			throws AuthenticationException {
		try {
			if (password.equals(Client.getClient(username).getPassword())) {
				getSession().setAttribute("login-homebanking", true);
				getSession().setAttribute("account",
						Client.getClient(username).getAccount());
			} else {
				throw new AuthenticationException("ERROR: Password incorrect");
			}

		} catch (NullPointerException e) {
			throw new AuthenticationException("ERROR: Unknown username");
		}

	}

	@Override
	public void authenticateCard(String cardId, String PIN)
			throws AuthenticationException {
		try {
			if (PIN.equals(BankCard.getBankCard(cardId).getPinCode())) {
				getSession().setAttribute("login-cash", true);
				getSession().setAttribute("account",
						BankCard.getBankCard(cardId).getAccount());
			} else {
				throw new AuthenticationException("ERROR: Incorrect pincode!");
			}
		} catch (NullPointerException e) {
			throw new AuthenticationException("ERROR: Unknown Card ID");
		}
	}

	@Override
	public void isAuthenticated(String loginType) throws AuthenticationException {
		Object login = this.getSession().getAttribute("login-" + loginType);
		if (login == null || login.equals("true"))
			throw new AuthenticationException("Not logged in.");
	}
	
	@Override
	public void logout(String loginType) {
		this.getSession().removeAttribute("login-" + loginType);		
	}

	public HttpSession getSession() {
		return this.getThreadLocalRequest().getSession();
	}

	

}
