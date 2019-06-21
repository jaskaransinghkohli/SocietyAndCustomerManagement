package com.talent4assure.servlet.AdditemModification;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.talent4assure.java.Connection.Connector;

/**
 * Servlet implementation class CustomerViewReport
 */
@WebServlet("/CustomerViewReport")
public class CustomerViewReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
				
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String itemname=request.getParameter("itemname");
		request.getRequestDispatcher("Customer").include(request, response);
		/*String Shop="";
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
		  
		   Shop=(String)session.getAttribute("shop");
		   out.print(Shop);
		   
		}
		*/
		
		
		try{
			Connection con=Connector.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from additem where item_name=?");
			ps.setString(1, itemname);
			ResultSet rs=ps.executeQuery();
			out.print("<html><head></head><table width='50%' border='2px' style='position:fixed;right:0px;top:50;'>");
			out.print("<tr><th>ITEM NAME</th><th>PRICE</th><th>SHOP NAME</th><th>ADDRESS</th></tr>");

			while(rs.next())
			{

				out.print("<tr><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr>");
			}
			
			
		}
		 catch(Exception ex)
		{
			 System.out.println("Customer View Report:"+ex);
		}

	}

}
