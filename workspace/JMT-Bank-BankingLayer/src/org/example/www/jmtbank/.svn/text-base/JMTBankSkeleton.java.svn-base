/**
 * JMTBankSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.example.www.jmtbank;

import java.rmi.RemoteException;

import bank.BankService;
import bank.authentication.AuthenticationException;
import bank.banking.TransactionException;

/**
 * JMTBankSkeleton java skeleton for the axisService
 */
public class JMTBankSkeleton implements JMTBankSkeletonInterface {
	
	/**
	 * Auto generated method signature
	 * 
	 * @param deposit
	 * @return depositResponse1
	 * @throws TransactionException 
	 * @throws RemoteException 
	 */

	public DepositResponse deposit(Deposit deposit) throws RemoteException, TransactionException {
		BankService bank = BankService.getBankService();
		String depositResponse = bank.getTransactionProcessing().deposit(deposit.getCreditAccountId(), deposit.getAmount());
		DepositResponse response = new DepositResponse();
		response.setOut(depositResponse + "");
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param withdraw
	 * @return withdrawResponse
	 * @throws TransactionException 
	 * @throws RemoteException 
	 */

	public WithdrawResponse withdraw(Withdraw withdraw) throws RemoteException, TransactionException {
		BankService bank = BankService.getBankService();
		String withdrawResponse = bank.getTransactionProcessing().withdraw(withdraw.getDebitAccountId(), withdraw.getAmount());
		WithdrawResponse response = new WithdrawResponse();
		response.setOut(withdrawResponse + "");
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param authenticateCDClient
	 * @return authenticateCDClientResponse
	 * @throws AuthenticationException 
	 * @throws RemoteException 
	 */

	public AuthenticateCDClientResponse authenticateCDClient(AuthenticateCDClient authenticateCDClient) throws RemoteException, AuthenticationException {
		BankService bank = BankService.getBankService();
		bank.Client authCDResponse = bank.getAuth().authenticateCDClient(authenticateCDClient.getCardId(), authenticateCDClient.getPIN());
		if(authCDResponse == null) return null;
		Client responseClient = new Client();
		responseClient.setAccountId(authCDResponse.getAccountId());
		responseClient.setFirstName(authCDResponse.getFirstName());
		responseClient.setUserName(authCDResponse.getUserName());
		responseClient.setPassword(authCDResponse.getPassword());
		//TODO: lastname niet in wsdl?
		AuthenticateCDClientResponse response = new AuthenticateCDClientResponse();
		response.setOut(responseClient);
		System.out.println(response.getOut().getFirstName());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param transfer
	 * @return transferResponse
	 * @throws TransactionException 
	 * @throws RemoteException 
	 */

	public TransferResponse transfer(Transfer transfer) throws RemoteException, TransactionException {
		BankService bank = BankService.getBankService();
		String result = bank.getTransactionProcessing().transfer(transfer.getDebitAccountId(), transfer.getCreditAccountId(), transfer.getAmount());
		TransferResponse response = new TransferResponse();
		response.setOut(result + "");
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getBalance
	 * @return getBalanceResponse
	 * @throws TransactionException 
	 * @throws RemoteException 
	 */

	public GetBalanceResponse getBalance(GetBalance getBalance) throws RemoteException, TransactionException {
		BankService bank = BankService.getBankService();
		float balance = bank.getTransactionProcessing().getBalance(getBalance.getAccountId());
		GetBalanceResponse response = new GetBalanceResponse();
		response.setOut(balance);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param authenticateHBClient
	 * @return authenticateHBClientResponse
	 * @throws AuthenticationException 
	 * @throws RemoteException 
	 */

	public AuthenticateHBClientResponse authenticateHBClient(AuthenticateHBClient authenticateHBClient) throws RemoteException, AuthenticationException {
		BankService bank = BankService.getBankService();
		bank.Client authHBResponse = bank.getAuth().authenticateHBClient(authenticateHBClient.getUsername(), authenticateHBClient.getPassword());
		if(authHBResponse == null) return null;
		Client responseClient = new Client();
		responseClient.setAccountId(authHBResponse.getAccountId());
		responseClient.setFirstName(authHBResponse.getFirstName());
		responseClient.setUserName(authHBResponse.getUserName());
		responseClient.setPassword(authHBResponse.getPassword());
		//TODO: lastname niet in wsdl?
		AuthenticateHBClientResponse response = new AuthenticateHBClientResponse();
		response.setOut(responseClient);
		return response;
		
	}

}
