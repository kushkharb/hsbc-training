package com.demo.emp;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.ObjectOutputStream;

public class EmpDaoFileSystemImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		// TODO Auto-generated method stub
		
//		FileOutputStream fos =new FileOutputStream("emp.csv");
//		ObjectOutputStream objOut=new ObjectOutputStream(fos);	
//		objOut.writeObject(e);	
//		return "object saved successfully";
		FileWriter fw=null;
		FileReader fr=null;
		BufferedReader br=null;
		String message="emp not written";
		try {
			fr=new FileReader("emp.txt");
			br=new BufferedReader(fr);
			String line="";
			while((line=br.readLine())!=null) {
				if(line.contains(""+e.getEmpId())) {
					message="Emp already exist";
					
					//modify the code to throw EmpExistsExcception("message"),rethrow it to service layer(EmpService)
					return message;
				}}
			fw=new FileWriter("emp.txt",true);
			String empData=e.getName()+","+e.getEmpId()+","+e.getCity()+","+e.getSalary()+"\n";
			fw.write(empData);
			fw.flush();
			message="emp Written to file";
		}
		catch(Exception ex) {
			ex.printStackTrace();
			}
		finally {
				try {
					if(fr!=null) {
						fr.close();
					}
				}catch(IOException e1) {
					e1.printStackTrace();
				}
			}
		return message;
		}

}
