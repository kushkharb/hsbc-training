package com.demo.app.dao;

public class NoDuplicateEntryException  extends Exception{
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "this product already exist";
}
}
