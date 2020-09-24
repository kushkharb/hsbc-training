package com.demo.exceptions1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		App1 a1=new App1();
		try {
		a1.calculate(2,0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("divide by zero");
		}
		System.out.println("done successfully");

	}

}
