package com.psvh.run;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psvh.db.doa.UserDAO;
import com.psvh.db.doa.UserTestsDAO;
import com.psvh.db.pojo.User;
import com.psvh.db.pojo.UserTests;

@Controller
public class AppController {

	@RequestMapping("register")
	public String home() {
		System.out.println("Hii");
		return "RegistrationPage.jsp";
	}

	@RequestMapping("login")
	public String loginPage() {
		System.out.println("Hii");
		return "Login.jsp";
	}

	@RequestMapping("exception")
	public String exception() {
		System.out.println("Hii");
		return "exception.jsp";
	}

	@RequestMapping("done")
	public String done() {
		System.out.println("Hii");
		return "done.jsp";
	}

	@RequestMapping("welcome")
	public String welcome() {
		System.out.println("Hii");
		return "welcome.jsp";
	}

	@RequestMapping("bookTest")
	public String bookLabTest() {
		System.out.println("Hii");
		return "booking.jsp";
	}

	@RequestMapping("testBooked")
	public String testBooked() {
		System.out.println("Hii");
		return "testbooked.jsp";
	}

	@RequestMapping("loggedOut")
	public String loggedOut() {
		System.out.println("Hii");
		return "LoggedOut.jsp";
	}

	@RequestMapping("admin")
	public String admin() {
		System.out.println("Hii");
		return "admin.jsp";
	}

	@RequestMapping("updateOrder")
	public String updateOrder() {
		System.out.println("Hii");
		return "update.jsp";
	}

	@RequestMapping("updated")
	public String updated() {
		System.out.println("Hii");
		return "updated.jsp";
	}

	@RequestMapping("orderCancelled")
	public String orderCancelled() {
		System.out.println("Hii");
		return "cancelled.jsp";
	}

	@RequestMapping("invalid")
	public String invalid() {
		System.out.println("Hii");
		return "invalid.jsp";
	}

	@RequestMapping("cancelOrder")
	public String cancelOrder() {
		System.out.println("Hii");
		return "cancelOrder.jsp";
	}

	@RequestMapping("search")
	public String search() {
		System.out.println("Hii");
		return "search.jsp";
	}

	@RequestMapping("viewOrders")
	public String display() {
		System.out.println("Hii");
		return "display.jsp";
	}

	@RequestMapping("viewAllOrders")
	public String display2() {
		System.out.println("Hii");
		return "display2.jsp";
	}

	@RequestMapping("searchOrders")
	public String display3() {
		System.out.println("Hiiiii");
		return "display3.jsp";
	}

	@RequestMapping("Registration")
	public void registration(HttpServletRequest request, HttpServletResponse response) throws IOException {

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

		if (msg.compareTo("registered successfully") == 0) {
			response.sendRedirect("done");
		}

		else {
			response.sendRedirect("exception");
		}

	}

	@RequestMapping("updateOrderStatus")
	public void updateOrderStatus(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("orderId"));

		String status = request.getParameter("status");

		UserTestsDAO dao = new UserTestsDAO();

		int msg = dao.updateTest(id, status);

		if (msg > 0) {

			response.sendRedirect("updated");

		}

	}

	

}
