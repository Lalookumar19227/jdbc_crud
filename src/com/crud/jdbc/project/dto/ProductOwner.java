package com.crud.jdbc.project.dto;

public class ProductOwner {

	private int id;
	private String name;
	private String email;
	private String password;
	private String varify;
	public ProductOwner() {
		super();
		 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVarify() {
		return varify;
	}
	public void setVarify(String varify) {
		this.varify = varify;
	}
	public ProductOwner(int id, String name, String email, String password, String varify) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.varify = varify;
	}
	 
	
}
