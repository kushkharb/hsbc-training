package com.demo.app.dao;

import com.demo.app.entity.Apparel;
import com.demo.app.entity.Electronics;
import com.demo.app.entity.FoodItems;

/**
 * 
 * @author Kush Kharb
 *
 */
public class ProductFactory {

	public static ProductDao getProduct(String dbname) {
		if(dbname.equals("food")) {
			return (ProductDao) new FoodItems();
		}else if(dbname.equals("apparel")) {
			return (ProductDao) new Apparel();
		}else if(dbname.equals("electronics")) {
			return (ProductDao) new Electronics();
		}else {
			return null;
		}
	}
}
