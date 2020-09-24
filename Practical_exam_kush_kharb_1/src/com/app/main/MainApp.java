package com.app.main;

import com.app.dao.ApparelDao;
import com.app.dao.DaoFactory;
import com.app.dao.ElectronicsDao;
import com.app.dao.FoodItemsDao;
import com.app.service.Service;
/**
 * 
 * @author Kush Kharb
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApparelDao adao = (ApparelDao) DaoFactory.getProductType("apparel");
		ElectronicsDao edao =(ElectronicsDao) DaoFactory.getProductType("electronics");
		FoodItemsDao fdao= (FoodItemsDao) DaoFactory.getProductType("food");
		
		Service service1=new Service(adao);
		Service service2=new Service(edao);
		Service service3=new Service(fdao);
		
		service1.printApparelList();
		
		System.out.println(service1.addApparel(999, "cap", 2000, 99, "Large", "cotton"));
		
		service1.printApparelList();
		
		service2.printElectronicsList();
		
		System.out.println(service2.addElectronic(555, "phone", 18000, 30, 24));
		
		service3.printFoodItemsList();
		
		System.out.println(service3.addFoodItems(666, "lassi", 30, 500, "21/05/2020", "21/11/2020", "yes"));
		
		service3.printFoodItemsList();
	}

}
