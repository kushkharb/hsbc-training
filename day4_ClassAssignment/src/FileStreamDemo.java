import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

//	public static void main(String[] args) throws FileNotFoundException, IOException {
	public static void main(String[] args) {
	
	FileInputStream fis=null;
	FileOutputStream fos=null;
				
		try {
		File file=new File("d:\\temp\\io\\demo.txt");
		
		 fis = new FileInputStream(file);
		 fos = new FileOutputStream("demo_1.txt");
		
		int data = 0;
		while((data=fis.read())!=-1) {
//		while(true) {
//			data=fis.read();
//			if(data==-1)break;
			
			System.out.print((char) data);
			fos.write(data);
		}
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
			}catch(IOException e) {
				System.out.println(e);
			}finally {
				System.out.println("finallly");
				try {
					if(fis!=null&&fos!=null) {
					fis.close();
					fos.close();
					}
				}catch(IOException e) {
					System.out.println("streamed could not be closed"+e);
				}
			}
				System.out.println("end of task");
		}
	}

