package com.internousdev.login.dto;

public class LoginDTO {
	private int id;
	private String name;
	private String password;

	public int getId() {
		return id;
	}

	public int setId(int id) {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
