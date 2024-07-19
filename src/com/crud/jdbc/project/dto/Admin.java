package com.crud.jdbc.project.dto;

public class Admin {

	private int id;
	private String email;
	private String password;
	
	public Admin() {
		super();
		
	}
	public Admin(int id,String email,String password) {
		super();
		this.id=id;
		this.email=email;
		this.password=password;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	 
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	public String getpassword() {
		 return password;
	}
	
	
}
