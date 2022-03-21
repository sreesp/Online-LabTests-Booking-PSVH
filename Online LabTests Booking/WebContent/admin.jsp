<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
 <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;700;900&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="admin.css">
</head>
<body>
  <%
  
  		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("username")==null){
			response.sendRedirect("Login.jsp");
		}
%>
	
	
<header>
  <div class="wrapper">
   <div class="logo">
    <img class="logo" src="logo1.png">
   </div>
   <ul class="nav-area">
   <!--  <li><a href="#">Home</a></li> -->
   <li><a href="ViewTests">View All Orders</a></li>
    <li><a href="update.jsp">Update Order</a></li>
    <li><a href="LogoutServlet">Logout</a></li>
   </ul>
  </div>
  <div class="welcome-text">
   <h1>
    <span>Welcome Admin </span></h1>
  <!-- <a href="#">Contact US</a> --> 
  </div>
 </header>

</body>
</html>