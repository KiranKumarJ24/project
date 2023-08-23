package com.destination.jdbcprograms.day1;
import java.util.*;
import java.sql.*;

public class program4 {

  public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          System.out.println("Driver loaded");
          String url = "jdbc:mysql://localhost:3306/jdbccode4";
          String user = "root";
          String pwd = "Mypasssql";

          Connection con = DriverManager.getConnection(url, user, pwd);
          String sql = "insert into jdbccode4 values(?,?)"; 
          PreparedStatement pst = con.prepareStatement(sql);
          System.out.print("Enter the id:");
          pst.setInt(1, sc.nextInt());
          System.out.print("Enter the name:");
          pst.setString(2, sc.next());
          int x = pst.executeUpdate();
          if (x > 0) {
              System.out.println("Database added");
          } else {
              System.out.println("Database addition failed");
          }

          pst.close();
          con.close();
      } catch (Exception e) {
          System.out.println("Exception caught");
          e.printStackTrace();
      }
  }
}
