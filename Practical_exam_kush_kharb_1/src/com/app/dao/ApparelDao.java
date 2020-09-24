package com.app.dao;

import java.util.List;
import com.app.entity.Apparel;

/**
 * 
 * @author Kush Kharb
 *
 */
public interface ApparelDao {
/**
 * 
 * @param a object  of Appreal class
 * @return message
 * @throws NoDuplicateEntryException
 */
	public String save(Apparel a)throws NoDuplicateEntryException;
	
	/**
	 * 
	 * @return list of all entries
	 */
	public List<Apparel> listAll();
}
