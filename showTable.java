package com.lpu.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo_4 {

    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/trng";
        String username = "root";
        String password = "root";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection: " + con);
            Scanner sc = new Scanner(System.in);
            Statement stmt = con.createStatement();
            System.out.print("Enter id: ");
            int id = sc.nextInt();

            String sql = "SELECT * FROM product WHERE id=" + id;
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
            	String name= rs.getString("name");
            	double price= rs.getDouble("price");
            	System.out.println(id+"-"+name+"-"+price);
            	System.out.println("Row found in the database!");
                
            } else {
                System.out.println("Row not found in the database!");
            }

            sc.close();
            rs.close();
            stmt.close();
            con.close();
            System.out.println("Thank you!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
