package coreservlets;

import java.util.*;

/** Bean to represent a bank customer. */
public class BankCustomer {
	private String id, firstName, lastName;
	private double balance;
	public BankCustomer(String id,
			String firstName,
			String lastName,
			double balance) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	public String getId() {
		return(id);
	}
	public String getFirstName() {
		return(firstName);
	}

	public String getLastName() {
		return(lastName);
	}
	public double getBalance() {
		return(balance);
	}
	public double getBalanceNoSign() {
		return(Math.abs(balance));
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// Makes a small table of banking customers.
	private static Map<String,BankCustomer> customers;
	static {
		customers = new HashMap<String,BankCustomer>();
		customers.put("id001",
				new BankCustomer("id001",
						"John",
						"Hacker",
						-3456.78));
		customers.put("id002",
				new BankCustomer("id002",
						"Jane",
						"Hacker",
						1234.56));
		customers.put("id003",
				new BankCustomer("id003",
						"Juan",
						"Hacker",
						987654.32));
	}
	/** Finds the customer with the given ID.
	 * Returns null if there is no match.
	 */
	public static BankCustomer getCustomer(String id) {
		return(customers.get(id));
	}
}
