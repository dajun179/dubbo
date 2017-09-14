package com.lb.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import java.util.Map.Entry;

public class CommonUtil {

	/**
	 * 获取当前时间
	 * @return
	 */
	public static Calendar getCalendar(){
		Calendar calendar = Calendar.getInstance();
        Date date = new Date(System.currentTimeMillis());
        calendar.setTime(date);
        return calendar;
	}
	
	
	/**
	 * 获取uuid
	 * @return
	 */
	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}

	/**
	* 日期转换成字符串
	* @param date 
	* @return str
	*/
	public static String dataToStr(Date date, String format) {
		SimpleDateFormat matter = new SimpleDateFormat(format);
		return matter.format(date);
	}
	
	/**
	* 字符串转换成日期
	* @param str
	* @return date
	*/
	public static Date strToDate(String str, String format) {
	  
	   SimpleDateFormat matter = new SimpleDateFormat(format);
	   Date date = null;
	   try {
	    date = matter.parse(str);
	   } catch (Exception e) {
	    e.printStackTrace();
	   }
	   return date;
	}
	
	/**
	 * 字符串取掉去最后一个字符
	 * @param str   目标字符串
	 * @param chars 取掉的字符
	 * @return
	 */
	public static String toStr(String str,String chars,int num){
		String result = "";
		if(StringUtils.isNotBlank(str)){
			String str1 = str.substring(str.length() - num,str.length());
			if(str1.indexOf(chars) > -1){
				result = str.substring(0,str.length() - num);
			}else{
				result= str;
			}
		}
		return result;
	}
	
	// 获取时间戳
	public static String getTimestamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String timeStr = sdf.format(date);
		return timeStr;
	}
	
	/**
	 * 将Map存储的对象，转换为key=value&key=value的字符
	 *
	 * @param requestParam
	 * @param coder
	 * @return
	 */
	public static String getRequestParamString(Map<String, String> requestParam, String coder) {
		if (null == coder || "".equals(coder)) {
			coder = "UTF-8";
		}
		StringBuffer sf = new StringBuffer("");
		String reqstr = "";
		if (null != requestParam && 0 != requestParam.size()) {
			for (Entry<String, String> en : requestParam.entrySet()) {
				try {
					sf.append(en.getKey() + "=" + (null == en.getValue() || "".equals(en.getValue()) ? ""
							: URLEncoder.encode(en.getValue(), coder)) + "&");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
					return "";
				}
			}
			reqstr = sf.substring(0, sf.length() - 1);
		}
		return reqstr;
	}

}
