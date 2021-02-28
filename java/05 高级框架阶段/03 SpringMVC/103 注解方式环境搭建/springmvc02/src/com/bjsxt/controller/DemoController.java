package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping("demo")
	public String demo(){
		System.out.println("执行demo");
		return "main.jsp";
	}
	@RequestMapping("demo2")
	public String demo2(){
		System.out.println("demo2");
		return "main1.jsp";
	}
}
