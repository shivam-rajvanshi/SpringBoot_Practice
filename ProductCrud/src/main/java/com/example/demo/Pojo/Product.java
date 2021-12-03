package com.example.demo.Pojo;

public class Product {

	private int id;
	private static  int idCounter = 0;
	private String name, price, description;
	
	public Product(String name, String price, String description) {
		super();
		this.id = ++idCounter;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Product() {
		super();
	}

	public Product(int id, String name, String price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	
}
