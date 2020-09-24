package com.demo.io.ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.io.entity.Emp;

public class MyEmpDeserializer {

	public static void main(String[] args) throws Exception{

		FileInputStream fis=new FileInputStream("emp.ser");
		ObjectInputStream objIn=new ObjectInputStream(fis);
		
//		Object obj =objIn.readObject();
//		System.out.println(obj.getClass().getName());
//		
//		Emp e=(Emp)obj;
		
		try {
			while(true) {
			Emp e=(Emp) objIn.readObject();
			System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getCity());
			}
		}catch(EOFException e) {
			System.out.println("Done....");
		}
		
		objIn.close();
		
//		System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getCity());
		
	}

}
