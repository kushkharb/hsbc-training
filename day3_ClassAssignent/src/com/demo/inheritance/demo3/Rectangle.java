package com.demo.inheritance.demo3;

public class Rectangle extends Figure {

	public Rectangle(int dim1,int dim2) {
		super(dim1,dim2);
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		System.out.println("rect ="+dim1*dim2);
		return dim1*dim2;
	}
}
