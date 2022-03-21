package com.psvh.servlet.display;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.psvh.db.doa.UserTestsDAO;
import com.psvh.db.pojo.UserTests;

public class DisplayUserOrders extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");

		List<UserTests> list;

		UserTestsDAO dao = new UserTestsDAO();
		list = dao.listByUsername(username);

		PrintWriter out = response.getWriter();

		if (session.getAttribute("username") == null) {
			response.sendRedirect("Login.jsp");
		} else {

			if (list.isEmpty()) {
				out.println("Empty list");
			} else {

				out.printf("%-8s %-15s %-5s %-15s %-15s %-15s %-30s %-30s %-15s %s\n", "OrderId", "Name", "Age",
						"TestName", "TestCost", "TestDate", "Address Line1", "Address Line2", "City", "Status");
				for (UserTests ut : list) {
					out.printf("%-8s %-15s %-5s %-15s %-15s %-15s %-30s %-30s %-15s %s\n", ut.getId(), ut.getName(),
							ut.getAge(), ut.getTest(), ut.getRate(), ut.getTestdate(), ut.getAddress1(),
							ut.getAddress2(), ut.getCity(), ut.getStatus());
				}
			}
		}

	}

}
