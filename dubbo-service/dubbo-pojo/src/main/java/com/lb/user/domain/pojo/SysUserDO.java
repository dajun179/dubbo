package com.lb.user.domain.pojo;

import java.io.Serializable;

public class SysUserDO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String userID ;
	
	private String name ;
	
	private String loginName ;

	private String loginPassword;
	
	private String phone ; 
	
	private String status ;
	
	private String role_ID ;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRole_ID() {
		return role_ID;
	}

	public void setRole_ID(String role_ID) {
		this.role_ID = role_ID;
	}
	
}

