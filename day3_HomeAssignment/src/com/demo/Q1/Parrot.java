package com.demo.Q1;

public class Parrot extends Bird{
	
	public Parrot(String name) {
		super(name);
	}
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("HI "+ name);
	}
}
