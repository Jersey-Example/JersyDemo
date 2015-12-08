package com.jerseydemo.core.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jerseydemo.jersey.client.DemoClient;

public class JerseyDemoServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		DemoClient client = new DemoClient();
		request.setCharacterEncoding("UTF-8");
		String reqType = request.getParameter("reqType");
		int result = -1;
		if ("baseSubRequest".equals(reqType))
		{
			String mobileNo = request.getParameter("mobileNo");
			int reqSource = Integer.parseInt(request.getParameter("reqSource"));
			String reqTime = request.getParameter("reqTime");
			int isBatch = Integer.parseInt(request.getParameter("isBatch"));
			int isMessage = Integer.parseInt(request.getParameter("isMessage"));
			int actionReason = Integer.parseInt(request.getParameter("actionReason"));
			String ext = request.getParameter("ext");

			result = client.baseSubRequest(mobileNo, reqSource, reqTime, isBatch, isMessage, actionReason, ext);
		}

		System.out.println("[%post result:" + result + "%]");
	}
}
