package com.bjsxt;

import java.lang.reflect.Proxy;

public class Women {
	public static void main(String[] args) {
		System.out.println(Women.class.getClassLoader()==Laozong.class.getClassLoader());
		Mishu mishu = new Mishu();
		//第一个参数:反射时使用的类加载器
		//第二个参数:Proxy需要实现什么接口
		//第三个参数:通过接口对象调用方法时,需要调用哪个类的invoke方法
		Gongneng gongneng = (Gongneng) Proxy.newProxyInstance(Women.class.getClassLoader(), new Class[]{Gongneng.class}, mishu);
		
		Laozong laozong = (Laozong) gongneng;
//		gongneng.chifan();
	}
}
