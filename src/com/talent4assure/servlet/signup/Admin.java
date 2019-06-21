package com.talent4assure.servlet.signup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<br><br>");
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
		   String User=(String)session.getAttribute("name");
		   out.print("<h3>WelcomeAdmin:</h3>"+" "+User);
		}
		
		
		
		
		
		request.getRequestDispatcher("Header.jsp").include(request, response);

	}

}
