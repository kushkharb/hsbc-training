package com.demo.app.entity;

public class Apparel extends Product {

	private String size;
	private String material;
	
	public Apparel() {
		// TODO Auto-generated constructor stub
	}
	
	public Apparel(int itemCode,String name,int unitPrice,int quantity,String size,String material) {
		// TODO Auto-generated constructor stub
		super(itemCode,name,unitPrice,quantity);
		this.size=size;
		this.material=material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
