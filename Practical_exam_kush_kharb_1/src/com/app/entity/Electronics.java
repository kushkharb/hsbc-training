package com.app.entity;

/**
 * 
 * @author Kush Kharb
 *
 */
public class Electronics {

	private int itemCode;
	private String name;
	private int unitPrice;
	private int quantity;
	private int warranty;
	
	public Electronics() {
		// TODO Auto-generated constructor stub
	}
	
	public Electronics(int itemCode,String name,int unitPrice,int quantity,int warranty) {
		// TODO Auto-generated constructor stub
		this.itemCode=itemCode;
		this.name=name;
		this.unitPrice=unitPrice;
		this.quantity=quantity;
		this.warranty=warranty;
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

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	@Override
	public boolean equals(Object o) {
		Electronics p=(Electronics) o;
		
		if(p.getItemCode()==this.getItemCode()) {
			return true;
		}else {
			return false;
		}
	}
}
