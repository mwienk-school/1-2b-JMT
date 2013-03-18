package fibo.client;

import java.rmi.registry.LocateRegistry;
	import java.rmi.registry.Registry;
	import java.math.BigInteger;
	import fibo.remote.Fibonacci;
	
public class FibonacciClientSimple {

	    public static void main(String args[]) {
	        if (System.getSecurityManager() == null) {
	            System.setSecurityManager(new SecurityManager());
	        }
	        try {
	            String name = "Fibonacci";
	            Registry registry = LocateRegistry.getRegistry(args[0]);
	            Fibonacci fibo = (Fibonacci) registry.lookup(name);
	            
	            BigInteger f56 = fibo.getFibonacci(56);
	            System.out.println("The 56th Fibonacci number is " + f56);
	            
	            BigInteger f156 = fibo.getFibonacci(156);
	            System.out.println("The 156th Fibonacci number is " + f156);
	            
	        } catch (Exception e) {
	            System.err.println("Fibonacci exception:");
	            e.printStackTrace();
	        }
	    }
}


