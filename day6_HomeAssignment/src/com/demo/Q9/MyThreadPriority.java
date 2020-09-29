package com.demo.Q9;

public class MyThreadPriority extends Thread {
	
	@Override
	public void run() {
	try {
			System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
			Thread.sleep(2000);
		
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
