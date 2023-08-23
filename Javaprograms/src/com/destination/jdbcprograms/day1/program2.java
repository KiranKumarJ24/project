package com.destination.jdbcprograms.day1;
import java.util.*;
import java.sql.*;

public class program2 {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            String url = "jdbc:mysql://localhost:3306/sample";

            String user = "root";
            String pwd = "Mypasssql";

            Connection con = DriverManager.getConnection(url, user, pwd);
            Statement stmt = con.createStatement();

            String createTableQuery = "create table student01 (id int, name varchar(60))";
            int x = stmt.executeUpdate(createTableQuery);

            if (x > 0) {
                System.out.println("Table created");
            } else {
                System.out.println("Table creation failed");
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
    }
}
