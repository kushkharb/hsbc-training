package com.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.dao.ElectronicsDao;
import com.app.dao.NoDuplicateEntryException;
import com.app.entity.Electronics;
/**
 * 
 * @author Kush Kharb
 *
 */
public class ElectronicsDaoImpl implements ElectronicsDao {

static Map<Integer,Electronics> elDB=new HashMap<>();
	
	public ElectronicsDaoImpl() {
		// TODO Auto-generated constructor stub
		elDB.put(106,new Electronics(106,"Tv",20000,50,12));
		elDB.put(107,new Electronics(107,"watch",2000,40,12));
		elDB.put(108,new Electronics(108,"mobile",18000,30,12));
		elDB.put(109,new Electronics(109,"charger",200,20,12));
		elDB.put(110,new Electronics(110,"macbook",2000000,10,24));	
}
	@Override
	public String save(Electronics e) throws NoDuplicateEntryException {
		// TODO Auto-generated method stub
		try {
			if(elDB.containsKey(e.getItemCode())) {
				throw new NoDuplicateEntryException();
			}else {
				elDB.put(e.getItemCode(),e);
				return "product registed successfully";
			}
			
		}catch(NoDuplicateEntryException e1) {
			return e1.getMessage();
		}
	}

	@Override
	public List<Electronics> listAll() {
		// TODO Auto-generated method stub
		ArrayList<Electronics> eList = new  ArrayList(elDB.values());
		return eList;
	}

}
