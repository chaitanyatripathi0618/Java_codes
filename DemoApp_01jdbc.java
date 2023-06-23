package com.lpu.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/trng";
		String username = "root";
		String password = "root";
		try {
			Class.forName(driver);	
			Connection con = DriverManager.getConnection(url, username,password);
			System.out.println("Connection : " + con);
			con.close();
			System.out.println("Thaank you");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
