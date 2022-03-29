package com.psvh.run;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psvh.db.doa.UserTestsDAO;

@Controller
public class CancelOrderController {

	@RequestMapping("CancelOrder")
	public void cancelOrder(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String username = (String) session.getAttribute("username");

		int id = Integer.parseInt(request.getParameter("id"));

		UserTestsDAO dao = new UserTestsDAO();

		int msg = dao.updateUserTest(id, username);

		if (msg > 0) {

			response.sendRedirect("orderCancelled");

		}

		else if (msg == 0) {

			response.sendRedirect("invalid");

		}

	}
	
}
