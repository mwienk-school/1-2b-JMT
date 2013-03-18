package jmt.bank.shared;

import com.example.Client;

public interface Authentication {
	public Client authenticateClient(String username, String password)
			throws AuthenticationException;

	public Client authenticateCard(String cardId, String PIN)
			throws AuthenticationException;

}
