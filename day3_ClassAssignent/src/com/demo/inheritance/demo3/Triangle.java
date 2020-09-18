package com.demo.inheritance.demo3;

public class Triangle extends Figure {
	
	public Triangle(int dim1,int dim2) {
		// TODO Auto-generated constructor stub
		super(dim1,dim2);
	}
	
	@Override
	public double area() {
		System.out.println("tri"+(dim1*dim2)/2);
		return (dim1*dim2)/2;
	}
	
}
