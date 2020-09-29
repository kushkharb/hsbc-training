package com.demo.Q1;


public class MainApp {

	public static void main(String[] args) {

		System.out.println("Main thread starts...");
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		t1.start();
		t2.start();
		t3.start();
		try {
		t1.join();
		t2.join();
		t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread Exits...");
	}

}
