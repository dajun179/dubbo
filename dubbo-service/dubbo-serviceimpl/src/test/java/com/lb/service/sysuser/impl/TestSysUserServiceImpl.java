package com.lb.service.sysuser.impl;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSONObject;
import com.lb.service.BaseJunitTest;
import com.lb.user.domain.pojo.SysUserDO;
import com.lb.utils.CommonUtil;

public class TestSysUserServiceImpl extends BaseJunitTest{

	@Autowired
	private SysUserServiceImpl services ;
	
	@Test
	public void testAddUser() {
		SysUserDO sysUserDO = new SysUserDO();
		sysUserDO.setLoginName("A");
		sysUserDO.setLoginPassword("000");
		sysUserDO.setName("adfs");
		sysUserDO.setPhone("5455");
		sysUserDO.setStatus("11");
		sysUserDO.setUserID(CommonUtil.getUUID());
		
		fail(services.addUser(JSONObject.toJSONString(sysUserDO)));
	}

	@Test
	public void testLogin(){
		fail(services.login("adfs", "000"));
	}
}
