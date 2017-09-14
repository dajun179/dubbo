package com.lb.constant;

/**
* @package com.lib.constant.ResultStatusEnum.java
* 返回结果
* @author dj
* @phone 18895737300
* @date 2017年9月14日 下午4:18:55
* @version 1.0.1
 */
public enum ResultStatusEnum {
	
	SUCCESS("0", "成功!"), FAIL("1", "失败!");
	
	private String code ;
	private String name ;
	
	private ResultStatusEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
}
