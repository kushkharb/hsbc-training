package com.demo.io.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.Emp;

public class MyEmpSerializer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream fos= new FileOutputStream("emp.ser");
		ObjectOutputStream objOut=new ObjectOutputStream(fos);
		
		for(int i=1;i<11;i++) {
	
		Emp emp=new Emp(100+i,"kush"+i,"London"+i,45000);
		
		objOut.writeObject(emp);
		}
		objOut.close();
		
		System.out.println("Emp serialized...");
	}

}
