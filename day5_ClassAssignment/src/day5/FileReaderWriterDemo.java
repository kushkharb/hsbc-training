package day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

//	public static void main(String[] args) throws FileNotFoundException, IOException {
	public static void main(String[] args) {
	
	FileReader fis=null;
	FileWriter fos=null;
	BufferedReader bis=null;
	BufferedWriter bos=null;
				
		try {
		File file = new File("d:\\temp\\io\\demo.txt");
		 fis = new FileReader(file);
		 fos = new FileWriter("demo_1.txt",true);
		 
		 bis=new BufferedReader(fis);
		 bos=new BufferedWriter(fos);
		
		int data = 0;
		while((data=bis.read())!=-1) {
			
			System.out.print((char) data);
			bos.write(data);
//			bos.flush();
		}
		}catch(FileNotFoundException e) {
			System.out.println("file not found..");
			}catch(IOException e) {
				System.out.println(e);
			}finally {
				System.out.println("finallly..");
				try {
//					if(fis!=null&&fos!=null||bos!=null||bis!=null) {
					if(bos!=null||bis!=null) {

//					fis.close();
//					fos.close();
					bis.close();
					bos.close();
					}
				}catch(IOException e) {
					System.out.println("streamed could not be closed"+e);
				}
			}
				System.out.println("end of task");
		}
	}

