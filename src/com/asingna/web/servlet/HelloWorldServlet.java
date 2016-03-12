package com.asingna.web.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
		
		ServletContext servletContext = servletConfig.getServletContext();
		
		user = servletContext.getInitParameter("gloab_user");
		System.out.println("context-->"+user);
		
		names = servletContext.getInitParameterNames();
		while(names.hasMoreElements())
		{
			String name = names.nextElement();
			String value = servletContext.getInitParameter(name);
			System.out.println("context-->"+"--"+name+":"+value);
		} 
		
		//获取应用名称路径 用于拼接路径
		
		String contextPath = servletContext.getContextPath();
		System.out.println(contextPath);
		
		ClassLoader classLoader = getClass().getClassLoader();
		InputStream is = classLoader.getResourceAsStream("jdbc.properties");
		System.out.println("classloader:"+is);
		
		InputStream is2 = servletContext.getResourceAsStream("/WEB-INF/classes/jdbc.properties");
		System.out.println("servletcontext:" + is2);
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service...");
	}
	
	public HelloWorldServlet(){
		System.out.println("HelloWorld constructor...");
	}

}
