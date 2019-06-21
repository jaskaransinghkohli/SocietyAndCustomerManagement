package com.talent4assure.java.Connection;


import java.sql.*;


public class Connector {
      
	public static Connection getConnection()
	{
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dwarkasociety","root","root");
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		
		return con;
	}
}
