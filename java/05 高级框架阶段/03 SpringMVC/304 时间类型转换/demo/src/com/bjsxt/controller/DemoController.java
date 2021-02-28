package com.bjsxt.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.pojo.Demo1;

@Controller
public class DemoController {
	@RequestMapping("demo")
	public String demo( Demo1 demo){
		System.out.println(demo);
		return "abc.jsp";
	}
}
