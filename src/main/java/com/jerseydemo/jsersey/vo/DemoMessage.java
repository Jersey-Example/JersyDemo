package com.jerseydemo.jsersey.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author 	Administrator
 * @date	2015年12月8日 下午4:28:19
 * @desc	
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "function", "body" })
@XmlRootElement
public class DemoMessage {
	private String function;
	private Body body;

	/**
	 * @return the function
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * @param function
	 *            the function to set
	 */
	public void setFunction(String function) {
		this.function = function;
	}

	/**
	 * @return the body
	 */
	public Body getBody() {
		return body;
	}

	/**
	 * @param body
	 *            the body to set
	 */
	public void setBody(Body body) {
		this.body = body;
	}

}
