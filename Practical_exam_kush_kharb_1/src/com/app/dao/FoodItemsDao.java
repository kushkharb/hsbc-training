package com.app.dao;

import java.util.List;

import com.app.entity.FoodItems;

/**
 * 
 * @author Kush Kharb
 *
 */
public interface FoodItemsDao {

	/**
	 * 
	 * @param f is the object of foodItems class 
	 * @return message
	 * @throws NoDuplicateEntryException
	 */
	public String save(FoodItems f) throws NoDuplicateEntryException;
/**
 * 
 * @return list of all food items
 */
	public List<FoodItems> listAll();
}
