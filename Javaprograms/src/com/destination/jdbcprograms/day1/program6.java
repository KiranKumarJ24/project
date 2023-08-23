package com.destination.jdbcprograms.day1;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbccode4";
	          String user = "root";
	          String pwd = "Mypasssql";

	          Connection con = DriverManager.getConnection(url, user, pwd);
	          String sql="delete from student where id=?";
	          PreparedStatement ps = con.prepareStatement(sql);
	          System.out.print("enter the id to be deleted: ");
	          ps.setString(1,sc.next());
	          int x = ps.executeUpdate();
	          if(x>0) {
	        	  System.out.print("deleted");
	          }
	          else {
	        	  System.out.print("deleted failed");
	          }
		}
	         catch(Exception e) {
	        	 e.printStackTrace();
	         }

	}

}
