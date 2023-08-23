package com.destination.jdbcprograms.day1;

import java.util.*;
import java.sql.*;

public class program1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.print("Driver loaded");
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String pwd = "Mypasssql";

            Connection con = DriverManager.getConnection(url, user, pwd);
            System.out.print("Enter the database name: ");
            String dbName = sc.next();

            Statement stmt = con.createStatement();
            int x = stmt.executeUpdate("CREATE DATABASE " + dbName);

            if (x > 0) {
                System.out.println("Database created");
            } else {
                System.out.println("Database creation failed");
            }
        } catch (Exception e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
    }
}
