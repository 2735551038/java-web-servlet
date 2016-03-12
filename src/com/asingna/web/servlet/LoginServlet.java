package com.asingna.web.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


public class LoginServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String password =request.getParameter("password");
		
		System.out.println("user:"+user+" password:"+password);
		
		String[] interesting = request.getParameterValues("interesting");
		for (String interest : interesting) {
			System.out.println(interest);
		}
		 
		Map<String, String[]> map = request.getParameterMap();
		for (Map.Entry<String, String[]> entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+Arrays.asList(entry.getValue()));
		}
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		String uri = httpServletRequest.getRequestURI();
		System.out.println(uri);
		
		String method = httpServletRequest.getMethod();
		System.out.println(method);
		
		String qString = httpServletRequest.getQueryString();
		System.out.println(qString);
		
		System.out.println(httpServletRequest.getRequestURL());
		
		System.out.println(httpServletRequest.getServletPath());
	}

}
