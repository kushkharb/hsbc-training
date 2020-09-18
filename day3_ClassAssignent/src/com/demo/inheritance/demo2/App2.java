package com.demo.inheritance.demo2;

public class App2 {
	
	public static void printDetails(Person p) {
		System.out.println(p.getDetails());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person p =new Person(100,"kush");
	
	Employee e=new Employee(102,"arun",20000);
	
	System.out.println(p.getDetails());
	
	Person p2 = new Employee(103,"loki",88000);
	System.out.println(p2.getDetails());
//	p2.fun();
	
	Person p3 = new TraineeEmp(105,"alag",660000,"perfect");
	System.out.println(p3.getDetails());
	
	TraineeEmp t =new TraineeEmp(104,"chanpak",56000,"good");
	
	printDetails(t);
	printDetails(e);
	
	Object o=e;
	System.out.println(o.getClass().getName());
	
	Person p1=e;
	System.out.println(p1.getClass().getName());
	
	System.out.println(e);
	
	}
	
}
