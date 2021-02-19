package com.bjsxt.pojo;

public class Flower {
	private int id;
	private String name123;
	private double price;
	private String production;
	public Flower(int id, String name, double price, String production) {
		super();
		this.id = id;
		this.name123 = name;
		this.price = price;
		this.production = production;
	}
	public Flower() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public double getPrice() {
		return price;
	}
	public String getName123() {
		return name123;
	}
	public void setName123(String name123) {
		this.name123 = name123;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	@Override
	public String toString() {
		return "Flower [id=" + id + ", name=" + name123 + ", price=" + price + ", production=" + production + "]";
	}
}
