/**
 * 
 */
package com.eams.bo;

import java.util.Date;

/**
 * @author ErBharatp
 * REG_ID FIRSTNAME  LASTNAME DOB MOBILE GENDER
EMAIL     STREET    CITY
STATE   COUNTRY    PIN
 */
public class RegistrationBO {
  
	private String fName;
	private String lName;
	private Date dob;
	private String mobile;
	private String gender;
	private String email;
	private String street;
	private String city;
	private String state;
	private String country;
	private int pin;
	
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public Date getDob() {
		return dob;
	}
	public String getMobile() {
		return mobile;
	}
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public int getPin() {
		return pin;
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
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "RegistrationBO [fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", mobile=" + mobile
				+ ", gender=" + gender + ", email=" + email + ", street=" + street + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pin=" + pin + "]";
	}
	
	
}
