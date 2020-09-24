package com.demo.app.entity;

public class FoodItems extends Product {

	private String dom;
	private String doe;
	private String veg;
	
	public FoodItems() {
		// TODO Auto-generated constructor stub
	}
	
	public FoodItems(int itemCode,String name,int unitPrice,int quantity,String dom,String doe,String veg ) {
		
		super(itemCode,name,unitPrice,quantity);
		this.doe=doe;
		this.dom=doe;
		this.veg=veg;
	}

	public String getDom() {
		return dom;
	}

	public void setDom(String dom) {
		this.dom = dom;
	}

	public String getDoe() {
		return doe;
	}

	public void setDoe(String doe) {
		this.doe = doe;
	}

	public String getVeg() {
		return veg;
	}

	public void setVeg(String veg) {
		this.veg = veg;
	}
	
	
	
	
}
