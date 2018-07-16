/**
 * 
 */
package com.eams.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eams.bo.LoginPageBO;
import com.eams.dto.LoginPageDTO;
import com.eams.service.LoginPageService;
import com.eams.service.LoginPageServiceImpl;
import com.eams.vo.LoginPageVO;

/**
 * @author ErBharatp
 *
 */
@WebServlet("/loginpage")
public class LoginPageController extends HttpServlet {

	private static final long serialVersionUID = -155183200899627122L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		ServletOutputStream sos = null;
		LoginPageVO vo = null;
		LoginPageBO bo = null;
		LoginPageDTO dto = null;
		LoginPageService service = null;
	//	boolean result =false;
		String uname = null, pwd = null;
		// read form data
		uname = req.getParameter("uname");
		pwd = req.getParameter("pwd");
		// create vo object
		vo = new LoginPageVO();
		vo.setUname(uname);
		vo.setPwd(pwd);
		// convert vo to dto object
		dto = new LoginPageDTO();
		dto.setUname(vo.getUname());
		dto.setPwd(vo.getPwd());
		//use service class object
		service =new LoginPageServiceImpl();
	   String  result = service.valid(dto);
		//display
		
		pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<h1>result"+result+"</h>");
		pw.println("<a href='admin.html'>admin</a><br>");
		pw.println("<a href='Home.html'>home</a>");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doGet(req, res);
	}
}
