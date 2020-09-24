package com.demo.io.entity;

import java.io.RandomAccessFile;

public class RAFDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf=new RandomAccessFile("d:\\temp\\io\\lion.txt","r");
		printData(10,raf);
		
	
	}
		private static void printData(int seekPoint,RandomAccessFile rf) throws Exception {
		rf.seek(150);
		int x=0;
		while((x=rf.read())!=-1){
			System.out.print((char)x);
		}}
	

}
