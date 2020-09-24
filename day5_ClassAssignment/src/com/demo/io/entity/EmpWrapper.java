package com.demo.io.entity;

import java.io.Serializable;

public class EmpWrapper implements Serializable {

	Emp[] empList =new Emp[20];

	public Emp[] getEmpList() {
		return empList;
	}

	public void setEmpList(Emp[] empList) {
		this.empList = empList;
	}
	
	
	
}
