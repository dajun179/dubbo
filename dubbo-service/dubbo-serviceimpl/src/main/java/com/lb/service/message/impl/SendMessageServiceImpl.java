package com.lb.service.message.impl;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lb.service.message.SendMessageService;
import com.lb.utils.SendMessageUtils;

@Service
public class SendMessageServiceImpl implements SendMessageService{

	private String mtUrl="http://esms.etonenet.com/sms/mt";
	
	private static final Logger logger = LoggerFactory.getLogger(SendMessageServiceImpl.class);
	
	@Override
	public String sendMessage() {
		
		try {
			
			//操作命令、SP编号、SP密码，必填参数
	        String command = "MT_REQUEST";
	        String spid = "****";
	        String sppassword = "****";
	        //sp服务代码，可选参数，默认为 00
	        String spsc = "00";
	        //源号码，可选参数
	        String sa = "10657109053657";
	        //目标号码，必填参数
	        String da = "8618895737300";
	        //下行内容以及编码格式，必填参数
	        int dc = 15;
	        String sm = SendMessageUtils.encodeHexStr(dc, "你好,这是移通网络单条下行测试短信");//下行内容进行Hex编码，此处dc设为15，即使用GBK编码格式

	        //组成url字符串
	        String smsUrl = mtUrl + "?command=" + command + "&spid=" + spid + "&sppassword=" + sppassword + "&spsc=" + spsc + "&sa=" + sa + "&da=" + da + "&sm=" + sm + "&dc=" + dc;

	        //发送http请求，并接收http响应
	        String resStr = SendMessageUtils.doGetRequest(smsUrl.toString());
	        System.out.println(resStr);

	        //解析响应字符串
	        HashMap pp = SendMessageUtils.parseResStr(resStr);
	        System.out.println(pp.get("command"));
	        System.out.println(pp.get("spid"));
	        System.out.println(pp.get("mtmsgid"));
	        System.out.println(pp.get("mtstat"));
	        System.out.println(pp.get("mterrcode"));
			
		} catch (Exception e) {
			logger.error("", e);
		}
		return null;
	}
    
}
