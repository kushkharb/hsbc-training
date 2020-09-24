package com.app.dao;

import com.app.entity.Apparel;
import com.app.entity.Electronics;
import com.app.entity.FoodItems;
import com.app.impl.ApparelDaoImpl;
import com.app.impl.ElectronicsDaoImpl;
import com.app.impl.FoodItemsDaoImpl;

/**
 * 
 * @author Kush Kharb
 *
 */
public class DaoFactory {
public static Object getProductType(String dbname) {
	if(dbname.equals("food")) {
		return  new FoodItemsDaoImpl();
	}else if(dbname.equals("apparel")) {
		return  new ApparelDaoImpl();
	}else if(dbname.equals("electronics")) {
		return new ElectronicsDaoImpl();
	}else {
		return null;
	}
}}
