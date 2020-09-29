package com.demo.Q5;

import com.demo.Q1.MyThread;

/**
 * 
 * @author Kush Kharb
 *
 * During Join method execution others threads including main will wait until its over.
 */
public class MainApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Main thread starts...");
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		
		t1.start();
		
		t1.join();

		t2.start();

		t2.join();
	
		System.out.println("Main thread Exits...");
	}

}
