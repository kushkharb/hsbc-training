package com.demo.exceptionsBank;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double balance) {
		this.balance=balance;
	}
	
	public double withdraw(double amount){
		try {
		if(balance<amount) {
		throw new LowBalanceException("Low Balance");
			}else {
			balance= balance-amount;
			System.out.println("transaction successfull, nw="+balance);
		}
		}catch(LowBalanceException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
		return balance;
	}
	

}
