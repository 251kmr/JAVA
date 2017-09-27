package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	
		//general settings
		 
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		writer.println("hi this is my first application");
		writer.println("<br>");
		writer.println("this is get request");
		
		//requested data gathering
		String uname=request.getParameter("uname");
		String upwd =request.getParameter("upwd");
		
		//business logics
     	if(uname.equals("durga")&&upwd.equals("ratan"))
		{
			writer.println("login success");
			writer.println("user name :"+uname);
			writer.println("user password  :"+upwd);
		}
     	else
     	{
     		writer.println("login fail");
     	}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
