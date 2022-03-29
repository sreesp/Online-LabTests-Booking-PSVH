<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

    <head>

        <meta charset="ISO-8859-1">

        <title>Search Order</title>

        <link rel="stylesheet" href="search.css">

    </head>

    <body>

        <%

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

            if(session.getAttribute("username")==null){

                response.sendRedirect("login");

            }

        %>

 

       

        <div class="contact-form">

            <form action="searchOrders">
				<label for="orderDate">Enter Date</label>
                 <input type="date" id="orderDate" name="date" required>

                                 <input type="submit" value="Search">

            </form>

        </div>

   

    </body>

</html>