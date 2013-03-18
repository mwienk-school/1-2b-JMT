package jmt.bank.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("serial")
public class Account implements java.io.Serializable {
	private static Map<String,Account> accounts = new HashMap<String,Account>();
	private int bankAccountNumber;
	private float balance;
	private List<Client> clients;
	private List<BankCard> cards;
	
	/**
	 * The account that is 
	 */
	public Account() {
		balance = 0;
		clients = new ArrayList<Client>();
		cards = new ArrayList<BankCard>();
	}
	
	/**
	 * @return the bankAccountNumber
	 */
	public int getBankAccountNumber() {
		return bankAccountNumber;
	}
	/**
	 * @param bankAccountNumber the bankAccountNumber to set
	 */
	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}

	/**
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	/**
	 * Add a client to the account
	 * @param username
	 * @param password
	 */
	public void addClient(String username, String password) {
		clients.add(new Client(this, username, password));
	}
	
	public void addCard(String cardId, String PIN) {
		cards.add(new BankCard(this, cardId, PIN));
	}

	/**
	 * @return the cards
	 */
	public List<BankCard> getCards() {
		return cards;
	}

	/**
	 * @param cards the cards to set
	 */
	public void setCards(List<BankCard> cards) {
		this.cards = cards;
	}
	
	public static void createAccounts() {
		//Account 1
		Account acc1 = new Account();
		acc1.addCard("card1", "1234");
		acc1.addClient("user1", "pass1");
		accounts.put("acc1", acc1);
		//Account 2
		Account acc2 = new Account();
		acc2.addCard("card2", "2345");
		acc2.addClient("user2", "pass2");
		accounts.put("acc2", acc2);
		//Account 3
		Account acc3 = new Account();
		acc3.addCard("card3", "3456");
		acc3.addClient("user3", "pass3");
		accounts.put("acc3", acc3);
	}

}
