package com.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.dao.FoodItemsDao;
import com.app.dao.NoDuplicateEntryException;
import com.app.entity.FoodItems;
/**
 * 
 * @author Kush Kharb
 *
 */
public class FoodItemsDaoImpl implements FoodItemsDao {

	static Map<Integer,FoodItems> foodDB=new HashMap<>();

	public FoodItemsDaoImpl() {
		foodDB.put(100,new FoodItems(100,"Milk",100,20,"21/05/2010","21/12/2020","yes"));
		foodDB.put(101,new FoodItems(101,"apple",200,40,"21/05/2010","21/12/2020","yes"));
		foodDB.put(102,new FoodItems(102,"meat",150,60,"21/05/2010","21/12/2020","no"));
		foodDB.put(103,new FoodItems(103,"curd",100,100,"21/05/2010","21/12/2020","yes"));
		foodDB.put(104,new FoodItems(104,"cake",200,20,"21/05/2010","21/12/2020","yes"));
		}
	
	@Override
	public String save(FoodItems f) throws NoDuplicateEntryException {
		// TODO Auto-generated method stub
		try {
			if(foodDB.containsKey(f.getItemCode())) {
				throw new NoDuplicateEntryException();
			}else {
				foodDB.put(f.getItemCode(),f);
				return "product registed successfully";
			}
			
		}catch(NoDuplicateEntryException e1) {
			return e1.getMessage();
		}
	}

	@Override
	public List<FoodItems> listAll() {
		// TODO Auto-generated method stub
		ArrayList<FoodItems> fList=new ArrayList(foodDB.values());
		return fList;
	}

}
