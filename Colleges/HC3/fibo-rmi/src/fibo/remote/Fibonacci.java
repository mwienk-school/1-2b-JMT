package fibo.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.math.BigInteger;

/**
 * 
 * Interface to a remote object that calculates Fibonacci numbers.
 * 
 * @author Harold, E.R
 */
//B{Fibonacci.interface}
public interface Fibonacci extends Remote {
	/**
	 * Calculates a Fibonacci number for an integer value.
	 * 
	 * @param n Index of the Fibonacci number.
	 * @return Resulting Fibonacci number.
	 * @throws RemoteException
	 */
	public BigInteger getFibonacci(int n) throws RemoteException;
	/**
	 * Calculates a Fibonacci number for a BigInteger value.
	 * 
	 * @param n Index of the Fibonacci number.
	 * @return Resulting Fibonacci number.
	 * @throws RemoteException
	 */
	public BigInteger getFibonacci(BigInteger n) throws RemoteException;
}
//E{Fibonacci.interface}
