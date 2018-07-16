/**
 * 
 */
package com.eams.vo;

import java.util.Date;

/**
 * @author ErBharatp
 *
 */
public class RegistrationVO {

	private String fName;
	private String lName;
	private Date dob;
	private String gender;
	private String mobile;

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public Date getDob() {
		return dob;
	}

	public String getGender() {
		return gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "RegistrationBO [fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", gender=" + gender
				+ ", mobile=" + mobile + "]";
	}


}
