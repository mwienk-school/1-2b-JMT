package fibo.server;

import java.math.BigInteger;

public class TestFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start local Fibonacci tests");
		try{
		FibonacciImpl fibo =  new FibonacciImpl();
		
		BigInteger f56 = fibo.getFibonacci(56);
        System.out.println("The 56th Fibonacci number is " + f56);
        
        BigInteger f156 = fibo.getFibonacci(156);
        System.out.println("The 156th Fibonacci number is " + f156);
		}
		catch (Exception ex){
			System.out.println("Oops!");
		}
	}

}
