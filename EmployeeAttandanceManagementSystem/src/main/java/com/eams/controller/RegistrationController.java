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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eams.bo.RegistrationBO;
import com.eams.dao.RegistrationDAO;
import com.eams.vo.RegistrationVO;

/**
 * @author ErBharatp
 *
 */
public class RegistrationController  extends HttpServlet{
/**
	 * 
	 */
	private static final long serialVersionUID = -6076313394774724695L;
@Override
public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    PrintWriter pw = null;
	RegistrationBO bo = null;
	RegistrationVO vo = null;
     RegistrationDAO dao = null;
     RegisterableService sevice = null;
 
     String fname = null,lname=null, mobile =null,gender= null;
     String dob =null ;
     ServletOutputStream sos = null;
     
     //read forn data
    fname = req.getParameter("fname");
    lname = req.getParameter("fname");
    dob = req.getParameter("dob");
   gender = req.getParameter("gender");
   mobile = req.getParameter("mobile");
     //general settings
 vo = new RegistrationVO();
 
vo.setfName(fname);
vo.setlName(lname);vo.setGender(gender);vo.setDob(dob);
    
     
}@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	}
}
