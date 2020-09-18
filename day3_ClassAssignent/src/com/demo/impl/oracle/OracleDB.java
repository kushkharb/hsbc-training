package com.demo.impl.oracle;

import com.demo.interfaces.MyConnection;

public class OracleDB implements MyConnection {
	
	@Override
	public String getConnectionInfo() {
		// TODO Auto-generated method stub
		return "connection establised succ";
	}
	
	@Override
	public String getDbDetails() {
		// TODO Auto-generated method stub
		return "Oracle CB 13c";
	}

}
