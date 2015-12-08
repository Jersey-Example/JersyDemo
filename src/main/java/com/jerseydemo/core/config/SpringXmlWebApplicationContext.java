package com.jerseydemo.core.config;

import org.springframework.web.context.support.XmlWebApplicationContext;

import com.jerseydemo.core.utilities.ConfigLocationHelper;

public class SpringXmlWebApplicationContext extends XmlWebApplicationContext
{
	public String[] getDefaultConfigLocations()
	{
		System.out.println("[%SpringXmlWebApplicationContext.getDefaultConfigLocations() begin%]");
		String[] returnStringArray = ConfigLocationHelper.getConfigLocationArray("spring", this.getServletContext().getRealPath(""));
		for(int i=0;i<returnStringArray.length;i++)
		{
			System.out.println(returnStringArray[i]);
		}
		
		System.out.println("[%SpringXmlWebApplicationContext.getDefaultConfigLocations() end%]");
		
		return returnStringArray;
	}
}
