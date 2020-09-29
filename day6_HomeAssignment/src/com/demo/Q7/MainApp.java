package com.demo.Q7;



public class MainApp {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main thread starts...");
		MessagePrinter printer=new MessagePrinter();
		
		Thread t2=new Thread(new PrintWorker("hello",printer));
		Thread t3=new Thread(new PrintWorker("good",printer));
		
		t2.start();
		t3.start();
		
		t2.join();
		t3.join();
		
		
		System.out.println("Main thread Exits...");
	}

}
