
/**
 * JMTBankSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.jmtbank;

import java.rmi.RemoteException;

import bank.authentication.AuthenticationException;
import bank.banking.TransactionException;
    /**
     *  JMTBankSkeletonInterface java skeleton interface for the axisService
     */
    public interface JMTBankSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param deposit
         * @throws TransactionException 
         * @throws RemoteException 
         */

        
                public org.example.www.jmtbank.DepositResponse deposit
                (
                  org.example.www.jmtbank.Deposit deposit
                 ) throws RemoteException, TransactionException
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param withdraw
         * @throws TransactionException 
         * @throws RemoteException 
         */

        
                public org.example.www.jmtbank.WithdrawResponse withdraw
                (
                  org.example.www.jmtbank.Withdraw withdraw
                 ) throws RemoteException, TransactionException
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param authenticateCDClient
         * @throws AuthenticationException 
         * @throws RemoteException 
         */

        
                public org.example.www.jmtbank.AuthenticateCDClientResponse authenticateCDClient
                (
                  org.example.www.jmtbank.AuthenticateCDClient authenticateCDClient
                 ) throws RemoteException, AuthenticationException
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param transfer
         * @throws TransactionException 
         * @throws RemoteException 
         */

        
                public org.example.www.jmtbank.TransferResponse transfer
                (
                  org.example.www.jmtbank.Transfer transfer
                 ) throws RemoteException, TransactionException
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getBalance
         * @throws TransactionException 
         * @throws RemoteException 
         */

        
                public org.example.www.jmtbank.GetBalanceResponse getBalance
                (
                  org.example.www.jmtbank.GetBalance getBalance
                 ) throws RemoteException, TransactionException
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param authenticateHBClient
         * @throws AuthenticationException 
         * @throws RemoteException 
         */

        
                public org.example.www.jmtbank.AuthenticateHBClientResponse authenticateHBClient
                (
                  org.example.www.jmtbank.AuthenticateHBClient authenticateHBClient
                 ) throws RemoteException, AuthenticationException
            ;
        
         }
    