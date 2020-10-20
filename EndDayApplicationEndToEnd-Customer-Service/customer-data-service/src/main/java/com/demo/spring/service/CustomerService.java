package com.demo.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.CustDao;
import com.demo.spring.dao.CustomerDao;
import com.demo.spring.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDao dao;
	
//	@Autowired
//	CustomerDaoJdbcImpl daoJdbc;
	
	@Autowired
	CustDao custDao;
	
	public List<Customer> getAllCustomers(){
//		ArrayList<Customer> list=new ArrayList<>(dao.getDb().values());
		ArrayList<Customer> list=new ArrayList<>(custDao.getAll());
		return list;
	}	
	public Customer getCustomerById(int id) throws Exception {
		if(dao.getDb().containsKey(id)) {
//		return dao.getDb().get(id);
			return custDao.findById(id);
		}
		else{
			throw new Exception();
		}
	}	
	public String addCustomer(Customer c) {
		if(dao.getDb().containsKey(c.getCustomerId())) {
			return "customer already exist";
		}else {
			dao.getDb().put(c.getCustomerId(),c);
			return "customer saved successfully";
		}
	}

}
