/**
 * 
 */
package com.eams.dao;

/**
 * @author ErBharatp
 *
 */
public interface LoginDAO {
	public String matchingUserPass(String username,String password,String repassword);

}
