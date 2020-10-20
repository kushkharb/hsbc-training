package com.demo.spring.config;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.demo.spring.dao.Emp;
import com.demo.spring.dao.EmpDao;

public class JdbcDaoQueryOne {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JdbcConfig.class);		
	
		EmpDao dao=ctx.getBean(EmpDao.class);
		Emp e=dao.findById(101);
		System.out.println(e.getEmpId()+" "+e.getName());
	}

}
