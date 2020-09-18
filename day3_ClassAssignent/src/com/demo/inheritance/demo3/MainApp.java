package com.demo.inheritance.demo3;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figure ref;
		
		Triangle t=new Triangle(10,20);
		Rectangle r=new Rectangle(20,30);
		
		ref=t;
		ref.area();
		
		ref=r;
		ref.area();
	}

}
