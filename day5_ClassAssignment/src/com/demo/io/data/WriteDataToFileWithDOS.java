package com.demo.io.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteDataToFileWithDOS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileOutputStream fos =new FileOutputStream("mydata.dat",true);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos= new DataOutputStream(bos);
		
		dos.writeInt(100);
		dos.writeUTF("kush");
		dos.writeUTF("safidon");
		dos.writeDouble(45000);

		dos.close();
		
		
	}

}
