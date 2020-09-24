package com.demo.exceptionsBank;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
		BankAccount a=new BankAccount(10000);
		a.withdraw(500);
		a.withdraw(8000);
		a.withdraw(2000);
//		}catch(Exception e) {
//			System.out.println("faliur due to "+ e);
//		}
		System.out.println("done successfully...");
		
	}

}
