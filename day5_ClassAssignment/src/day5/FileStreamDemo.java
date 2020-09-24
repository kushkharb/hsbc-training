package day5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args)throws FileNotFoundException, IOException {
	
	FileInputStream fis=null;
	FileOutputStream fos=null;
	BufferedInputStream bis=null;
	BufferedOutputStream bos=null;
				
		try {
		File file = new File("d:\\temp\\io\\demo.txt");
		
        boolean exists = file.exists(); 
        System.out.println(exists);
        
		 fis = new FileInputStream(file);
		 fos = new FileOutputStream("demo_1.txt",true);
		 
		 bis=new BufferedInputStream(fis);
		 bos=new BufferedOutputStream(fos);
		
		int data = 0;
		while((data=bis.read())!=-1) {
			
			System.out.print((char) data);
			bos.write(data);
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

