package com.lb.controller.sysuser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lb.service.sysuser.SysUserService;

@Controller
@RequestMapping("/user")
public class SysUserController {
	
	private static final Logger logger = LoggerFactory.getLogger(SysUserController.class);
	
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping(value = "/addSysUser.do", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public String addSysUser(String condition){
		String result = "" ;
		
		try {
			logger.info("condition:"+condition);
			result = sysUserService.addUser(condition);
			
		} catch (Exception e) {
			logger.error("新增用户失败！", e);
		}
		
		return result;
	}
	
}
