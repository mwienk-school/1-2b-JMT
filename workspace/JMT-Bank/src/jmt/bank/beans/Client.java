package jmt.bank.beans;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class Client implements java.io.Serializable {
	private static final Map<String, Client> clients = new HashMap<String, Client>();;
	private Account account;
	private String username;
	private String password;
	
	/**
	 * Empty client constructor
	 */
	public Client() {}
	
	/**
	 * Client constructor
	 * @param account
	 * @param username
	 * @param password
	 */
	public Client(Account account, String username, String password) {
		this.account = account;
		this.username = username;
		this.password = password;
		this.addToIndex();
	}
	
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	
	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Add a client to the clients table
	 * @param c
	 */
	private void addToIndex() {
		clients.put(this.username, this);
	}

	/**
	 * Return a Client corresponding to the username
	 * @param username
	 * @return
	 */
	public static Client getClient(String username) {
		return clients.get(username);
	}

}
