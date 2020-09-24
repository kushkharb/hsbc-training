package com.demo.exceptions;

public class App1 {
	
	App2 app2=new App2();
	
//	public App1(App2 app2){
//		this.app2=app2;
//	}
	
	public double calculate(int a,int b) {
		double result=0.0;
		try {
			result = app2.divide(a,b);
		}catch (ArithmeticException e) {
			System.out.println(e);
			throw e;
		}
		return result;
	}
	
}
