package com.demo.app.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.app.dao.ProductDao;
import com.demo.app.entity.FoodItems;
import com.demo.app.entity.Product;

public class ProductDaoMapImplFood implements ProductDao {

	static Map<Integer,FoodItems> foodDB=new HashMap<>();

	public ProductDaoMapImplFood() {
		// TODO Auto-generated constructor stub
		foodDB.put(100,new FoodItems(100,"Milk",100,20,"21/05/2010","21/12/2020","yes"));
		foodDB.put(101,new FoodItems(101,"apple",200,40,"21/05/2010","21/12/2020","yes"));
		foodDB.put(102,new FoodItems(102,"meat",150,60,"21/05/2010","21/12/2020","no"));
		foodDB.put(103,new FoodItems(103,"curd",100,100,"21/05/2010","21/12/2020","yes"));
		foodDB.put(104,new FoodItems(104,"cake",200,20,"21/05/2010","21/12/2020","yes"));
	}
	

	
	@Override
	public String save(FoodItems f) {
		// TODO Auto-generated method stub
		if(foodDB.containsKey(f.getItemCode())) {
			return "f already exist";
		}else {
			foodDB.put(f.getItemCode(),f);
			return "f registed succ";
		}
	}

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
