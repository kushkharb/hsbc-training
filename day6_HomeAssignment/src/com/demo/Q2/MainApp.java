package com.demo.Q2;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main thread starts...");
		
		MyThread a1=new MyThread();
		MyThread a2=new MyThread();
		MyThread a3=new MyThread();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a2);
		Thread t3=new Thread(a3);
		
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
