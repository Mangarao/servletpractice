package com.deloitte.webapp.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet   extends GenericServlet{
	
	public SecondServlet() {
		System.out.println("Second servlet is initialized");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	//	super.init(config);
		System.out.println("init method is called");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		res.getWriter().println("Welcome to servlet crated by extending G.S.Class");
		
	}
	
	

}
