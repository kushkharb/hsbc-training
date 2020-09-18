package com.demo.Q1;

public class Eagle extends Bird{

	public Eagle(String name) {
		super(name);
	}
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("HI "+ name);
	}
}
