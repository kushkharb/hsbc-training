package com.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStream {

	public static void main(String[] args)throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("hiiii");
		
		File file=new File("d:\\temp\\io\\demo.txt");
		
		System.out.println("byyyeeee");
//		FileInputStream fis = new FileInputStream(file);
		
		FileInputStream f = new FileInputStream(file);
		
		int data = 0;

		
		while(true) {
			data=f.read();
			if(data==-1)break;
			
			System.out.print((char) data);
			
		}
	}

}
