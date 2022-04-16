package com.springboot.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private String userName;
	private String password;
	private UserType type;

	public User(@JsonProperty("userName") String userName, @JsonProperty("password") String password,
			@JsonProperty("type") UserType type) {
		this.userName = userName;
		this.password = password;
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

}