package com.demo.io.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.Emp;
import com.demo.io.entity.EmpWrapper;

public class MyEmpArraySerializer {

	public static void main(String[] args) throws Exception {

		Emp[] empList =new Emp[10];
		FileOutputStream fos= new FileOutputStream("emp2.ser");
		ObjectOutputStream objOut=new ObjectOutputStream(fos);
		
		for(int i=1;i<10;i++) {
			empList[i]=new Emp(100+i,"kush"+i,"London"+i,45000);
		}
//		EmpWrapper empWrapper=new EmpWrapper();
//		empWrapper.setEmpList(empList);		
//		objOut.writeObject(empWrapper);
		objOut.writeObject(empList);
		objOut.close();
		
		System.out.println("Emp serialized...");
	}

}
