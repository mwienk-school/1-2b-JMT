package jmt.bank.shared;


public interface Transaction {
	public String transfer(String debitAccountId, String creditAccountId,
			float amount) throws TransactionException;

	public String deposit(String creditAccountId, float amount)
			throws TransactionException;

	public String withdraw(String debitAccountId, float amount)
			throws TransactionException;

	public String getBalance(String accountId) throws TransactionException;

}
