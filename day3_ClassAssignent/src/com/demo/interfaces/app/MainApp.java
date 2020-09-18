package com.demo.interfaces.app;

import com.demo.impl.mysql.MySqlDB;

import com.demo.impl.oracle.OracleDB;
import com.demo.interfaces.MyConnFactory;
import com.demo.interfaces.MyConnection;

public class MainApp {
	public static void main(String[] args) {
//		MyConnection con = new OracleDB();
//		MyConnection con =new MySqlDB();
		
		MyConnection con=MyConnFactory.getMyConnection("mysql");
		
		System.out.println(MyConnection.releaseVer);
		System.out.println(con.getConnectionInfo());
		System.out.println(con.getDbDetails());
	}

}
