package jmt.bank.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface BankServiceAsync {
	void authenticateClient(String username, String password,
			AsyncCallback<Void> callback);

	void authenticateCard(String cardId, String PIN,
			AsyncCallback<Void> callback);

	void transfer(String debitAccountId, String creditAccountId, float amount,
			AsyncCallback<String> callback);

	void deposit(String creditAccountId, float amount,
			AsyncCallback<String> callback);

	void withdraw(String debitAccountId, float amount,
			AsyncCallback<String> callback);

	void getBalance(String accountId, AsyncCallback<String> callback);

	void isAuthenticated(String loginType, AsyncCallback<Void> callback);
	
	void logout(String loginType, AsyncCallback<Void> callback);
	
}
