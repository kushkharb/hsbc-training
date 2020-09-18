package com.demo.inheritance.demo2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person p =new Person(100,"kush");
	
	Employee e=new Employee(102,"arun",20000);
	
	System.out.println(p.getDetails());
	System.out.println(e.getDetails());
	
	}
	
}
