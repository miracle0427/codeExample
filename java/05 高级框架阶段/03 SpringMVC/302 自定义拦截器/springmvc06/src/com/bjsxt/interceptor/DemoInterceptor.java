package com.bjsxt.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class DemoInterceptor implements HandlerInterceptor {
	//在进入控制器之前执行
	//如果返回值为false,阻止进入控制器
	//控制代码
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("arg2:"+arg2);	//拦截的控制器的方法
		System.out.println("preHandle");
		return true;
	}
	//控制器执行完成,进入到jsp之前执行.
	//日志记录.
	//敏感词语过滤
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
		System.out.println("往"+arg3.getViewName()+"跳转");
		System.out.println("model的值"+arg3.getModel().get("model"));
		String word = arg3.getModel().get("model").toString();
		String newWord = word.replace("祖国", "**");
		arg3.getModel().put("model", newWord);
//		arg3.getModel().put("model", "修改后的内容");
		System.out.println("postHandle");
	}
	//jsp执行完成后执行
	//记录执行过程中出现的异常.
	//可以把异常记录到日志中
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("arg3:"+arg3);	//若没有异常arg3为null
		System.out.println("afterCompletion"+arg3.getMessage());
	}
}
