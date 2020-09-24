package com.demo.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start of program");
		try {
		int a=10;
		int b=0;
		double d=a/b;
		
		System.out.println("NoException in try block");
		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e));
			System.out.println(e.getMessage());
		}
	System.out.println("end of program");
	}

}
