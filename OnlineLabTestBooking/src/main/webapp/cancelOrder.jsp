<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Cancel Order</title>

<link rel="stylesheet" href="booking.css">

</head>

<body>

	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

	if (session.getAttribute("username") == null) {

		response.sendRedirect("login");

	}
	%>





	<div class="contact-form">

		<form action="CancelOrder">

			<label for="orderid">Enter Order Id</label>
			 <input type="text" name="id" id="orderid" placeholder="Order Id" required> <input
				type="submit" value="Cancel">

		</form>

	</div>



</body>

</html>