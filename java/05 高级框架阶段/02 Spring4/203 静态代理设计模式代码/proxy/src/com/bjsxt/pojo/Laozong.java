package com.bjsxt.pojo;

public class Laozong implements Gongneng {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laozong(String name) {
		super();
		this.name = name;
	}
	public Laozong() {
		super();
	}
	public void zhidingxiaomubiao(){
		System.out.println("制定小目标");
	}
	@Override
	public void chifan() {
		System.out.println("老总吃饭");
	}
}
