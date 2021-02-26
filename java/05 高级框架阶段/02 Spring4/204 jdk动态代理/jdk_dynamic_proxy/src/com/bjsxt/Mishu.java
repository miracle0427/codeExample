package com.bjsxt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Mishu implements InvocationHandler {
	private Laozong laozong=new Laozong() ;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("预约时间");
		Object result = method.invoke(laozong, args);
		System.out.println("记录访客信息");
		return result;
	}

}
