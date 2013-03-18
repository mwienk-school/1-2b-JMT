package fibo.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;
import java.rmi.Remote;
import java.rmi.NotBoundException;

import java.math.BigInteger;
import fibo.remote.Fibonacci;

public class FibonacciClient {

	public static void main(String args[]) {

		Remote fibo;

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		try {
			//B{Fibonacci.lookup}
			Registry registry = LocateRegistry.getRegistry(args[0]);
			fibo = registry.lookup(args[1]);
			//E{Fibonacci.lookup}
		} catch (Exception re) {
			System.err.println(
			"Registry exception in FibonacciClient.main: " + re);
			return;
		}

		try {
			for (int i = 2; i < args.length; i++) {
				BigInteger index = new BigInteger(args[i]);
				BigInteger f = ((Fibonacci) fibo).getFibonacci(index);
				System.out.println(
				"The " + index + "th Fibonacci number is " + f);
			}
		} catch (RemoteException re) {
			System.err.println(
			"Remote Exception in FibonacciClient.main: " + re);
		}
	}
}


