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

@WebServlet("/ViewReport")
public class ViewReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Shop="";
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
		  
		   Shop=(String)session.getAttribute("shop");
		   
		}
		
		
		
		
		List<Bean> list=BeanDeo.getAllRecord(Shop);
		out.print("<html><head></head><table width='75%' border='2px' style='position:fixed;right:0px;top:50;'>");
		out.print("<tr><th>ID</th><th>ITEM NAME</th><th>PRICE</th><th>SHOP NAME</th><th>ADDRESS</th><th>UPDATE</th><th>DELETE</th></tr>");
		for(Bean b:list)
		{
			out.print("<tr><td>"+b.getId()+"</td><td>"+b.getItemName()+"</td><td>"+b.getPrice()+"</td><td>"+b.getShopName()+"</td><td>"+b.getShopAddress()+"</td><td><a href='update?id="+b.getId()+"'>UPDATE AND GO TO FORM</a></td><td><a href='delete?id="+b.getId()+"'>delete</a></td></tr>");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
