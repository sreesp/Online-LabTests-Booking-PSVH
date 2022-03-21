<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Login.css">
</head>
<body>
	<h2 class="text"></h2>
        <div class="center">
            <h1>LogIn</h1>
            <form action="LoginServlet" method="post">
                <div class="txt_field">
                    <input type="text" name="username" required>
                    <label>Username</label>
                </div>
                <div class="txt_field">
                    <input type="password" name="password" required>
                    <label>Password</label>
                </div>
            
                <input type="submit" value="Login">
                <div class="signup_link">
                    Not yet registered? <a href="RegistrationPage.jsp">Register Here</a>
                </div>
            </form>
        </div>
</body>
</html>