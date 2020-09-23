package com.demo.student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class StuSerializer {
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Student[] s =new Student[10];
		try {
		FileOutputStream fos= new FileOutputStream("stu.ser");
		ObjectOutputStream objOut=new ObjectOutputStream(fos);
		
		for(int i=1;i<10;i++) {
			s[i]=new Student(100+i,"kush"+i);
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i]!=null)
			{
				objOut.writeObject(s[i]);	
			}
		}
		objOut.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
