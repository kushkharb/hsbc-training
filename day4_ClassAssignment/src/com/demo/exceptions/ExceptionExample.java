package com.demo.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {

	try {
		int[] nums= {1,2,3,4};
		System.out.println(nums[2]);

		String[] names=new String[5];
		names[2].length();
		
		System.out.println("No eception in try block");
	}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println(e.getMessage());
		e.printStackTrace();
	}catch(ArithmeticException e) {
		e.printStackTrace();
	}catch(NullPointerException e) {
//		e.printStackTrace();
		System.out.println("exception caught"+e);
	}catch(Exception e) {
		System.out.println("ec"+e);
	}finally {
		System.out.println("this is finally block");
	}
	System.out.println("end of program...");
	}

}
