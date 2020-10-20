package com.demo.spring.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;

@Repository
public class CustomerDao {
	
	public static HashMap<Integer, Customer> db=new HashMap<>();
	
	public CustomerDao(){
		db.put(101, new Customer(101,"kush",99980788));
		db.put(102, new Customer(102,"loki",99980799));
		db.put(103, new Customer(103,"karan",99980777));
		db.put(104, new Customer(104,"abhi",99980755));
		db.put(105, new Customer(105,"shubhi",99980744));
	}

	public static HashMap<Integer, Customer> getDb() {
		return db;
	}

	public static void setDb(HashMap<Integer, Customer> db) {
		CustomerDao.db = db;
	}

	
}
