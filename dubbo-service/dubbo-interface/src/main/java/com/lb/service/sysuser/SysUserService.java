package com.lb.service.sysuser;

public interface SysUserService {
	
	String addUser(String condition);
	
	String login(String loginName, String loginPassword);
}	
