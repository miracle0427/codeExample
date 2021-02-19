<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<!-- 
	Ajax请求学习

 -->
<!-- 声明js代码域 -->
<script type="text/javascript">
	function ajaxReq(){
		//获取用户请求数据
		var uname=document.getElementById("uname").value;
		var data="name="+uname;
		//创建ajax引擎对象
		var ajax;
		if(window.XMLHttpRequest){
			ajax=new XMLHttpRequest();
		}else if(window.ActiveXObject){
			ajax=new ActiveXObject("Msxml2.XMLHTTP");
		}
		//复写onreadystatechange函数
		ajax.onreadystatechange=function(){
			//判断ajax状态码
			if(ajax.readyState==4){
				//判断响应状态码
				if(ajax.status==200){
					//获取响应内容
					var result=ajax.responseText;
					//处理响应内容
					alert(result);
				}	
			}	
		}
		//发送请求
			//get方式:请求实体拼接在URL后面
				/* ajax.open("get","ajax?"+data);
				ajax.send(null); */
			//post方式：请求实体需要单独的发送
				ajax.open("post", "ajax");
				ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
				ajax.send("name=张三&pwd=123");
	}
</script>
<style type="text/css">
	#showdiv{
		border:solid 1px;
		width:200px;
		height:100px; 
	}
</style>
</head>
<body>
	<form action="" enctype="application/x-www-form-urlencoded"></form>
	<h3>欢迎登录403峡谷</h3>
	<hr>
	<input type="text" name="uname" id="uname"  value=""/>
	<input type="button" value="测试 " onclick="ajaxReq()"/>
	<div id="showdiv"></div>
</body>
</html>