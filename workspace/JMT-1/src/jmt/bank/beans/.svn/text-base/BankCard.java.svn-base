package jmt.bank.beans;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class BankCard implements java.io.Serializable {
	private static final Map<String,BankCard> bankcards = new HashMap<String,BankCard>();
	private Account account;
	private String bankCardId;
	private String pinCode;
	
	/**
	 * Empty constructor
	 */
	public BankCard() {}
	
	/**
	 * A BankCard holds all information about a card
	 * @param account
	 * @param bankCardId
	 * @param pinCode
	 */
	public BankCard(Account account, String bankCardId, String pinCode) {
		this.account = account;
		this.bankCardId = bankCardId;
		this.pinCode = pinCode;
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
	 * @return the bankCardId
	 */
	public String getBankCardId() {
		return bankCardId;
	}

	/**
	 * @param bankCardId the bankCardId to set
	 */
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}

	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	/**
	 * Add a BankCard to the index
	 */
	private void addToIndex() {
		bankcards.put(this.bankCardId, this);
	}
	
	/**
	 * Get the BankCard corresponding with bankCardId
	 * @param bankCardId
	 * @return
	 */
	public static BankCard getBankCard(String bankCardId) {
		return bankcards.get(bankCardId);
	}
	
}
