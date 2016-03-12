package com.asingna.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet implements Servlet{

	@Override
	public void destroy() {
		System.out.println("destroy...");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig...");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo...");
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init");
		
		String user = servletConfig.getInitParameter("user");
		System.out.println(user);
		
		Enumeration<String> names = servletConfig.getInitParameterNames();
		while(names.hasMoreElements())
		{
			String name = names.nextElement();
			String value = servletConfig.getInitParameter(name);
			System.out.println("--"+name+":"+value);
			
		}
		
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service...");
	}
	
	public HelloWorldServlet(){
		System.out.println("HelloWorld constructor...");
	}

}
