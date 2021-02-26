package com.bjsxt.test;

import com.bjsxt.SingleTon;

public class Test {
	public static void main(String[] args) {
		SingleTon singleton = SingleTon.getInstance();
		SingleTon singleton1 = SingleTon.getInstance();
		System.out.println(singleton==singleton1);
	}
}
