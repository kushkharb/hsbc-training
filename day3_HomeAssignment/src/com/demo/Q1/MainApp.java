package com.demo.Q1;

/**
 * 
 * @author DELL
 *
 */
public class MainApp {

	public static void main(String[] args) {

		Bird b;
		
		Duck d=new Duck("duck");
		Eagle e=new Eagle("eagle");
		Parrot p=new Parrot("parrot");
		
		b=d;
		b.getInfo();
		b=e;
		b.getInfo();
		b=p;
		b.getInfo();
		
	}

}
