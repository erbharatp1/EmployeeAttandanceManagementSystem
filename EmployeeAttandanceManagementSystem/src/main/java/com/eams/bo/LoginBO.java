package com.eams.bo;

public class LoginBO {
     private int username;
     private String password;
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginBO [username=" + username + ", password=" + password + "]";
	}
     
}
