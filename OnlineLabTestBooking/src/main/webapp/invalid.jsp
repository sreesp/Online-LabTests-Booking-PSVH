<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invalid</title>
</head>
<body>
	
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("username")==null){
			response.sendRedirect("login");
		}
	%>
	
	Invalid Order Id, please go back and enter valid order id.
	
</body>
</html>