package com.jerseydemo.jersey.client;

import javax.ws.rs.core.MediaType;

import com.jerseydemo.jersey.vo.Body;
import com.jerseydemo.jersey.vo.DemoMessage;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class DemoClient {
	private Client client = Client.create();
	private WebResource webResource = client.resource("http://127.0.0.1:8080/jerseydemo/jservice/demoserver");

	public int baseSubRequest(String mobileNo, int reqSource, String reqTime, int isBatch, int isMessage,
			int actionReason, String ext) {
		DemoMessage message = new DemoMessage();
		Body body = new Body();

		body.setMobileNo(mobileNo);
		body.setReqSource(reqSource);
		body.setIsBatch(isBatch);
		body.setIsMessage(isMessage);
		body.setActionReason(actionReason);
		body.setExt(ext);
		message.setBody(body);
		message.setFunction("baseSubRequest");

		ClientResponse response = webResource.type(MediaType.APPLICATION_XML_TYPE).post(ClientResponse.class, message);
		DemoMessage respMessage = response.getEntity(DemoMessage.class);
		int result = Integer.parseInt(respMessage.getBody().getResult());

		return result;
	}
}
