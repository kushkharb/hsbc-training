package day5;

import java.io.FileWriter;
import java.io.IOException;

public class FileStreamArrayDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String[] s=new String[20];
		
		for(int i=0;i<10;i++) {
			s[i]="line no"+i;
		}
		FileWriter fwriter=new FileWriter("demo_2.txt");
		int i=0;
		while(i<20) {
			if(s[i]!=null) {
			fwriter.write(s[i]+"\n");
			}
			i++;
		}
		fwriter.flush();
		
		
		

	}

}
