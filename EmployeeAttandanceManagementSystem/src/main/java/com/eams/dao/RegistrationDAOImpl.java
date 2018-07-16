/**
 * 
 */
package com.eams.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.eams.bo.RegistrationBO;

/**
 * @author ErBharatp
 *
 */
public class RegistrationDAOImpl implements RegistrationDAO {
	private static final String InsertRegistration = "ss";

	@Override
	public int insert(RegistrationBO bo) {
		InitialContext ic = null;
		DataSource ds = null;
		Connection con = null;
		PreparedStatement ps = null;

		int result = 0;
		try {
			// create initial context object
			ic = new InitialContext();
			// get Datasourse object through lookup
			ds = (DataSource) ic.lookup("DsJndi");
			// get Connection object
			con = ds.getConnection();
			// praperse stmt
			ps = con.prepareStatement(InsertRegistration);
			// set value to query param
			
			ps.setString(2, bo.getfName());
			ps.setString(3, bo.getlName());
			ps.setDate(4, (Date) bo.getDob());
			ps.setString(5, bo.getGender());
			ps.setString(6, bo.getMobile());

			// execute query
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
