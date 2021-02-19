<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript">
	function getXML(){
		//创建ajax引擎对象
			var ajax;
			if(window.XMLHttpRequest){//火狐
				ajax=new XMLHttpRequest();
			}else if(window.ActiveXObject){//ie
				ajax=new ActiveXObject("Msxml2.XMLHTTP");
			}
		//复写onreadystatechange
			ajax.onreadystatechange=function(){
				//判断Ajax状态吗
				if(ajax.readyState==4){
					//判断响应状态吗
					if(ajax.status==200){
						//获取响应内容
						var doc=ajax.responseXML;
						//处理响应内容
							//获取元素对象
							alert(doc.getElementsByTagName("name")[0].innerHTML);
					}
				}
			}
		//发送请求
			ajax.open("get","xml.jsp",true);
			ajax.send(null);
	}


</script>
</head>
<body>
	<h3>XML数据格式学习</h3>
	<hr>
	<input type="button" value="测试XML" onclick="getXML()" />
	
	
	
</body>
</html>