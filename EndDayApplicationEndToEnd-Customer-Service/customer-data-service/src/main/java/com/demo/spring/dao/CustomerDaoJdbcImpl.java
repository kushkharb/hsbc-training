package com.demo.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;

@Repository
public class CustomerDaoJdbcImpl implements CustDao{
	
	@Autowired
	JdbcTemplate jt;
	
	@Override
	public Customer findById(int id) {
		Customer customer =	jt.queryForObject("select * from CUSTOMER where custId="+id,new RowMapper<Customer>() {
			
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {			
				return new Customer( rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		});
    return customer;
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> custList =	jt.query("select * from CUSTOMER",new RowMapper<Customer>() {			
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {			
				return new Customer( rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		});
		return custList;
	}
	

}
