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
<script type="text/javascript">
/* 校验是否是第一页 */
	function checkPre(pn){
		if(pn>1){
			return true;
		}else{
			alert("已经是第一页");
			return false;
		}
		
	}
/*校验是否是最后一页  */
	function checkNext(pn,pages){
		if(pn<pages){
			return true;
		}else{
			alert("已经是最后一页");
			return false;
		}
		
	}

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
    
    
    <table class="tablelist">
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
        <c:forEach items="${p.lu}" var="u">
        	 <tr>
	        <td>${u.uid}</td>
	        <td>${u.uname}</td>
	        <td>${u.pwd}</td>
	      	<td>${u.sex=="1"?'男':'女'}</td>
	        <td>${u.age}</td>
	        <td>${u.birth}</td>
	        </tr>
        </c:forEach>
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
    	<div class="message">共<i class="blue">${p.count}</i>条记录，当前显示第&nbsp;<i class="blue">${p.pageNum}&nbsp;</i>页</div>
        <ul class="paginList">
        <li class="paginItem"><a href="user?oper=show&pageNum=${p.pageNum-1}&pageSize=10" onclick="return checkPre('${p.pageNum}')"><span class="pagepre"></span></a></li>
        <c:forEach begin="1" end="${p.pages}" var="i">
         	<li class="paginItem"><a href="user?oper=show&pageNum=${i}&pageSize=10">${i}</a></li>
        </c:forEach>
        <li class="paginItem"><a href="user?oper=show&pageNum=${p.pageNum+1}&pageSize=10" onclick="return checkNext('${p.pageNum}','${p.pages}')"><span class="pagenxt"></span></a></li>
        </ul>
    </div>
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>

</body>

</html>