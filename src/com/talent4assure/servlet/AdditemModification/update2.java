package com.talent4assure.servlet.AdditemModification;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.talent4assure.java.Bean.Bean;
import com.talent4assure.java.BeanDeo.BeanDeo;

@WebServlet("/update2")
public class update2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String shop=request.getParameter("shop");
		String shopadd=request.getParameter("shopadd");
		String itemname=request.getParameter("itemname");
		String n=request.getParameter("itemprice");
		int itemprice=Integer.parseInt(n);
		String n1=request.getParameter("id");
		int id=Integer.parseInt(n1);
		
		Bean b=new Bean();
		b.setId(id);
		b.setItemName(itemname);
		b.setPrice(itemprice);
		b.setShopName(shop);
		b.setShopAddress(shopadd);
		
		int i=BeanDeo.update(b);
		if(i>0)
		{
			request.getRequestDispatcher("Shopkeeper").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
		
		
		
	}

}
