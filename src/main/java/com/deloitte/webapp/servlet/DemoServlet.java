package com.deloitte.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet  extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		/*
		 * ServletConfig sc = getServletConfig(); String driver =
		 * sc.getInitParameter("driver");
		 */
		
		ServletContext sc = getServletContext();
		String un = sc.getInitParameter("username");
		String dn = sc.getInitParameter("dbname");
		
		sc.setAttribute("capital","Hyd");
		System.out.println("capital: "+sc.getAttribute("capital"));
		sc.removeAttribute("capital");
		System.out.println("capital after removing"+sc.getAttribute("capital"));
		
		
		PrintWriter pw = resp.getWriter();
		pw.println("Welcome to Web application development using Servlets");
		pw.println("<br/> Context parameter values passed through web.xml to Servlet context : "+un+" "+dn);
		
	}
	
	

}
