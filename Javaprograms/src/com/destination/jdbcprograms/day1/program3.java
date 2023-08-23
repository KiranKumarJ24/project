package com.destination.jdbcprograms.day1;
import java.sql.*;
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.print("Driver loaded");
			String url="jdbc:mysql://localhost:3306/jdbccode3";
			String user="root";
			String pwd="Mypasssql";
			
			Connection con = DriverManager.getConnection(url,user,pwd);
			System.out.println("connection established");
			String query = "Select * from student";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()!=false)
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println("-----------");
			}
		}
		catch(Exception e) {
			System.out.print("Exception caught");
			e.printStackTrace();
			}
		}

	}


