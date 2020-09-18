package com.demo.interfaces;

import com.demo.impl.mysql.MySqlDB;
import com.demo.impl.oracle.OracleDB;

public class MyConnFactory {
	public static MyConnection getMyConnection(String dbname) {
		if(dbname.equals("oracle")) {
			return new OracleDB();
		}else if(dbname.equals("mysql")) {
			return new MySqlDB();
		}else {
			return null;
		}
	}

}
