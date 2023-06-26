package com.lpu.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DemoDelete {

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
            String sql = "DELETE FROM product WHERE id = " + id;

            int noRec = stmt.executeUpdate(sql);
            if (noRec == 1) {
                System.out.println("Row deleted successfully!");
            } else {
                System.out.println("Failed to delete row or row not found!");
            }

            sc.close();
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
