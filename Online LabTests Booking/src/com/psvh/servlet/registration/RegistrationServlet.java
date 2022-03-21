package com.psvh.servlet.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psvh.db.doa.UserDAO;
import com.psvh.db.pojo.User;


public class RegistrationServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		Long phoneNumber = Long.parseLong(request.getParameter("phonenumber"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		
		
		User user = new User(name, email, phoneNumber, password, age, gender, username);
		UserDAO dao = new UserDAO();
		
		String msg = dao.insert(user);
		
		if(msg.compareTo("registered successfully")==0) {
			response.sendRedirect("done.jsp");
		}
		else {
			response.sendRedirect("exception.jsp");
		}
		
	}

}
