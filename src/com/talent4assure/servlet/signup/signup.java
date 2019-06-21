package com.talent4assure.servlet.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.talent4assure.java.Connection.Connector;;
/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
  		
  		response.setContentType("text/html");
  		PrintWriter out=response.getWriter();
  		
  		String name=request.getParameter("fullname");
  		String email=request.getParameter("email");
  		String phone=request.getParameter("phoneno");
  		String type=request.getParameter("type");
  		int type1=Integer.parseInt(type);
  		String shopname=request.getParameter("shopname");
  		String shopaddress=request.getParameter("shopaddress");
  		String password=request.getParameter("password");
  		String conformpassword=request.getParameter("conformpassword");
  	
  		try
  		{
  			int i=0;
  		      Connection con=Connector.getConnection();
  		      PreparedStatement ps=con.prepareStatement("insert into signup(name, email, phone_no, type,shop_name, shop_address, password, conform_password) values(?,?,?,?,?,?,?,?)");
  		      ps.setString(1, name);
  		      ps.setString(2, email);
  		      ps.setString(3, phone);
  		      ps.setInt(4, type1);
  		      ps.setString(5, shopname);
  		      ps.setString(6, shopaddress);
  		      ps.setString(7, password);
  		      ps.setString(8, conformpassword);
  		      i=ps.executeUpdate();
  		      if(i>0)
  		      {
  		    	 
  		    	 request.getRequestDispatcher("AlertModel.jsp").forward(request, response);
  		      }
  		      else{
  		      	  request.getRequestDispatcher("errormodel.jsp").forward(request, response);
  		      }
  		      out.println("");
  
  		}
  		catch(Exception e)
  		{
  			System.out.println(e);
  		}
  		  	
	}

}
