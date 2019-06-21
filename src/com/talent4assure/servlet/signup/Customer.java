package com.talent4assure.servlet.signup;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Customer")
public class Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<br><br>");
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
		   String User=(String)session.getAttribute("name");
			out.print("<h3>Welcome</h3>"+User);
		}
		out.print("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js'></script></head>");
		out.print("<body><div class='container'>"); 
		out.print("<form action='CustomerViewReport' method='post'> ");
		
		
		out.print("<div class='form-group'>");
		out.print("<label for='email'>Product Name:</label><br>");
		out.print("<input type='text'  name='itemname' placeholder='Enter Product Name'>");
		out.print("</div>");
		out.print("<button type='submit' class='btn btn-primary'>Submit</button>");
		out.print("</form><br></div></body></html>");
		request.getRequestDispatcher("Header.jsp").include(request, response);
	}

}
