package com.jerseydemo.jsersey.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author 	Administrator
 * @date	2015年12月8日 下午4:45:04
 * @desc	
 */
@Component
@Scope("singleton")
@Path("/jservice/demoserver")
public class DemoServer {
	@Produces({ MediaType.APPLICATION_XML, MediaType.TEXT_XML })
	@Consumes({ MediaType.APPLICATION_XML, MediaType.TEXT_XML })
	@POST
	public String service(String reqStr) {
		System.out.println("[%DemoServer Process Begin%]");
		System.out.println(reqStr);
		String result = getResult("baseSubRequest", "100");
		System.out.println(result);
		System.out.println("[%DemoServer Process End%]");
		return result;
	}

	public String getResult(String function, String result) {
		StringBuilder sb = new StringBuilder();
		sb.append("<demoMessage><function>");
		sb.append(function);
		sb.append("</function><body><result>");
		sb.append(result);
		sb.append("</result></body></demoMessage>");
		return sb.toString();
	}
}
