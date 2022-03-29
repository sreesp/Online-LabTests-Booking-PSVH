<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Update Order</title>
        <link rel="stylesheet" href="update.css">
    </head>
    <body>
        <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            if(session.getAttribute("username")==null){
                response.sendRedirect("login");
            }
        %>

        
        <div class="contact-form">
            <form action="updateOrderStatus" method="post">
                <label for="OrderId">Enter Order Id</label>
                <input type="text" id="OrderId" name="orderId" placeholder="Order Id">
                <label for="Status">Select Status</label>
                <select name="status" id="Status">
                    <option value="Approved">Approved</option>
                    <option value="Sample Collected">Sample Collected</option>
                    <option value="Report Generated">Report Generated</option>
                    <option value="Cancelled">Cancelled</option>
                </select>
                <input type="submit" value="Update">
            </form>
        </div>
    
    </body>
</html>