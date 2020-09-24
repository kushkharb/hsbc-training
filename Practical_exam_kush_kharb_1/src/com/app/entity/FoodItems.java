package com.app.entity;
/**
 * 
 * @author Kush Kharb
 *
 */
public class FoodItems {

	
	private int itemCode;
	private String name;
	private int unitPrice;
	private int quantity;
	private String dom;
	private String doe;
	private String veg;
	
	public FoodItems() {
		// TODO Auto-generated constructor stub
	}
	
public FoodItems(int itemCode,String name,int unitPrice,int quantity,String dom,String doe,String veg ) {
		
	this.itemCode=itemCode;
	this.name=name;
	this.unitPrice=unitPrice;
	this.quantity=quantity;
		this.doe=doe;
		this.dom=doe;
		this.veg=veg;
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

@Override
public boolean equals(Object o) {
	// TODO Auto-generated method stub
	FoodItems p=(FoodItems) o;
	
	if(p.getItemCode()==this.getItemCode()) {
		return true;
	}else {
		return false;
	}
}
}
