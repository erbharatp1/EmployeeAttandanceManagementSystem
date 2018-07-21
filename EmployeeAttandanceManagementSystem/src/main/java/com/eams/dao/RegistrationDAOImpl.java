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
 * create table register (reg_id number(4) primary key ,firstname
 * varchar2(20),lastname varchar2(20), dob date, mobile number(10),gender
 * varchar2(6),email varchar2(20), street varchar2(20),city varchar(20),state
 * varchar2(20),country varchar2(10),pin number(6)); insert into register
 * values(1001,'abhi','patel',sysdate,736691649,
 * 'male','abhi@gmail.com','ameerpat','Mumbai','MH','india',500038);
 *
 */
public class RegistrationDAOImpl implements RegistrationDAO {
	private static final String InsertRegistration = "INSERT INTO REGISTER VALUES(REG_EMP_SEQ,?,?,?,?,?,?,?,?,?,?,?)";

	@Override
	public int insert(RegistrationBO bo) throws Exception {
		InitialContext ic = null;
		DataSource ds = null;
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		// create initial context object
		ic = new InitialContext();
		// get Datasourse object through lookup
		ds = (DataSource) ic.lookup("java:/comp/env/DsJndi");
		// get Connection object
		con = ds.getConnection();
		// praperse stmt
		ps = con.prepareStatement(InsertRegistration);
		// set value to query param
	
		ps.setString(1, bo.getfName());
		ps.setString(2, bo.getlName());
		ps.setDate(3, (Date) bo.getDob());
		ps.setString(4, bo.getMobile());
		ps.setString(5, bo.getGender());
		ps.setString(6, bo.getEmail());
		ps.setString(7, bo.getStreet());
		ps.setString(8, bo.getCity());
		ps.setString(9, bo.getState());
		ps.setString(10, bo.getCountry());
		ps.setInt(11, bo.getPin());

		// execute query
		result = ps.executeUpdate();
		return result;
	}

}
