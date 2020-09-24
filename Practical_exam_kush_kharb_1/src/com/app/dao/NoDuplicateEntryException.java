package com.app.dao;

/**
 * 
 * @author Kush Kharb
 *
 */
public class NoDuplicateEntryException  extends Exception{

	@Override
public String toString() {
	return "this product already exist";
}
}
