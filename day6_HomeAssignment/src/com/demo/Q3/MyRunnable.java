package com.demo.Q3;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			for(int i = 1; i < 21; i++) {
				System.out.println(i);
				Thread.sleep(500);
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
