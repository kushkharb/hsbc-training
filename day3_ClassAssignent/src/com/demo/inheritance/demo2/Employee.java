package com.demo.inheritance.demo2;

public class Employee extends Person {
	private double salary;
	
	public Employee(int id,String name,double salary) {
		super(id,name);
		this.salary=salary;
	}
	@Override
	public String getDetails() {
		return super.getDetails()+" "+salary;
		//overridden method
	}
	
	public void fun() {
		System.out.println("this is funnnnn");
	}
	
	@Override
	public String toString() {
		return "This is "+this.getClass().getSimpleName();
	}

//@Override
//public String getDetails() {
//	// TODO Auto-generated method stub
//	return super.getDetails();
//}
}
