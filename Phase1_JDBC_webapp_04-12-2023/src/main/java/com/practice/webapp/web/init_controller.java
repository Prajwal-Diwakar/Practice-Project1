package com.practice.webapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.webapp.db.DatabaseConnection3;

@WebServlet("/init-connection")
public class init_controller extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		
		// setting content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		

		
	
		
		out.print("<h3>Connection Estanlised.</h3>");
	}

}