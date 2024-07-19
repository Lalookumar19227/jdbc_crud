package com.crud.jdbc.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.crud.jdbc.project.connection.AdminConnection;
import com.crud.jdbc.project.dto.Admin;

 

public class AdminDao {

	 Connection connection=AdminConnection.getConnection();
	
	 private final String INSERTQUERY="insert into admin(id,email,password) values(?,?,?)";
	
	public Admin saveAdmindao(Admin product) {
		 
		try {
			PreparedStatement ps=connection.prepareStatement(INSERTQUERY);
			ps.setInt(1, product.getId());
			ps.setString(2, product.getEmail());
			ps.setString(3, product.getpassword());
			
			ps.execute();
			return product;
			 
		} catch (Exception e) {
			 e.printStackTrace();
			 return null;
		}
	}
	
}
