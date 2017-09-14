package com.lib.service.sysuser.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lb.service.sysuser.SysUserService;
import com.lb.user.domain.pojo.SysUserDO;
import com.lib.constant.ResultStatusEnum;
import com.lib.mapper.user.SysUserMapper;

@Service
public class SysUserServiceImpl implements SysUserService{

	private static Logger logger = LoggerFactory.getLogger(SysUserServiceImpl.class);
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	/**
	 * 新增用户
	 */
	@Override
	public String addUser(String condition) {
		SysUserDO bean = new SysUserDO();
		bean.setResultCode(ResultStatusEnum.FAIL.getCode());
		bean.setResultMsg(ResultStatusEnum.FAIL.getName());
		
		try {
			bean = JSON.parseObject(condition, SysUserDO.class);
			int affectCount = sysUserMapper.insertSysUser(bean);
			if (affectCount > 0) {
				bean.setResultCode(ResultStatusEnum.SUCCESS.getCode());
				bean.setResultMsg(ResultStatusEnum.SUCCESS.getName());
			}
		} catch (Exception e) {
			logger.error("新增用户失败！", e);
		}
		
		return JSON.toJSONString(bean);
	}

}