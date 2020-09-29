package com.demo.Q7;

public class MessagePrinter {

	public synchronized void print(String message) {

		System.out.print("["+message);
		
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("]");
	}
}
