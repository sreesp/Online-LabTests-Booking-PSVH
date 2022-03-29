<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Cancelled</title>
</head>
<body>
	
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("username")==null){
			response.sendRedirect("login");
		}
	%>
	
	Order Cancelled
	<a href="welcome">Click here to go to Welcome page</a>
	
</body>
</html>