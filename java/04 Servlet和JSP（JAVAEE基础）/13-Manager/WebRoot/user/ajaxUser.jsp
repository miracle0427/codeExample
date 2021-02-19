<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
$(document).ready(function(){
  $(".click").click(function(){
  $(".tip").fadeIn(200);
  });
  
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});

});
</script>

<!--
	分页思路:
		先查询前10条数据返回，当用户点击下一页的时候，再继续查询后10条返回。



  -->
<script type="text/javascript">
		
	//页面加载
		$(function(){
			//声明当前页
				var pn;
			//声明总的页码数
				var pages;
			//获取第一页数据
			getData(1,10);
			
				//封装ajax请求分页数据
				function getData(pageNum,pageSize){
						//请求用户数据
						$.get("/mg/user",{oper:"page",pageNum:pageNum,pageSize:pageSize},function(data){
							//处理响应数据
							//alert(data);
								//使用eval转换数据
								eval("var p="+data);
								//记录当前页面
								pn=p.pageNum;
								pages=p.pages;
								count=p.count;
								//获取表格对象
									var tb=$("#ta tbody");
								//清空
									tb.empty();
								//遍历填充
									for(var i=0;i<p.lu.length;i++){
										tb.append("<tr><td>"+p.lu[i].uid+"</td>"+
									        	"<td>"+p.lu[i].uname+"</td>"+
									        	"<td>"+p.lu[i].pwd+"</td>"+
									        	"<td>"+(p.lu[i].sex==1?"男":"女")+"</td>"+
									        	"<td>"+p.lu[i].age+"</td>"+
									        	"<td>"+p.lu[i].birth+"</td></tr>");
									}
								//显示总的页面数
								$("#count").html(p.count);
								//显示当前页
								$("#page").html(p.pageNum);
								//遍历显示页码
									//获取ul对象
									var ul=$("#num");
									//清空原有内容
									ul.empty();
									//填充
									ul.append("<li class='paginItem'><a href='javascript:;'><span class='pagepre' id='pre'></span></a></li>");
									for(var i=1;i<=p.pages;i++){
										ul.append("<li class='paginItem'><a class='common' href='javascript:;'>"+i+"</a></li>");
									}
									ul.append("<li class='paginItem'><a href='javascript:;'><span class='pagenxt' id='next'></span></a></li>");	
								//下一页
									$("#next").click(function(){
										if(pn<pages){
											getData(pn+1, 10);
										}else{
											alert("已经是最后一页");
										}
										
									})
								//上一页
								$("#pre").click(function(){
									 if(pn>1){
										 getData(pn-1, 10);
									 }else{
										 alert("已经是第一页");
									 }
									})
								//实现页码跳转
								$(".common").click(function(){
									 getData($(this).html(), 10);
								})
						})	
				}		
		})
		
</script>
</head>
<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">管理信息</a></li>
    <li><a href="#">查看用户信息</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
    
    <table class="tablelist" id="ta">
    	<thead>
    	<tr>
        <th>用户ID<i class="sort"><img src="images/px.gif" /></i></th>
        <th>用户名</th>
        <th>密码</th>
        <th>性别</th>
        <th>年龄</th>
        <th>出生年月</th>
        </tr>
        </thead>
        <tbody>
        	
        </tbody>
    </table>
    
    <div class="tip">
    	<div class="tiptop"><span>提示信息</span><a></a></div>
        
      <div class="tipinfo">
        <span><img src="images/ticon.png" /></span>
        <div class="tipright">
        <p>是否确认对信息的修改 ？</p>
        <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
        </div>
        </div>
        
        <div class="tipbtn">
        <input name="" type="button"  class="sure" value="确定" />&nbsp;
        <input name="" type="button"  class="cancel" value="取消" />
        </div>
    
    </div>
     <div class="pagin">
    	<div class="message">共<i id="count" class="blue"></i>条记录，当前显示第&nbsp;<i id="page" class="blue">&nbsp;</i>页</div>
        <ul class="paginList" id="num"></ul>
    </div>
    
    
    
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>

</body>

</html>