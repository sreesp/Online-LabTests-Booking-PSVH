package com.psvh.admin.servlet.update;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psvh.db.doa.UserTestsDAO;
import com.psvh.db.pojo.UserTests;


public class UpdateStatusServlet extends HttpServlet {
	
	
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("orderId"));
		String status = request.getParameter("status");
		
		
		UserTestsDAO dao = new UserTestsDAO();
		
		
		
		int msg = dao.updateTest(id, status);
		
		if(msg>0) {
			response.sendRedirect("updated.jsp");
		}
		
	}

}
