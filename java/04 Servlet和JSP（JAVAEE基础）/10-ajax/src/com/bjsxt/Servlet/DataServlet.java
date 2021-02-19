package com.bjsxt.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bjsxt.service.UserSrevice;
import com.bjsxt.serviceImp.UserSeviceImp;
import com.bjsxt.vo.Area;
import com.google.gson.Gson;
@WebServlet("/data")
public class DataServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求编码格式
			req.setCharacterEncoding("utf-8");
		//设置响应编码格式
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=utf-8");
		//获取请求数据
			String pid=req.getParameter("pid");
			System.out.println(pid);
		//处理请求数据
			UserSrevice us=new UserSeviceImp();
			List<Area> list=us.getAreaInfoService(pid);
			System.out.println(list);
		//响应处理结果
			resp.getWriter().write(new Gson().toJson(list));
		
		
	}
}
