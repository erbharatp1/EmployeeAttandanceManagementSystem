package com.eams.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.eams.bo.LoginBO;

public class LoginDAOImp implements LoginDAO{

	private static final String  forget_Password="UPDATE LOGIN SET PWD=? WHERE UNAME=?";
	@Override
	public int insert(LoginBO bo) throws Exception {
		Connection con =null;
		InitialContext ic = null;
		DataSource ds =null;
		PreparedStatement ps = null;
		int result =0;
		//String usertype=null;
		
			// create InitialContext object
			ic = new InitialContext();
			// get DataSource object through lookUp operation
			ds = (DataSource) ic.lookup("java:/comp/env/DsJndi");
			// get connection from JDBC con pool
			con=ds.getConnection();
			// create PreparedStatemet Object
			ps = con.prepareStatement(forget_Password);
			System.out.println(forget_Password);
			// set values to query params
			
		//	ps.setString(3, bo.getUserType());
			// execute the query
			//System.out.println("UserType from DAO "+bo.getUserType());
			//if(bo.getUserType()=="user") {
				ps.setString(1, bo.getPassword());
				System.out.println(bo.getPassword());
				ps.setString(2, bo.getUsername());
				System.out.println(bo.getUsername());
				result = ps.executeUpdate();
			//}
			
			System.out.println(result);
			if(result!=0) {
				System.out.println("Data Inserted sucessfully");
			}
			else {
				System.out.println("insertion failed");
			}
		
		return result;
	}

	
}
