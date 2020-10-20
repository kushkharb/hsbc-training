package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.entity.Customer;

public interface CustDao {
	
	 public Customer findById(int id);
	 public List<Customer> getAll();

}
