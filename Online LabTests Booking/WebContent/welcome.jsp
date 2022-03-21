<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Welcome</title>
	<link rel="stylesheet" href="welcome.css">
</head>
<body>

	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("username")==null){
			response.sendRedirect("Login.jsp");
		}
	%>

	Welcome ${username} <!-- welcome+username -->

	<div class="wrapper">
			<nav class="navbar">
				<img class="logo" src="logo1.png">
				<ul>
					<li><a class="active" href="C:\Harini\Front end\Website-Red-Girl\Home.html">Home</a></li>
					<li><a href="booking.jsp">Book Lab Test</a></li>
					<li><a href="DisplayUserOrders">View Orders</a></li>
					<li><a href="LogoutServlet">Logout</a></li>
					<!-- <li><a href="#">About Us</a></li> -->
				</ul>
			</nav>
			<div class="center">
			<h1></h1>
			<h2></h2>
			<div class="buttons">
			<!-- <button>Explore More</button>
			<button class="btn2">Subscribe Us</button> -->
		</div>
		</div>
</body>
</html>