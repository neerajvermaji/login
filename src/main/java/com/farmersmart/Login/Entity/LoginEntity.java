package com.farmersmart.Login.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Login")
public class LoginEntity {
	@Id
	private int id;
	private String userName;
	private String password;
	
	public LoginEntity() {
		super();
	}

	public LoginEntity(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "LoginEntity [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	

}
