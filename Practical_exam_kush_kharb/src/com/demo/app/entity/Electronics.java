package com.demo.app.entity;

public class Electronics extends Product{

	private int warranty;
	
	public Electronics() {
		// TODO Auto-generated constructor stub
	}
	
	public Electronics(int itemCode,String name,int unitPrice,int quantity,int warranty) {
		// TODO Auto-generated constructor stub
		super(itemCode,name,unitPrice,quantity);
		this.warranty=warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	
	
	}
