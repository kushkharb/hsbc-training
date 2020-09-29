package com.demo.Q8;

public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
				Thread.sleep(5000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
