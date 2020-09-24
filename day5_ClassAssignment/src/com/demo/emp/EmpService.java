package com.demo.emp;

public class EmpService {
	EmpDao dao;
	
	public EmpService(EmpDao dao) {
		this.dao=dao;
	}

	public String  registerEmp(int id ,String name,String city,double salary) throws Exception {
		String resp = dao.save(new Emp(id,name,city,salary));
		return resp;
	}
}
