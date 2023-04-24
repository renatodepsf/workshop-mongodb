package com.renatodepsf.workshopmongo.dto;

import java.io.Serializable;

import com.renatodepsf.workshopmongo.domain.User;

public class UserDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	
	public UserDto() {
	}
	
	public UserDto(User obj) {
		this.name = obj.getName();
		this.email = obj.getEmail();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
