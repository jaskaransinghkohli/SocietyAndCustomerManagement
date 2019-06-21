package com.talent4assure.servlet.AdditemModification;

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

@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String n=request.getParameter("id");
		int id=Integer.parseInt(n);
		Bean b1=BeanDeo.getEmployee(id);
		
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
		
		
	    out.print("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js'></script></head>");
		out.print("<body><div class='container'>"); 
		out.print("<form action='update2' method='post'> ");
		
		out.print("<input type='hidden'  name='shop' value='"+Shop+"'>");
		out.print("<input type='hidden'  name='shopadd' value='"+Shopadd+"'>");
		out.print("<input type='hidden'  name='id' value='"+b1.getId()+"'>");
		out.print("<div class='form-group'>");
		out.print("<label for='email'>Item Name:</label><br>");
		out.print("<input type='text'  name='itemname'  value="+b1.getItemName()+" >");
		out.print("</div>");
		out.print("<div class='form-group'>");
		out.print("<label for='email'>Rate:</label><br>");
		out.print("<input type='text'  name='itemprice'  value="+b1.getPrice()+"  >");
		out.print("</div>");
		out.print("<button type='submit' class='btn btn-primary'>Submit</button>");
		out.print("</form><br></div></body></html>");
		
		
		
		List<Bean> list=BeanDeo.getAllRecord(Shop);
		out.print("<html><head></head><table width='50%' border='2px' style='position:fixed;right:0px;top:95;'>");
		out.print("<tr><th>ITEM NAME</th><th>PRICE</th><th>SHOP NAME</th><th>ADDRESS</th><th>UPDATE</th><th>DELETE</th></tr>");
		for(Bean b:list)
		{
			out.print("<tr><td>"+b.getItemName()+"</td><td>"+b.getPrice()+"</td><td>"+b.getShopName()+"</td><td>"+b.getShopAddress()+"</td><td><a href='update?id="+b.getId()+"'>UPDATE</a></td><td><a href='delete?id="+b.getId()+"'>DELETE</a></td></tr>");
		}
		

	
		
	request.getRequestDispatcher("Header.jsp").include(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
