package fibo.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

import fibo.remote.Fibonacci;

/**
 * Server class for the Fibonacci remote object implementation.
 * 
 * @author Harold, E.R
 */
public class FibonacciServer {
	
    public static void main(String[] args) {
    	//B{Security}
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        //E{Security}
        try {
        //B{Fibonacci.stub}
        	FibonacciImpl fibo = new FibonacciImpl();
        	Fibonacci stub =
                (Fibonacci) UnicastRemoteObject.exportObject(fibo, 0);
        //E{Fibonacci.stub}
        //B{Fibonacci.register} 
        	System.out.println("Fibonacci Stub exported.");
            String name = "Fibonacci";
            Registry registry = LocateRegistry.getRegistry();
            System.out.println("Registry located.");
            registry.rebind(name, stub);
        //E{Fibonacci.register}
            System.out.println("Fibonacci Server ready.");
        } catch (RemoteException re) {
            System.err.println("Exception in FibonacciServer.main: " + re);
        }
    }
}
