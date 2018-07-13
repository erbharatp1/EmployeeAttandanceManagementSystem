package com.eams.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eams.dto.LoginDTO;
import com.eams.service.LoginService;
import com.eams.service.LoginServiceImp;
import com.eams.vo.LoginVO;

public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		LoginVO vo = null;
		String user = null, password = null, repassword = null;
		LoginDTO dto = null;
		LoginService service = null;
		String result = null;
		PrintWriter pw = null;

		// read form data
		user = req.getParameter("user");
		password = req.getParameter("password");
		// create VO class object having form data
		vo = new LoginVO();
		vo.setUsername(user);
		vo.setPassword(password);
		// vo.setUserType(userType);

		// convert VO class object to DTO class object
		dto = new LoginDTO();
		dto.setUsername(vo.getUsername());
		dto.setPassword(vo.getPassword());
		// dto.setUserType(vo.getUserType());

		// use Service class
		service = new LoginServiceImp();
		result = service.genetrateResult(dto);
		// display results
		pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<h1> Result " + result + "</h1>");
		// add hyperlinks to go home page
		pw.println("<a href = 'login.html'>Login</a>");
		// close stream
		pw.close();
	}// end doGet(-,-)

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}// doPost(-,-)

}// class
