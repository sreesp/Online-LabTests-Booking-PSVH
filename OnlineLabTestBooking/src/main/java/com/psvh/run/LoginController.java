package com.psvh.run;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psvh.db.doa.UserDAO;

@Controller
public class LoginController {

	@RequestMapping("LoginHere")
	public void login(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		String username = request.getParameter("username");

		String password = request.getParameter("password");

		if (username.equals("admin") && password.equals("admin")) {

			HttpSession session = request.getSession();

			session.setAttribute("username", username);

			response.sendRedirect("admin");

		}

		else {

			UserDAO dao = new UserDAO();

			String password2 = dao.findPassword(username);

			if (password.compareTo(password2) == 0) {

				HttpSession session = request.getSession();

				session.setAttribute("username", username);

				response.sendRedirect("welcome");

			}

			else {

				response.sendRedirect("login");

			}

		}

	}
	
}
