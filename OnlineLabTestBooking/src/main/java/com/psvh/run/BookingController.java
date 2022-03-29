package com.psvh.run;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psvh.db.doa.UserTestsDAO;
import com.psvh.db.pojo.UserTests;

@Controller
public class BookingController {
	
	@RequestMapping("testBooking")
	public void testBooked(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String username = (String) session.getAttribute("username");

		String name = request.getParameter("name");

		int age = Integer.parseInt(request.getParameter("age"));

		String address1 = request.getParameter("address1");

		String address2 = request.getParameter("address2");

		String city = request.getParameter("city");

		String test = request.getParameter("test");

		String rate = request.getParameter("rate");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String d = request.getParameter("date");

		Date date = null;

		try {

			date = sdf.parse(d);

		} catch (ParseException e) {

			e.printStackTrace();

		}

		String status = "Pending";

		UserTests ut = new UserTests(username, name, age, address1, address2, city, test, rate, date, status);

		UserTestsDAO dao = new UserTestsDAO();

		String msg = dao.insert(ut);

		if (msg.compareTo("test booked") == 0) {

			response.sendRedirect("testBooked");

		}

	}
	
}
