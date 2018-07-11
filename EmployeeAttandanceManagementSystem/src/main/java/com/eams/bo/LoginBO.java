package com.eams.bo;

public class LoginBO {
     private String username;
     private String password;
     private String repassword;
    
     
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginBO [username=" + username + ", password=" + password + ", repassword=" + repassword + "]";
	}
	
     
}
