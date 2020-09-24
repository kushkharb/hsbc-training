package com.app.dao;

import java.util.List;

import com.app.entity.Electronics;

/**
 * 
 * @author Kush Kharb
 *
 */
public interface ElectronicsDao {
	
	/**
	 * 
	 * @param e is the object of electronics class
	 * @return message
	 * @throws NoDuplicateEntryException
	 */
	public String save(Electronics e)throws NoDuplicateEntryException;
	
	/**
	 * 
	 * @return list of  all electronics
	 */
	public List<Electronics> listAll();

}
