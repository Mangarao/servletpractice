package com.deloitte.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		if ( "123".equals(pwd)) {
			response.sendRedirect("http://google.com/search?q="+uname);
			/*
			 * pw.println("Login successful message from Loginservlet");
			 * request.getRequestDispatcher("/welcome").include(request, response);
			 */
			return;
		}

		pw.println("<h1> Sorry, Login failed</h1>");
		pw.println("<a href='login.html'>Click here to login again <a/>");

	}

}
