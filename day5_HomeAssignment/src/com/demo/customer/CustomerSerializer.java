package com.demo.customer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class CustomerSerializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		FileOutputStream fos= new FileOutputStream("customer.ser");
		ObjectOutputStream objOut=new ObjectOutputStream(fos);
		
		for(int i=1;i<4;i++) {
			Customer c=new Customer(100+i,"kush"+i,"Safidon");
			objOut.writeObject(c);	

		}
		objOut.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
