package com.demo.instanceofQ6;

public class ClassBWithMain extends ClassA {
	
	public String y="hello";

	public static void main(String[] args) {

		ClassBWithMain o=new ClassBWithMain();
		
		System.out.println(o instanceof ClassBWithMain);
		System.out.println(o instanceof ClassA);
		System.out.println(o instanceof Object);
//		System.out.println(o instanceof String);

	}
}
