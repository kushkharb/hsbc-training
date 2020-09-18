package com.demo.TypeCastingQ7;

public class ClassB extends ClassA {

	public ClassB(String a,String b) {
		super(a,b);
	}
	public String getInfo() {
		return super.getInfo()+" class B";
	}
}
