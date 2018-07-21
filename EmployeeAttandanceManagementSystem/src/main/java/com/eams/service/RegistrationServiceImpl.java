/**
 * 
 */
package com.eams.service;

import java.sql.Date;

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
	public String generate(RegistrationDTO dto)throws Exception {
		RegistrationBO bo = null;
		RegistrationDAO dao = null;
		// prepare bo object to persistence data
		bo = new RegistrationBO();
		
		bo.setfName(dto.getfName());
		bo.setlName(dto.getlName());
		bo.setDob(dto.getDob());
		bo.setMobile(dto.getMobile());
		bo.setGender(dto.getGender());
		bo.setEmail(dto.getEmail());
		bo.setStreet(dto.getStreet());
		bo.setCity(dto.getCity());
		bo.setCountry(dto.getCountry());
		bo.setPin(dto.getPin());
		// use daoREG_ID FIRSTNAME  LASTNAME DOB MOBILE GENDER
		//EMAIL     STREET    CITY
		//STATE   COUNTRY    PIN
		dao = new RegistrationDAOImpl();
		int count = dao.insert(bo);
		if (count == 0)
			return "Registration failled";
		else
			return "Registration Succeded";
	}//generate(-,-)

}//class
