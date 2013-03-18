package fibo.server;

import java.math.BigInteger;
import java.rmi.RemoteException;

import fibo.remote.Fibonacci;

/**
 * Remote object implementation that calculates Fibonacci numbers.
 * 
 * @author Harold, E.R
 */

public class FibonacciImpl implements Fibonacci {
	
	public FibonacciImpl() throws RemoteException {
	}
	/**
	 * Calculates a Fibonacci number for an integer value.
	 * 
	 * @param n Index of the Fibonacci number.
	 * @return Resulting Fibonacci number.
	 * @throws RemoteException
	 */
	public BigInteger getFibonacci(int n) throws RemoteException {
		return this.getFibonacci(new BigInteger(Integer.toString(n)));
	}
	/**
	 * Calculates a Fibonacci number for a BigInteger value.
	 * 
	 * @param n Index of the Fibonacci number.
	 * @return Resulting Fibonacci number.
	 * @throws RemoteException
	 */
	public BigInteger getFibonacci(BigInteger n) throws RemoteException {
		System.out.println("Calculating "+ n + "th Fibonacci number");
	
		BigInteger index = BigInteger.ONE;
		BigInteger former = BigInteger.ZERO;
		BigInteger result = BigInteger.ONE;
		
		if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) 
			return n;
		while (index.compareTo(n) == -1) {
			BigInteger temp = result;
			result = result.add(former);
			former = temp;
			index = index.add(BigInteger.ONE);
		}
		return result;
	}
}
