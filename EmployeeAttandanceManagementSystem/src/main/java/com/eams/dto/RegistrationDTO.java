/**
 * 
 */
package com.eams.dto;

import java.util.Date;

/**
 * @author ErBharatp
 *
 */
public class RegistrationDTO {
	private int regid;
	private String fName;
	private String lName;
	private Date dob;
	private String gender;
	private String mobile;
	private int addrsid;

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

	public int getAddrsid() {
		return addrsid;
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

	public void setAddrsid(int  addrsid) {
		this.addrsid = addrsid;
	} 

	@Override
	public String toString() {
		return "RegistrationBO [ fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", gender="
				+ gender + ", mobile=" + mobile + ", addrsid=" + addrsid + "]";
	}

}
