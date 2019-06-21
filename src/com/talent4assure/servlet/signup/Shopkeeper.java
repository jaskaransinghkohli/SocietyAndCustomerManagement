package com.talent4assure.servlet.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.talent4assure.java.Bean.Bean;
import com.talent4assure.java.BeanDeo.BeanDeo;

/**
 * Servlet implementation class Shopkeeper
 */
@WebServlet("/Shopkeeper")
public class Shopkeeper extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<br><br>");
		String Shop="",Shopadd="";
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
		   String User=(String)session.getAttribute("name");
		   Shop=(String)session.getAttribute("shop");
		   Shopadd=(String)session.getAttribute("shopadd");
		   out.print("<h4>Welcome</h4>"+User+"<br>");
		   out.print(Shop+"<br>");
		   out.print(Shopadd);
		}
		
		
/*		out.print("<html><head>");
		out.print("<meta charset='utf-8'><meta name='viewport' content='width=device-width, initial-scale=1'>");
		out.print("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css'>");
		out.print("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script><script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js'></script>");
	   */ out.print("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js'></script></head>");
		out.print("<body><div class='container'>"); 
		out.print("<form action='insertdata' method='post'> ");
		
		out.print("<input type='hidden'  name='shop' value='"+Shop+"'>");
		out.print("<input type='hidden'  name='shopadd' value='"+Shopadd+"'>");
		
		out.print("<div class='form-group'>");
		out.print("<label for='email'>Item Name:</label><br>");
		out.print("<input type='text'  name='itemname' placeholder='Enter Item Name'>");
		out.print("</div>");
		out.print("<div class='form-group'>");
		out.print("<label for='email'>Rate:</label><br>");
		out.print("<input type='text'  name='itemprice' placeholder='Price' >");
		out.print("</div>");
		out.print("<button type='submit' class='btn btn-primary'>Submit</button>");
		out.print("</form><br><a href='ViewReport'>Delete Record file</a></div></body></html>");
		
		
		
		List<Bean> list=BeanDeo.getAllRecord(Shop);
		out.print("<html><head></head><table width='50%' border='2px' style='position:fixed;right:0px;top:95;'>");
		out.print("<tr><th>ITEM NAME</th><th>PRICE</th><th>SHOP NAME</th><th>ADDRESS</th><th>UPDATE</th></tr>");
		for(Bean b:list)
		{
			out.print("<tr><td>"+b.getItemName()+"</td><td>"+b.getPrice()+"</td><td>"+b.getShopName()+"</td><td>"+b.getShopAddress()+"</td><td><a href='update?id="+b.getId()+"'>UPDATE</a></td><td></td></tr>");
		}
		

	
		
	request.getRequestDispatcher("Header.jsp").include(request, response);
		
		
		
	}

}
