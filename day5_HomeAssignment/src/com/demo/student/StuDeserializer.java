package com.demo.student;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StuDeserializer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream objIn=null;
		try {
			 objIn=new ObjectInputStream(new FileInputStream("stu.ser"));
			
			while(true)
			{
				Student s=(Student)objIn.readObject();
				System.out.println(s);
			}
		}catch(EOFException e) {
			System.out.println(e);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}finally
		{
			try {
				if(objIn!=null)
				{
					objIn.close();
				}
				
			} catch (IOException e) {
				
				System.out.println(e);
			}
		}
	}

}
