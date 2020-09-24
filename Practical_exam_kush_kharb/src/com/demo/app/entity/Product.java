package com.demo.app.entity;

public class Product {

	private int itemCode;
	private String name;
	private int unitPrice;
	private int quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int itemCode,String name,int unitPrice,int quantity) {
		// TODO Auto-generated constructor stub
		
		this.itemCode=itemCode;
		this.name=name;
		this.unitPrice=unitPrice;
		this.quantity=quantity;
		
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Product p=(Product) obj;
		
		if(p.getItemCode()==this.getItemCode()) {
			return true;
		}else {
			return false;
		}
	}
}