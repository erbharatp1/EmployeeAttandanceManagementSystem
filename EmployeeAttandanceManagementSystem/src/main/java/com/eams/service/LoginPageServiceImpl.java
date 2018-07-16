/**
 * 
 */
package com.eams.service;

import com.eams.bo.LoginPageBO;
import com.eams.dao.LoginPageDAO;
import com.eams.dto.LoginPageDTO;

/**
 * @author ErBharatp
 *
 */
public class LoginPageServiceImpl implements LoginPageService {

	@Override
	public String valid(LoginPageDTO dto) {
		LoginPageBO bo = null;
		String result = null;
		LoginPageDAO dao = null;
	
		bo = new LoginPageBO();
		bo.setUname(dto.getUname());
		bo.setPwd(dto.getPwd());
		// use dao
		dao = new LoginPageDAO();
	int	count = dao.login(bo);
		if(count==0)
		return "f";
			else		
			return "t";

	}//method

}//class
