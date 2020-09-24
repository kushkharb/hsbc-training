package com.demo.exceptionsBank;

public class LowBalanceException extends RuntimeException {

	public LowBalanceException() {
		// TODO Auto-generated constructor stub
	}
	public LowBalanceException(String messege) {
		// TODO Auto-generated constructor stub
		super(messege);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "your balance is low";
	}
	
}
