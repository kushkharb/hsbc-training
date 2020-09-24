package com.demo.io.entity;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndWriteEmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		BufferedReader br=null;
		try {
		 fr = new FileReader("d:\\temp\\io\\emp.txt");
		br=new BufferedReader(fr);
		String line="";
		 
		 while((line=br.readLine())!=null) {
//			 String line=br.readLine();
			 System.out.println(line);
			 
			 String[] cols=line.split(",");
			 int id=Integer.parseInt(cols[3]);
			 double sal=Double.parseDouble(cols[3]);
			 Emp e=new Emp(id,cols[1],cols[2],sal);
			 System.out.println(e.getEmpId()+" "+e.getName());
		 }
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(EOFException e) {
			System.out.println("done reding..");
		}catch(IOException e) {
			System.out.println(e);
		}
		
		}

}
