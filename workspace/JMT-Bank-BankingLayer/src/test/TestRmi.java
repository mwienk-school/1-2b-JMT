package test;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.junit.Before;
import org.junit.Test;

import bank.Client;
import bank.authentication.Authentication;
import bank.authentication.AuthenticationException;
import bank.banking.Transaction;
import bank.banking.TransactionException;

public class TestRmi {
	private Authentication auth;
	private Transaction trans;
	private String accountId = "0010000001";
	private String otherAccountId = "0010000002";
	
	@Before
	public void setUp() throws Exception {
		Registry registry = LocateRegistry.getRegistry("127.0.0.1");
		
        auth = (Authentication) registry.lookup("Authentication");
        trans = (Transaction) registry.lookup("Transaction");
	}

	@Test
	public void testAuthenticateClient() throws RemoteException, AuthenticationException {
		// test successful authentication
		Client client = auth.authenticateHBClient("user1", "pass1");
		assertEquals(client.getUserName(), "user1");
	}
	
	@Test(expected = AuthenticationException.class)  
	public void testInvalidUsername () throws RemoteException, AuthenticationException {
		// test invalid username
		Client client = auth.authenticateHBClient("invalid", "bla");
	}
	
	@Test(expected = AuthenticationException.class)  
	public void testInvalidPassword () throws RemoteException, AuthenticationException {
		// test invalid username
		Client client = auth.authenticateHBClient("user1", "bla");
	}
	
	@Test
	public void testAuthenticateCard() throws RemoteException, AuthenticationException {
		// test successful authentication
		Client client = auth.authenticateCDClient("1234567890", "12345");
	}
	
	@Test(expected = AuthenticationException.class)  
	public void testInvalidCard () throws RemoteException, AuthenticationException {
		// test invalid card id
		Client client = auth.authenticateHBClient("000", "0000");
	}
	
	@Test(expected = AuthenticationException.class)  
	public void testInvalidPin () throws RemoteException, AuthenticationException {
		// test invalid pin
		Client client = auth.authenticateCDClient("1234567890", "0000");
	}
	
	@Test
	public void testBalance () throws RemoteException, TransactionException {
		float balance = trans.getBalance(accountId);
		float balanceVerify = trans.getBalance(accountId);
		
		assertEquals(balance, balanceVerify, 0);
	}
	
	@Test(expected = TransactionException.class)  
	public void testBalanceWithInvalidAccount () throws RemoteException, TransactionException {
		float balance = trans.getBalance("0010033300001");
		assertEquals(balance, 1000, 0);
	}
	
	@Test
	public void testDeposit () throws RemoteException, TransactionException {
		// get balance before
		float balance = trans.getBalance(accountId);
		
		// add 100
		trans.deposit(accountId, 100);
		
		// get balance after
		float balanceAfter = trans.getBalance(accountId);

		// verify deposit
		assertEquals(balance+100, balanceAfter, 0);
	}
	
	@Test(expected = TransactionException.class)  
	public void testDepositWithInvalidAccount () throws RemoteException, TransactionException {
		// add 100
		trans.deposit("00000", 100);
	}
	
	@Test
	public void testWithdraw() throws RemoteException, TransactionException {
		// get balance before
		float balance = trans.getBalance(accountId);
		
		// withdraw 100
		trans.withdraw(accountId, 100);
		
		// get balance after
		float balanceAfter = trans.getBalance(accountId);

		// verify deposit
		assertEquals(balance-100, balanceAfter, 0);
	}
	
	@Test(expected = TransactionException.class)  
	public void testWithdraWithInvalidAccount () throws RemoteException, TransactionException {
		// add 100
		trans.withdraw("00000", 100);
	}
	
	@Test(expected = TransactionException.class)  
	public void testTWithdrawTooBig () throws RemoteException, TransactionException {
		trans.withdraw(accountId, trans.getBalance(accountId)+100);
	}
	
	@Test
	public void testTransfer () throws RemoteException, TransactionException {
		// get balance before
		float balance = trans.getBalance(accountId) + trans.getBalance(otherAccountId);
		
		// transfer 100
		trans.transfer(accountId, otherAccountId, 100);
		
		// get balance after
		float balanceAfter = trans.getBalance(accountId) + trans.getBalance(otherAccountId);

		// verify transfer
		assertEquals(balance, balanceAfter, 0);
	}
	
	@Test(expected = TransactionException.class)  
	public void testTransferTooBig () throws RemoteException, TransactionException {
		trans.transfer(accountId, otherAccountId, trans.getBalance(accountId)+100);
	}
	
	@Test(expected = TransactionException.class)  
	public void testTransferInvalidCreditAccount () throws RemoteException, TransactionException {
		trans.transfer("0000", otherAccountId, 10);
	}
	
	@Test(expected = TransactionException.class)  
	public void testTransferInvalidDebitAccount () throws RemoteException, TransactionException {
		trans.transfer(accountId, "0000", 10);
	}
	
}
