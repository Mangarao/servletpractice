package com.deloitte.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/servlet1")
public class MyFilter extends HttpFilter implements Filter {
	static int count=0;
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public MyFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("Filter invoked pre processign the request<br>");
		pw.println("<h1 style='color:red'> Website is under construciton.. Please try later </h1>");
		pw.println("No. of views of your website is: "+(++count));
		long startTime = new Date().getTime();
		chain.doFilter(request, response);
		long endTime = new Date().getTime();
		System.out.println("<br>Total time taken for processing the request: "+(endTime-startTime));
		pw.println("<br>Filter invoked post processign the request<br>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
