package com.demo.app.dao;

import java.util.List;

import com.demo.app.entity.Apparel;
import com.demo.app.entity.Electronics;
import com.demo.app.entity.FoodItems;
import com.demo.app.entity.Product;

/**
 * 
 * @author Kush Kharb
 *
 */

public interface ProductDao {


	/**
	 * 
	 * @param e - object of Electronice
	 * @return message
	 */

	String save(Electronics e) throws NoDuplicateEntryException;

	/**
	 * 
	 * @param f -object of FoodItems
	 * @return message
	 */
	String save(FoodItems f);
/**
 * 
 * @param a - Object of Apparel
 * @return message
 */
	String save(Apparel a);
	
	/**
	 * 
	 * @return
	 */
	public List<Product> listAll();


	
	
	
}
