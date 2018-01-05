package com.omron.demo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable  {

	final static long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String email;

	private Map conmap;
	
	public Map getConmap() {
		return conmap;
	}
	
	public void setConmap(Map map) {
		this.conmap = map ;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUsername() {
		return this.userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}	
}
