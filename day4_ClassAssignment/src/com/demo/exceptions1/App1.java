package com.demo.exceptions1;

public class App1 {
	
	public void calculate(int a,int b) {
		
		App2 a2=new App2();
		try {
		a2.divide(a, b);
		}catch(ArithmeticException e) {
			throw e;
		}
		
		
	}

}
