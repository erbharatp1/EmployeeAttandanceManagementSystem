/**
 * 
 */
package com.eams.service;

import com.eams.bo.RegistrationBO;
import com.eams.dao.RegistrationDAO;
import com.eams.dao.RegistrationDAOImpl;
import com.eams.dto.RegistrationDTO;

/**
 * @author ErBharatp
 *
 */
public class RegistrationServiceImpl implements RegistrationService {

	@Override
	public String generate(RegistrationDTO dto) {
		RegistrationBO bo = null;
		RegistrationDAO dao = null;
		// prepare bo object to persistence data
		bo = new RegistrationBO();
		bo.setfName(dto.getfName());
		bo.setfName(dto.getlName());
		bo.setDob(dto.getDob());
		bo.setGender(dto.getGender());
		bo.setMobile(dto.getMobile());
	
		// use dao
		dao = new RegistrationDAOImpl();
		int count = dao.insert(bo);
		if (count == 0)
			return "Registration failled";
		else
			return "Registration Succeded";
	}//generate(-,-)

}//class
