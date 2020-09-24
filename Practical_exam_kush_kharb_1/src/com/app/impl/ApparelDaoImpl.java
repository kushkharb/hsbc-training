package com.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.dao.ApparelDao;
import com.app.dao.NoDuplicateEntryException;
import com.app.entity.Apparel;
/**
 * 
 * @author Kush Kharb
 *
 */
public class ApparelDaoImpl implements ApparelDao {

	
	static Map<Integer,Apparel> appDB=new HashMap<>();

	public ApparelDaoImpl() {		
		appDB.put(111,new Apparel(111,"tshirt",600,20,"Large","cotton"));
		appDB.put(112,new Apparel(112,"shirt",1000,20,"Large","cotton"));
		appDB.put(113,new Apparel(113,"shorts",200,20,"small","cotton"));
		appDB.put(114,new Apparel(114,"jacket",5000,20,"Large","denim"));
		appDB.put(115,new Apparel(115,"hat",600,20,"Large","cotton"));	
	}
	@Override
	public String save(Apparel a) throws NoDuplicateEntryException {
		// TODO Auto-generated method stub
		try {
			if(appDB.containsKey(a.getItemCode())) {
				throw new NoDuplicateEntryException();
			}else {
				appDB.put(a.getItemCode(),a);
				return "product registed successfully";
			}
			
		}catch(NoDuplicateEntryException e1) {
			return e1.getMessage();
		}
	}

	@Override
	public List<Apparel> listAll() {
		ArrayList<Apparel> aList=new ArrayList(appDB.values());
		return aList;	
	}

}
