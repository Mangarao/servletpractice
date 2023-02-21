package com.deloitte.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet implements SingleThreadModel {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		PrintWriter pw = response.getWriter();
		/*
		 * Cookie c=new Cookie("uname", uname); response.addCookie(c);
		 */
		pw.println("Welcome, "+uname);
		HttpSession session = request.getSession();
		session.setAttribute("uname", uname);
		
		pw.println("<a href='servlet2'> Click here to Servlet2</a>");
		/*
		 * pw.println("<form action='servlet2'>");
		 * pw.println("<input type='hidden' value='"+uname+"' name='uname'/>");
		 * pw.println("<input type='submit' value='Servlet2'/>"); pw.println("</form>");
		 */
		
		
	}

}
