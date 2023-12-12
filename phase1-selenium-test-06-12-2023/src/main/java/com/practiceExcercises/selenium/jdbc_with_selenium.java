package com.practiceExcercises.selenium;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_with_selenium {
	
	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		JDBC();
		
	}
	
	
	public static void  JDBC() throws SQLException, ClassNotFoundException {
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "1234");
		
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("select * from eproduct");
		
		while (rs.next()) 
		{
			int ID= rs.getInt("ID");
			String name =rs.getString("Name");
			int price=rs.getInt("Price");
			Date date_added=rs.getDate("Date_added");
			System.out.println(ID+"  "+name+"   "+price+"    "+ date_added);
		}
		st.close();
		con.close();
	}


}
