package com.jerseydemo.jersey.vo;

public class Body {
	private String mobileNo;
	private Integer reqSource;
	private String reqTime;
	private Integer isBatch;
	private Integer isMessage;
	private String ext;
	private Integer actionReason;
	private String result;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getReqSource() {
		return reqSource;
	}

	public void setReqSource(Integer reqSource) {
		this.reqSource = reqSource;
	}

	public String getReqTime() {
		return reqTime;
	}

	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}

	public Integer getIsBatch() {
		return isBatch;
	}

	public void setIsBatch(Integer isBatch) {
		this.isBatch = isBatch;
	}

	public Integer getIsMessage() {
		return isMessage;
	}

	public void setIsMessage(Integer isMessage) {
		this.isMessage = isMessage;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public Integer getActionReason() {
		return actionReason;
	}

	public void setActionReason(Integer actionReason) {
		this.actionReason = actionReason;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
