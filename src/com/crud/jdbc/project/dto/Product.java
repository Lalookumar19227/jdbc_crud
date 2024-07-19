package com.crud.jdbc.project.dto;

import java.time.LocalDate;

public class Product {

	private int id;
	private String name;
	private Double price;
	private String color;
	private LocalDate mfg;
	private LocalDate expd;
	public Product() {
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDate getMfg() {
		return mfg;
	}
	public void setMfg(LocalDate mfg) {
		this.mfg = mfg;
	}
	public LocalDate getExpd() {
		return expd;
	}
	public void setExpd(LocalDate expd) {
		this.expd = expd;
	}
	public Product(int id, String name, Double price, String color, LocalDate mfg, LocalDate expd) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
		this.mfg = mfg;
		this.expd = expd;
	}
	

}
