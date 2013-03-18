package jmt.bank.server;

import jmt.bank.beans.BankCard;
import jmt.bank.beans.Client;
import jmt.bank.shared.*;

public class BankImpl implements Authentication, Transaction {

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
			if (!password.equals(Client.getClient(username).getPassword()))
				throw new AuthenticationException("ERROR: Password incorrect");
		} catch (NullPointerException e) {
			throw new AuthenticationException("ERROR: Unknown username");
		}

	}

	@Override
	public void authenticateCard(String cardId, String PIN)
			throws AuthenticationException {
		try {
			if (!PIN.equals(BankCard.getBankCard(cardId).getPinCode()))
				throw new AuthenticationException("ERROR: Incorrect pincode!");
		} catch (NullPointerException e) {
			throw new AuthenticationException("ERROR: Unknown Card ID");
		}
	}

}
