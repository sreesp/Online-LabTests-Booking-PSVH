package com.psvh.servlet.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.psvh.db.doa.UserDAO;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals("admin") && password.equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("admin.jsp");
			
		} 
		else {
			UserDAO dao = new UserDAO();
			String password2 = dao.findPassword(username);

			if (password.compareTo(password2) == 0) {
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("welcome.jsp");
			} 
			else {
				response.sendRedirect("Login.jsp");
			}
		}

	}

}
