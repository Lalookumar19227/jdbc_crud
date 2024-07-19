package com.crud.jdbc.project.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdminConnection {

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("asdfghjkl");
			
			 return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-a3","root","root");
			
			
			
			
		} catch (Exception e) {
			 
			e.printStackTrace();
			return null;
		}
		
		
		
	}
	
	
	
	
	
}
