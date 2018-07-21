/**
 * 
 */
package com.eams.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.imageio.spi.RegisterableService;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eams.bo.RegistrationBO;
import com.eams.dao.RegistrationDAO;
import com.eams.dto.RegistrationDTO;
import com.eams.service.RegistrationService;
import com.eams.service.RegistrationServiceImpl;
import com.eams.vo.RegistrationVO;

/**
 * @author ErBharatp
 *
 */
@WebServlet("/registration")
public class RegistrationController extends HttpServlet {
	/**
		 * 
		 */
	private static final long serialVersionUID = -6076313394774724695L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		RegistrationBO bo = null;
		RegistrationVO vo = null;
		RegistrationDTO dto = null;
		RegistrationDAO dao = null;
		RegistrationService service = null;

		String fname = null, lname = null, gender = null;
		String dob = null;

		// read forn data
		fname = req.getParameter("fname");
		lname = req.getParameter("fname");
		dob = req.getParameter("dateOfBirth");
		System.out.println(dob);
		gender = req.getParameter("gender");
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");
		String street = req.getParameter("street");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		String pin = req.getParameter("pin");
		// general settings
		vo = new RegistrationVO();
		vo.setfName(fname);
		vo.setlName(lname);
		vo.setDob(dob);
		vo.setGender(gender);
		vo.setMobile(mobile);
		vo.setEmail(email);
		vo.setStreet(street);
		vo.setCity(city);
		vo.setState(state);
		vo.setCountry(country);
		vo.setPin(pin);
		// convert VO to DTO object
		dto = new RegistrationDTO();
		dto.setfName(vo.getfName());
		dto.setlName(vo.getlName());
		
		dto.setDob(java.sql.Date.valueOf(vo.getDob()));
		dto.setGender(vo.getGender());
		dto.setMobile(vo.getMobile());
		dto.setEmail(vo.getEmail());
		dto.setStreet(vo.getStreet());
		vo.setCity(vo.getCity());
		vo.setState(vo.getState());
		dto.setCountry(vo.getCountry());
		dto.setPin(Integer.parseInt(vo.getPin()));
		
		//use service 
		service = new RegistrationServiceImpl();
		try {
			String result = service.generate(dto);
			pw = res.getWriter();
			res.setContentType("text/html");
			pw.println("<h1>Result ::"+result+"</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
		
	}
}
