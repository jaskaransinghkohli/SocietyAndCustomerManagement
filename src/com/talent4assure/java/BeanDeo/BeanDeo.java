package com.talent4assure.java.BeanDeo;
import com.talent4assure.java.Connection.Connector;
import com.talent4assure.java.Bean.Bean;
import java.sql.*;
import java.util.*;

public class BeanDeo {
	
	
	public static int save(Bean b)
	{
		int status=0;
		try{
			Connection con=Connector.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into addItem (item_name,item_price, shop_name, shop_address) values(?,?,?,?)");
			ps.setString(1, b.getItemName());
			ps.setInt(2, b.getPrice());
			ps.setString(3, b.getShopName());
			ps.setString(4, b.getShopAddress());
			
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("Insert Method"+e);
		}
		return status;
	}
	
	public static  List<Bean> getAllRecord(String shop_name)
	{
		List<Bean> list=new ArrayList<Bean>();
		{
			Connection con=Connector.getConnection();
			try{
			PreparedStatement ps=con.prepareStatement("select * from addItem where shop_name=?");
			ps.setString(1, shop_name);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Bean b=new Bean();
				b.setId(rs.getInt(1));
				b.setItemName(rs.getString(2));
				b.setPrice(rs.getInt(3));
				b.setShopName(rs.getString(4));
				b.setShopAddress(rs.getString(5));
				
				list.add(b);
			}
			
			
			
			}
			catch(Exception ex)
			{
				System.out.println("List Method"+ex);
			}
		}
		return list;	
	}
	
	
	public static Bean getEmployee(int id)
	{
		Bean b=null;
		try{
			
			Connection con=Connector.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from additem where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				b=new Bean();
				b.setId(rs.getInt(1));
				b.setItemName(rs.getString(2));
				b.setPrice(rs.getInt(3));
				b.setShopName(rs.getString(4));
				b.setShopAddress(rs.getString(5));
				
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("Update method"+ex);
		}
		return b;
	}
	
	
	public static int update(Bean b)
	{
		int status=0;
		try{
			
			Connection con=Connector.getConnection();
			PreparedStatement ps=con.prepareStatement("update additem set item_name=?, item_price=?, shop_name=?, shop_address=? where id=?");
			ps.setString(1, b.getItemName());
			ps.setInt(2, b.getPrice());
			ps.setString(3, b.getShopName());
			ps.setString(4, b.getShopAddress());
			ps.setInt(5, b.getId());
			
			status=ps.executeUpdate();
			
		}
		catch(Exception ex)
		{
			System.out.println("Update Method:"+ex);
		}
		return status;
	}
	
	public static int delete(int id)
	{
		int status=0;
		try{
			Connection con=Connector.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from additem where id=?");
			ps.setInt(1, id);
			
			status=ps.executeUpdate();
			
		}
		catch(Exception ex)
		{
			System.out.println("Delete Method:"+ex);
		}
		
		return status;
	}

}
