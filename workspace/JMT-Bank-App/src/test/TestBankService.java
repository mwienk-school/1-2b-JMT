package test;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import jmt.bank.shared.AuthenticationException;
import jmt.bank.shared.BankService;

import org.junit.Before;
import org.junit.Test;

import jmt.bank.shared.TransactionException;

import com.example.Client;

public class TestBankService {
	private String accountId = "0010000001";
	private String otherAccountId = "0010000002";
	
	private BankService bankService;
	
	@Before
	public void setUp() throws Exception {
		bankService = BankService.getInstance("http://localhost:8080/axis2/services/JMTBank?wsdl");
	}

	@Test
	public void testAuthenticateClient() throws RemoteException, AuthenticationException {
		// test successful authentication
		Client client = bankService.authenticateClient("user1", "pass1");
		assertEquals(client.getUserName(), "user1");
	}
	
	@Test(expected = AuthenticationException.class)  
	public void testInvalidUsername () throws RemoteException, AuthenticationException {
		// test invalid username
		Client client = bankService.authenticateClient("invalid", "pass");
	}
	
	@Test(expected = AuthenticationException.class)  
	public void testInvalidPassword () throws RemoteException, AuthenticationException {
		// test invalid password
		Client client = bankService.authenticateClient("user1", "bla");
	}
	
	@Test
	public void testAuthenticateCard() throws RemoteException, AuthenticationException {
		// test successful authentication
		Client client = bankService.authenticateCard("1234567890", "12345");
	}
	
	@Test(expected = AuthenticationException.class)  
	public void testInvalidCard () throws RemoteException, AuthenticationException {
		// test invalid card id
		Client client = bankService.authenticateCard("000", "0000");
	}
	
	@Test(expected = AuthenticationException.class)  
	public void testInvalidPin () throws RemoteException, AuthenticationException {
		// test invalid pin
		Client client = bankService.authenticateCard("1234567890", "0000");
	}
	
	@Test
	public void testBalance () throws RemoteException, TransactionException {
		float balance = bankService.getBalance(accountId);
		float balanceVerify = bankService.getBalance(accountId);
		
		assertEquals(balance, balanceVerify, 0);
	}
	
	@Test(expected = TransactionException.class)  
	public void testBalanceWithInvalidAccount () throws RemoteException, TransactionException {
		float balance = bankService.getBalance("0010033300001");
		assertEquals(balance, 1000, 0);
	}
	
	@Test
	public void testDeposit () throws RemoteException, TransactionException {
		// get balance before
		float balance = bankService.getBalance(accountId);
		
		// add 100
		bankService.deposit(accountId, 100);
		
		// get balance after
		float balanceAfter = bankService.getBalance(accountId);

		// verify deposit
		assertEquals(balance+100, balanceAfter, 0);
	}
	
	@Test(expected = TransactionException.class)  
	public void testDepositWithInvalidAccount () throws RemoteException, TransactionException {
		// add 100
		bankService.deposit("00000", 100);
	}
	
	@Test
	public void testWithdraw() throws RemoteException, TransactionException {
		// get balance before
		float balance = bankService.getBalance(accountId);
		
		// withdraw 100
		bankService.withdraw(accountId, 100);
		
		// get balance after
		float balanceAfter = bankService.getBalance(accountId);

		// verify deposit
		assertEquals(balance-100, balanceAfter, 0);
	}
	
	@Test(expected = TransactionException.class)  
	public void testWithdraWithInvalidAccount () throws RemoteException, TransactionException {
		// add 100
		bankService.withdraw("00000", 100);
	}
	
	@Test(expected = TransactionException.class)  
	public void testTWithdrawTooBig () throws RemoteException, TransactionException {
		bankService.withdraw(accountId, bankService.getBalance(accountId)+100);
	}
	
	@Test
	public void testTransfer () throws RemoteException, TransactionException {
		// get balance before
		float balance = bankService.getBalance(accountId) + bankService.getBalance(otherAccountId);
		
		// transfer 100
		bankService.transfer(accountId, otherAccountId, 100);
		
		// get balance after
		float balanceAfter = bankService.getBalance(accountId) + bankService.getBalance(otherAccountId);

		// verify transfer
		assertEquals(balance, balanceAfter, 0);
	}
	
	@Test(expected = TransactionException.class)  
	public void testTransferTooBig () throws RemoteException, TransactionException {
		bankService.transfer(accountId, otherAccountId, bankService.getBalance(accountId)+100);
	}
	
	@Test(expected = TransactionException.class)  
	public void testTransferInvalidCreditAccount () throws RemoteException, TransactionException {
		bankService.transfer("0000", otherAccountId, 10);
	}
	
	@Test(expected = TransactionException.class)  
	public void testTransferInvalidDebitAccount () throws RemoteException, TransactionException {
		bankService.transfer(accountId, "0000", 10);
	}
}
