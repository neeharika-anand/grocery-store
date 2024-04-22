

package com.javaproject.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaproject.service.impl.OrderServiceImpl;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");

		if (userName == null || password == null) {

			response.sendRedirect("login.jsp?message=Session Expired, LoginFacade Again!!");
		}

		double paidAmount = Double.parseDouble(request.getParameter("amount"));
		// Create and execute the payment command
		OrderCommand paymentCommand = new PaymentCommand(userName, paidAmount);
		String status = paymentCommand.execute();

		// Forward the request to orderDetails.jsp
		request.setAttribute("status", status);
		request.getRequestDispatcher("orderDetails.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
