package com.app.entity;

/**
 * 
 * @author Kush Kharb
 *
 */
public class Apparel {

	private int itemCode;
	private String name;
	private int unitPrice;
	private int quantity;
	private String size;
	private String material;
	
	public Apparel() {
		// TODO Auto-generated constructor stub
	}
	
	public Apparel(int itemCode,String name,int unitPrice,int quantity,String size,String material) {
		// TODO Auto-generated constructor stub

		this.itemCode=itemCode;
		this.name=name;
		this.unitPrice=unitPrice;
		this.quantity=quantity;
		this.size=size;
		this.material=material;
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
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		FoodItems p=(FoodItems) o;
		
		if(p.getItemCode()==this.getItemCode()) {
			return true;
		}else {
			return false;
		}}
}
