<%@page import="com.asingna.web.servlet.HelloWorldServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		HelloWorldServlet helloWorld = new HelloWorldServlet();
		
		System.out.println(request.getParameter("name"));
		
		System.out.println(response.getClass());
		System.out.println(response.getLocale());
		out.println(response.getClass());
	%>
</body>
</html>