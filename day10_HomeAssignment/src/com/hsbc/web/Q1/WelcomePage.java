package com.hsbc.web.Q1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class WelcomePage
 */
public class WelcomePage extends GenericServlet {
	private static final long serialVersionUID = 1L;
       

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("welcome to servlets programming");
	}

}
