package com.app.service;

import com.app.dao.ApparelDao;
import com.app.dao.ElectronicsDao;
import com.app.dao.FoodItemsDao;
import com.app.dao.NoDuplicateEntryException;
import com.app.entity.Apparel;
import com.app.entity.Electronics;
import com.app.entity.FoodItems;
/**
 * 
 * @author Kush Kharb
 *
 */
public class Service {

	ElectronicsDao edao;
	ApparelDao adao;
	FoodItemsDao fdao;
	
	public Service(ElectronicsDao edao) {
		this.edao=edao;
	}
	public Service(ApparelDao adao) {
		this.adao=adao;
	}
	public Service(FoodItemsDao fdao) {
		this.fdao=fdao;
	}
	
	public String addElectronic(int itemCode,String name,int unitPrice,int quantity,int warranty) {
		try {
		return edao.save(new Electronics(itemCode, name, unitPrice, quantity, warranty));
		}catch(NoDuplicateEntryException e) {
			return e.getMessage();
		}
	}
	public String addApparel(int itemCode,String name,int unitPrice,int quantity,String size,String material) {
		try {
			return adao.save(new Apparel(itemCode, name, unitPrice, quantity, size,material));
		}catch(NoDuplicateEntryException e) {
			return e.getMessage();
		}
	}
	public String addFoodItems(int itemCode,String name,int unitPrice,int quantity,String dom,String doe,String veg ) {
		try {
			return fdao.save(new FoodItems(itemCode, name, unitPrice, quantity, dom, doe, veg));
		}catch(NoDuplicateEntryException e) {
			return e.getMessage();
		}
	}
	
	public void printElectronicsList() {
		for(Electronics e : edao.listAll()){
			System.out.println(e.getItemCode()+" "+e.getName()+" "+e.getQuantity()+" "+e.getUnitPrice()+" "+e.getWarranty());
		}
	}
	public void printApparelList() {
		for(Apparel a : adao.listAll()){
			System.out.println(a.getItemCode()+" "+a.getName()+" "+a.getQuantity()+" "+a.getUnitPrice()+" "+a.getSize()+" "+a.getMaterial());
		}
	}
	public void printFoodItemsList() {
		for(FoodItems f : fdao.listAll()){
			System.out.println(f.getItemCode()+" "+f.getName()+" "+f.getQuantity()+" "+f.getUnitPrice()+" "+f.getDom()+" "+f.getDom()+" "+f.getVeg());
		}
	}
	


}




	
	



