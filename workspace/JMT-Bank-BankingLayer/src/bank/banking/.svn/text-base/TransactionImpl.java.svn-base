package bank.banking;

import java.rmi.RemoteException;

import bank.Account;
import bank.access.DataAccess;
import bank.access.DataAccessException;
import bank.access.DataAccessImpl;

public class TransactionImpl implements Transaction {

	@Override
	public String transfer(String debitAccountId, String creditAccountId,
			float amount) throws RemoteException, TransactionException {
		DataAccess dataAccess = DataAccessImpl.getInstance();
		
		Account debitAccount = null;
		Account creditAccount = null;
		
		try {
			dataAccess.beginTransaction();
			// verify accounts exists
			debitAccount = dataAccess.getAccount(debitAccountId);
			if (debitAccount == null) {
				throw new TransactionException("Debit account ID is invalid");
			}
			creditAccount = dataAccess.getAccount(creditAccountId);
			if (creditAccount == null) {
				throw new TransactionException("Credit account ID is invalid");
			}
			// begin transfer transaction

			// check if balance of debit account is not too low
			if (debitAccount.getBalance() < amount) {
				throw new TransactionException("Balance of debit account is too low for transfer");
			}
			// debit from debit account			
			dataAccess.debitAccount(debitAccountId, amount);
			// credit to credit account
			dataAccess.creditAccount(creditAccountId, amount);
			// commit transfer transaction
			dataAccess.commitTransaction();

		} catch (DataAccessException e) {
			try {
				dataAccess.rollbackTransaction();
			} catch (DataAccessException ex) {
				// TODO Auto-generated catch block
				throw new TransactionException(e.getMessage());
			}
			throw new TransactionException(e.getMessage());
		}
		return null;
	}

	@Override
	public String deposit(String creditAccountId, float amount)
			throws RemoteException, TransactionException {
		DataAccess dataAccess = DataAccessImpl.getInstance();
		
		// retrieve Account object
		Account creditAccount = null;
		try {
			creditAccount = dataAccess.getAccount(creditAccountId);
		} catch (DataAccessException e) {
			throw new TransactionException(e.getMessage());
		}
		
		// verify account exists
		if (creditAccount == null) {
			throw new TransactionException("Credit account does not exist");
		}
		
		// do credit
		try {
			dataAccess.creditAccount(creditAccountId, amount);
			dataAccess.commitTransaction();
		} catch (DataAccessException e) {
			throw new TransactionException(e.getMessage());
		}
		
		return null;
	}

	@Override
	public String withdraw(String debitAccountId, float amount)
			throws RemoteException, TransactionException {
		DataAccess dataAccess = DataAccessImpl.getInstance();

		// retrieve Account object
		Account debitAccount = null;
		try {
			debitAccount = dataAccess.getAccount(debitAccountId);
		} catch (DataAccessException e) {
			throw new TransactionException(e.getMessage());
		}
		
		// verify account exists
		if (debitAccount == null) {
			throw new TransactionException("Debit account does not exist.");
		}
		
		// verify balance is high enough
		if (amount > debitAccount.getBalance()) {
			throw new TransactionException("Balance is insufficient for withdrawal.");
		}
		
		// do debit
		try {
			dataAccess.debitAccount(debitAccountId, amount);
			dataAccess.commitTransaction();
		} catch (DataAccessException e) {
			throw new TransactionException(e.getMessage());
		}
		
		return null;
	}

	@Override
	public float getBalance(String accountId) throws RemoteException,
			TransactionException {
		DataAccess dataAccess = DataAccessImpl.getInstance();
		
		float balance = 0;
		try {
			Account account = dataAccess.getAccount(accountId);
			balance = account.getBalance();
		} catch (Exception e) {
			throw new TransactionException (e.getMessage());
		}
		return balance;
	}

}
