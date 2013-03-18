package jmt.bank.shared;

public interface Authentication {
	public void authenticateClient(String username, String password)
			throws AuthenticationException;

	public void authenticateCard(String cardId, String PIN)
			throws AuthenticationException;
	
	public void isAuthenticated(String loginType) 
			throws AuthenticationException;
	
	public void logout (String loginType);

}
