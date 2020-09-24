package com.demo.emp;


public class EmpApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		EmpDao dao = new EmpDaoFileSystemImpl();
		EmpService service = new EmpService(dao);
		
		String resp=service.registerEmp(101,"james","london",45000);
		System.out.println(resp);
	}

}
