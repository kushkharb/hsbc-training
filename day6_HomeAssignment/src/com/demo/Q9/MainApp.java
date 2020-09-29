package com.demo.Q9;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {

		MyThreadPriority t1 = new MyThreadPriority();
		MyThreadPriority t2 = new MyThreadPriority();
		t1.setPriority(4);
		t2.setPriority(8);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
	}

}
