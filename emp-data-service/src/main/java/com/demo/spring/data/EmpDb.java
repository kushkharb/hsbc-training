package com.demo.spring.data;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.hsbc.tr.app.entity.Emp;

@Repository
public class EmpDb {

	private static HashMap<Integer, Emp> db=new HashMap<>();
	
	public EmpDb() {
		db.put(100, new Emp(100,"kush","safidon",45000));
		db.put(101, new Emp(102,"loki","paniapat",50000));
		db.put(102, new Emp(103,"karan","delhi",10000));
		db.put(103, new Emp(104,"poki","sonipat",50));
		db.put(104, new Emp(105,"kirti","safidon",45000));
		db.put(105, new Emp(106,"munna","safidon",45000));
		db.put(106, new Emp(107,"kala","sonipat",9000000));
	}
	public static HashMap<Integer, Emp> getDb() {
		return db;
	}
	public static void setDb(HashMap<Integer, Emp> db) {
		EmpDb.db = db;
	}
}
