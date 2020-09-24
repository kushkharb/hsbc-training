package com.demo.exceptions;

import javax.management.RuntimeErrorException;

public class App2 {
	
	public double divide(int a,int b) {
		double result =0.0;
		try {
		result = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
		return result;
	}

}
