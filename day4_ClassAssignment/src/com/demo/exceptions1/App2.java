package com.demo.exceptions1;

public class App2 {
	
	public void divide(int a,int b) {
	try {
		int d=a/b;
		System.out.println(d);
	}
	catch(ArithmeticException e) {
		System.out.println("aaaaaaaaaa");
		throw e;
	}
	}

}
