package com.bjsxt.pojo;

public class People {
	private int id;
	private String name;
	
	
	
	public People() {
		super();
		System.out.println("执行构造方法");
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
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + "]";
	}
}
