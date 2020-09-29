package com.demo.Q8;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread t1 = new MyThread();
		t1.start();
		MyThreadRunnable r1 = new MyThreadRunnable();
		Thread t2 = new Thread(r1);
		t2.start();

		t1.join();
		t2.join();
	}

}
