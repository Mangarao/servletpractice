package com.deloitte.webapp.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Destory method is called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "it is my userdefined servlet";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method is called..");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method is called...");
		
		res.setContentType("text/html");
		res.getWriter().println("Welcome to servlet created implementing Servlet interface");
		
	}
	

}
