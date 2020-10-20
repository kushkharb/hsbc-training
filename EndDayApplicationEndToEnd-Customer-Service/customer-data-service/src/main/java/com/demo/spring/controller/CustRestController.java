package com.demo.spring.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.entity.Customer;
import com.demo.spring.service.CustomerService;

@RestController
@CrossOrigin
public class CustRestController {
	@Autowired
	CustomerService service;
	
	@GetMapping(path ="/customer",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<Customer>> listAll(){
					ArrayList<Customer> list= (ArrayList<Customer>) service.getAllCustomers();
					return ResponseEntity.ok(list);
	}
	
	@GetMapping(path="/customer/find/{id}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity getCustomerDetails(@PathVariable("id") int id) {	
		try {
		return  ResponseEntity.ok(service.getCustomerById(id)) ;	
		}catch(Exception e) {
			return ResponseEntity.ok("Customer Not Exist");
		}
	}
	
	@PostMapping(path = "/customer/save",produces = MediaType.TEXT_PLAIN_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmp(@RequestBody Customer c){
		return ResponseEntity.ok(service.addCustomer(c));
	}

}
