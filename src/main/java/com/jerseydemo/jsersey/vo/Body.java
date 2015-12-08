package com.jerseydemo.jsersey.vo;

/**
 * @author 	Administrator
 * @date	2015年12月8日 下午4:27:30
 * @desc	
 */
public class Body {
	private String mobileNo;
	private Integer reqSource;
	private String reqTime;
	private Integer isBatch;
	private Integer isMessage;
	private String ext;
	private Integer actionReason;
	private String result;

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo
	 *            the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the reqSource
	 */
	public Integer getReqSource() {
		return reqSource;
	}

	/**
	 * @param reqSource
	 *            the reqSource to set
	 */
	public void setReqSource(Integer reqSource) {
		this.reqSource = reqSource;
	}

	/**
	 * @return the reqTime
	 */
	public String getReqTime() {
		return reqTime;
	}

	/**
	 * @param reqTime
	 *            the reqTime to set
	 */
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}

	/**
	 * @return the isBatch
	 */
	public Integer getIsBatch() {
		return isBatch;
	}

	/**
	 * @param isBatch
	 *            the isBatch to set
	 */
	public void setIsBatch(Integer isBatch) {
		this.isBatch = isBatch;
	}

	/**
	 * @return the isMessage
	 */
	public Integer getIsMessage() {
		return isMessage;
	}

	/**
	 * @param isMessage
	 *            the isMessage to set
	 */
	public void setIsMessage(Integer isMessage) {
		this.isMessage = isMessage;
	}

	/**
	 * @return the ext
	 */
	public String getExt() {
		return ext;
	}

	/**
	 * @param ext
	 *            the ext to set
	 */
	public void setExt(String ext) {
		this.ext = ext;
	}

	/**
	 * @return the actionReason
	 */
	public Integer getActionReason() {
		return actionReason;
	}

	/**
	 * @param actionReason
	 *            the actionReason to set
	 */
	public void setActionReason(Integer actionReason) {
		this.actionReason = actionReason;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

}
