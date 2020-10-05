package com.hsbc.web.Q1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class servletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	ServletConfig config=getServletConfig();
	String name=config.getInitParameter("userName");
	String p=config.getInitParameter("password");
	
	ServletContext context=getServletContext();
	String jdbcUrl=context.getInitParameter("jdbcUrl");
	
	
	out.println("Name-> "+name);
	out.println("Password-> "+p);
	out.println("JdbcUrl-> "+jdbcUrl);
	}

}
