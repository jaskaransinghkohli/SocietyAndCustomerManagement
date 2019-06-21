package com.talent4assure.servlet.AdditemModification;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.talent4assure.java.Bean.Bean;
import com.talent4assure.java.BeanDeo.BeanDeo;

@WebServlet("/insertdata")
public class insertdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String itemname=request.getParameter("itemname");
		String itemprice=request.getParameter("itemprice");
		int price=Integer.parseInt(itemprice);
		String shop=request.getParameter("shop");
		String shopadd=request.getParameter("shopadd");
		
		Bean b=new Bean();
		b.setItemName(itemname);
		b.setPrice(price);
		b.setShopName(shop);
		b.setShopAddress(shopadd);
		
		int status=BeanDeo.save(b);
		
		if(status>0)
		{
			
			request.getRequestDispatcher("Shopkeeper").include(request, response);
			out.print("Item Successfully Add:");
		}
		else
		{
			System.out.println("insert data in servlet: ");
		}
	}

}
