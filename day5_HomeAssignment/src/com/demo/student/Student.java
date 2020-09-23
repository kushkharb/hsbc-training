package com.demo.student;

import java.io.Serializable;

public class Student implements Serializable {

	private int rollNo;
	private String name;
	
	
	public Student(int rollNo, String name) {

		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return rollNo+" "+name;
	}
}

