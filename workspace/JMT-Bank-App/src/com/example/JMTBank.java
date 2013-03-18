
package com.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "JMTBank", targetNamespace = "http://www.example.org/JMTBank/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface JMTBank {


    /**
     * 
     * @param amount
     * @param debitAccountId
     * @param creditAccountId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.example.org/JMTBank/transfer")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "transfer", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.Transfer")
    @ResponseWrapper(localName = "transferResponse", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.TransferResponse")
    public String transfer(
        @WebParam(name = "debitAccountId", targetNamespace = "")
        String debitAccountId,
        @WebParam(name = "creditAccountId", targetNamespace = "")
        String creditAccountId,
        @WebParam(name = "amount", targetNamespace = "")
        float amount);

    /**
     * 
     * @param amount
     * @param creditAccountId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.example.org/JMTBank/transfer")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "deposit", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.Deposit")
    @ResponseWrapper(localName = "depositResponse", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.DepositResponse")
    public String deposit(
        @WebParam(name = "creditAccountId", targetNamespace = "")
        String creditAccountId,
        @WebParam(name = "amount", targetNamespace = "")
        float amount);

    /**
     * 
     * @param amount
     * @param debitAccountId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.example.org/JMTBank/transfer")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "withdraw", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.Withdraw")
    @ResponseWrapper(localName = "withdrawResponse", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.WithdrawResponse")
    public String withdraw(
        @WebParam(name = "debitAccountId", targetNamespace = "")
        String debitAccountId,
        @WebParam(name = "amount", targetNamespace = "")
        float amount);

    /**
     * 
     * @param accountId
     * @return
     *     returns float
     */
    @WebMethod(action = "http://www.example.org/JMTBank/transfer")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "getBalance", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.GetBalance")
    @ResponseWrapper(localName = "getBalanceResponse", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.GetBalanceResponse")
    public float getBalance(
        @WebParam(name = "accountId", targetNamespace = "")
        String accountId);

    /**
     * 
     * @param username
     * @param password
     * @return
     *     returns com.example.Client
     */
    @WebMethod(action = "http://www.example.org/JMTBank/transfer")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "authenticateHBClient", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.AuthenticateHBClient")
    @ResponseWrapper(localName = "authenticateHBClientResponse", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.AuthenticateHBClientResponse")
    public Client authenticateHBClient(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param cardId
     * @param pin
     * @return
     *     returns com.example.Client
     */
    @WebMethod(action = "http://www.example.org/JMTBank/transfer")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "authenticateCDClient", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.AuthenticateCDClient")
    @ResponseWrapper(localName = "authenticateCDClientResponse", targetNamespace = "http://www.example.org/JMTBank/", className = "com.example.AuthenticateCDClientResponse")
    public Client authenticateCDClient(
        @WebParam(name = "cardId", targetNamespace = "")
        String cardId,
        @WebParam(name = "PIN", targetNamespace = "")
        String pin);

}