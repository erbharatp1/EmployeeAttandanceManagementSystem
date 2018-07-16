/**
 * 
 */
package com.eams.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.eams.bo.LoginPageBO;

/**
 * @author ErBharatp
 *
 */
public class LoginPageDAO {
	private static final String LOGIN = "SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD = ?";

	public int login(LoginPageBO bo) {
		InitialContext ic = null;
		DataSource ds = null;
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:/comp/env/DsJndi");
			con = ds.getConnection();
			ps = con.prepareStatement(LOGIN);
			ps.setString(1, bo.getUname());
			ps.setString(2, bo.getPwd());
			// execute query
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}//method
}//class
