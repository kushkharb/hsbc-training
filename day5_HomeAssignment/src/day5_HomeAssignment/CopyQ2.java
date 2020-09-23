package day5_HomeAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		String file1=s.next();
		String file2=s.next();
		
		try {
			if ((!new File(file1).exists())) {
				System.out.println("file does not exist.");
		}else {
			BufferedReader br=new BufferedReader(new FileReader(file1));
			BufferedWriter bw=new BufferedWriter(new FileWriter(file2));
			 String line="";
			  while((line=br.readLine())!=null)
			  {
				  bw.write(line+"\n");
			  }
			  br.close();
			  bw.close();
			  System.out.println("file copied");
		}
		}catch(IOException e) {
			System.out.println(e);
		}}

	}


