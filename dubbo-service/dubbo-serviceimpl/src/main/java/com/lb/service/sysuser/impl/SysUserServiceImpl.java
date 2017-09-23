package com.lb.service.sysuser.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.lb.base.pojo.BaseDTO;
import com.lb.constant.ResultStatusEnum;
import com.lb.mapper.user.SysUserMapper;
import com.lb.service.sysuser.SysUserService;
import com.lb.user.domain.pojo.SysUserDO;
import com.lb.utils.CommonUtil;

import net.sf.json.JSONObject;

@Service
public class SysUserServiceImpl implements SysUserService{

	private static final Logger logger = LoggerFactory.getLogger(SysUserServiceImpl.class);
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	/**
	 * 新增用户
	 */
	@Override
	public String addUser(String condition) {
		SysUserDO sysUserDO = new SysUserDO();
		BaseDTO bean = new BaseDTO();
		bean.setResultCode(ResultStatusEnum.FAIL.getCode());
		bean.setResultMsg(ResultStatusEnum.FAIL.getName());
		logger.info("新增用户 params:"+condition);
		
		try {
			sysUserDO = JSON.parseObject(condition, SysUserDO.class);
			sysUserDO.setUserID(CommonUtil.getUUID());
			sysUserDO.setStatus("1");
			
			int affectCount = sysUserMapper.insertSysUser(sysUserDO);
			if (affectCount > 0) {
				bean.setResultCode(ResultStatusEnum.SUCCESS.getCode());
				bean.setResultMsg(ResultStatusEnum.SUCCESS.getName());
			}
		} catch (Exception e) {
			logger.error("新增用户失败！", e);
		}
		
		return JSON.toJSONString(bean);
	}

	/**
	 * 登陆
	 */
	@Override
	public String login(String loginName, String loginPassword) {
		SysUserDO sysUserDO = null;
		BaseDTO bean = new BaseDTO();
		bean.setResultCode(ResultStatusEnum.FAIL.getCode());
		logger.info("登陆 params: loginName=" + loginName + ", loginPassword="+loginPassword);
		
		try {
			sysUserDO = sysUserMapper.getSysUserByloginName(loginName);
			if (sysUserDO == null) {
				bean.setResultMsg("用户名错误！");
				return JSON.toJSONString(bean);
			}
			if (sysUserDO.getLoginPassword().equals(loginPassword)) {
				bean.setResultCode(ResultStatusEnum.SUCCESS.getCode());
				bean.setResultMsg(ResultStatusEnum.SUCCESS.getName());
			} else {
				bean.setResultMsg("密码错误！");
			}
		} catch (Exception e) {
			logger.error("登陆失败！", e);
		}
		
		return JSON.toJSONString(bean);
	}

}
