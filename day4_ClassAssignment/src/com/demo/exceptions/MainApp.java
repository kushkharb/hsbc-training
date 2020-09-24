package com.demo.exceptions;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		App2 app2 = new App2();
//		App1 app1 = new App1(app2);
		App1 app1=new App1();
		
		double result = app1.calculate(2,1);
		System.out.println(result);
		
	}

}
