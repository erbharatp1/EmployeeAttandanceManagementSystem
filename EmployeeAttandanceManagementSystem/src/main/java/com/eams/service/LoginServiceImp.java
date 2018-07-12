package com.eams.service;

import com.eams.bo.LoginBO;
import com.eams.dao.LoginDAO;
import com.eams.dao.LoginDAOImp;
import com.eams.dto.LoginDTO;
import com.eams.service.LoginService;

public class LoginServiceImp implements LoginService {

	@Override
	public String genetrateResult(LoginDTO dto) {

		
		String result = null;
		LoginBO bo = null;
		LoginDAO dao = null;
		int count = 0;
		// use b.logic to calculate total,avg, results
		
		// Prepare BO class Object having persistable data
		bo = new LoginBO();
		bo.setUsername(dto.getUsername());
		bo.setPassword(dto.getPassword());
		//bo.setUserType(dto.getUserType());
		
	//	user=dto.getUserType();
		//System.out.println("UserType From:Service   "+user);
		// use DAO
		dao = new LoginDAOImp();
		try {
				count = dao.insert(bo);
		if(count==0)
			return "Registration failed";
		else
			return "Registration succeded and Result: "+result;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	

}
