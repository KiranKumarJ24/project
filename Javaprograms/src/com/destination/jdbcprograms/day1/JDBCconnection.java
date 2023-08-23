package com.destination.jdbcprograms.day1;
import java.sql.*;
public class JDBCconnection {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbccodes";
		String user="root";
		String pwd="Mypasssql";
		Connection con = DriverManager.getConnection(url,user,pwd);
		if(con!=null)
			System.out.print("Connection established");
		else
			System.out.print("Connection failed");
	}

}
