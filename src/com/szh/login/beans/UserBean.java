package com.szh.login.beans;

public class UserBean {

	private String userName;
	
	private String userPass;
	
	private int age;
	

	public UserBean(String userName, String userPass, int age) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}
