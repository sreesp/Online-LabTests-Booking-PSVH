<%@page import="com.psvh.db.doa.UserTestsDAO"%>

<%@page import="com.psvh.db.pojo.UserTests"%>

<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>View Orders</title>

</head>

<body>



	<%
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

	if (session.getAttribute("username") == null) {

		response.sendRedirect("login");

	}
	
	%>



	<table align="center" cellpadding="5" cellspacing="5" border="1">

		<tr bgcolor="ff8533">

			<td><h2>Id</h2></td>

			<td><h2>Name</h2></td>

			<td><h2>Age</h2></td>

			<td><h2>Test</h2></td>

			<td><h2>Rate</h2></td>

			<td><h2>Test Date</h2></td>

			<td><h2>Address L1</h2></td>

			<td><h2>Address L2</h2></td>

			<td><h2>City</h2></td>

			<td><h2>Order Status</h2></td>

		</tr>





		<%
		String username = (String) session.getAttribute("username");

		List<UserTests> list;

		UserTestsDAO dao = new UserTestsDAO();

		list = dao.listByUsername(username);

		if (list.isEmpty()) {

			out.println("Empty list");

		}

		else {

			for (UserTests ut : list) {
		%>



		<tr bgcolor="ffc299">



			<td><%=ut.getId()%></td>

			<td><%=ut.getName()%></td>

			<td><%=ut.getAge()%></td>

			<td><%=ut.getTest()%></td>

			<td><%=ut.getRate()%></td>

			<td><%=ut.getTestdate()%></td>

			<td><%=ut.getAddress1()%></td>

			<td><%=ut.getAddress2()%></td>

			<td><%=ut.getCity()%></td>

			<td><%=ut.getStatus()%></td>





		</tr>





		<%
		}

		}
		%>

	</table>



</body>

</html>