package com.demo.Q3;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnable r1=new MyRunnable();
		Thread t1=new Thread(r1);
		t1.start();
		
		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
