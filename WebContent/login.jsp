<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		user:<input type="text" name="user"/>
		<br>
		password:<input type="password" name="password"/>
		<br>
		interesting:
		<input type="checkbox" name="interesting" value="Game" />GameText
		<input type="checkbox" name="interesting" value="PC" />PCText
		<input type="checkbox" name="interesting" value="Reading" />ReadingText
		
		
		<input type="submit" value="Submit"/>		
	</form>
</body>
</html>