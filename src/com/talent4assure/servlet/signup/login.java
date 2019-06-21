package com.talent4assure.servlet.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.talent4assure.java.Connection.Connector;;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("");
		String id=request.getParameter("loginid");
		String password=request.getParameter("loginpassword");
		String email="",phone="",pass="",name="",shop="",shopadd="";
		int type=0;
		try{
			Connection con=Connector.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from signup");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				name=rs.getString(2);
				email=rs.getString(3);
				phone=rs.getString(4);
				type=rs.getInt(5);
				shop=rs.getString(6);
				shopadd=rs.getString(7);
				pass=rs.getString(8);
				
				
				
				if(id.equals(email) || id.equals(phone) && password.equals(pass) )
				{
				
					if(type==1)
					{
						HttpSession session=request.getSession();
						session.setAttribute("name", name);
						session.setAttribute("shop", shop);
						session.setAttribute("shopadd", shopadd);
					request.getRequestDispatcher("Shopkeeper").forward(request, response);
					}
					else if(type==2)
					{
						HttpSession session=request.getSession();
						session.setAttribute("name", name);
						request.getRequestDispatcher("Customer").forward(request, response);
					}
					else if(type==3)
					{
						HttpSession session=request.getSession();
						session.setAttribute("name", name);
						request.getRequestDispatcher("Admin").forward(request, response);
					}
				}
				
		
				
			}
			request.getRequestDispatcher("Home.jsp").forward(request, response);
			
		//	System.out.println(email+" "+phone+" "+type+" "+pass);
			
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
