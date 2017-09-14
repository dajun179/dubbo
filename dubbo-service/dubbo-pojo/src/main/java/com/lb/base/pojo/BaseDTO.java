package com.lb.base.pojo;

import java.io.Serializable;

public class BaseDTO implements Serializable {

	private static final long serialVersionUID = 4941915427576577969L;

	/**
	 * 处理结果码
	 */
	private String resultCode;
	
	/**
	 * 处理结果描述
	 */
	private String resultMsg;

	/**
	 * 状态码
	 */
	private String status;
	
	/**
	 * 
	 */
	public BaseDTO() {
		super();
	}

	/**
	 * @param resultCode
	 * @param resultMsg
	 */
	public BaseDTO(String resultCode, String resultMsg) {
		super();
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}

	/**
	 * @param resultCode
	 * @param resultMsg
	 * @param status
	 */
	public BaseDTO(String resultCode, String resultMsg, String status) {
		super();
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
}
