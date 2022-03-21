<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("username")==null){
			response.sendRedirect("Login.jsp");
		}
%>


	Test Booked Successfully
	<a href="welcome.jsp">Click here to go back to Welcome page</a>
	
	<!-- <form action="LogoutServlet">
		<input type="submit" value="Click here to Logout">
	
	</form> -->
	
</body>
</html>