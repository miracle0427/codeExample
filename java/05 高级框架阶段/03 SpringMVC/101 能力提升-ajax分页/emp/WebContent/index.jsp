<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function(){
	var pageSize = 2;
	var pageNumber = 1;
	var total = 0;
	//默认调用一次,加载数据
	getMyData();
	
	
	//上一页
	$("a:eq(0)").click(function(){
		pageNumber = pageNumber -1;
		if(pageNumber>=1){
			getMyData();
		}else{
			pageNumber = 1;
		}
		return false;
	});
	
	//下一页
	$("a:eq(1)").click(function(){
		pageNumber = pageNumber +1;
		if(pageNumber<=total){
			getMyData();
		}else{
			pageNumber = total;
		}
		return false;
	});
	
	function getMyData(){
		$.post("show",{"pageSize":pageSize,"pageNumber":pageNumber},function(data){
			//总页数
			total = data.total;
			var result = "";
			for(var i = 0 ;i<data.list.length;i++){
				result+="<tr>";
				result+="<td>"+data.list[i].empno+"</td>";
				result+="<td>"+data.list[i].name+"</td>";
				result+="<td>"+data.list[i].dept.name+"</td>";
				result+="</tr>"
			}
			$("#mytbody").html(result);
		})
	}
});
</script>
</head>
<body>
<table border="1">
	<tr>
		<td>员工编号</td>
		<td>姓名</td>
		<td>所在部门</td>
	</tr>
	<tbody id="mytbody"></tbody>
</table>
<a href="">上一页</a>
<a href="">下一页</a>
</body>
</html>