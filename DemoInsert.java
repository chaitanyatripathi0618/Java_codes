package com.lpu.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/trng";
		String username = "root";
		String password = "root";
		
		
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection : " + con);
			Scanner sc = new Scanner(System.in);
			Statement stmt = con.createStatement();
			System.out.print("Enter id : ");
			int id = sc.nextInt();
			System.out.print("Enter name : ");
			String name = sc.next();
			System.out.print("Enter price : ");
			double price = sc.nextDouble();
			String sql = "insert into product  values (" + id+ ", '" +name+ "', " + price + ")";
			int noRec = stmt.executeUpdate(sql);
			if (noRec == 1) {
				System.out.println("Row inserted successfully!");
			} else {
				System.out.println("Failed to insert row!");
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
