package com.demo.Q1;

public class Duck extends Bird {

	
	public Duck(String name) {
		super(name);
	}
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("HI "+ name);
	}
}
