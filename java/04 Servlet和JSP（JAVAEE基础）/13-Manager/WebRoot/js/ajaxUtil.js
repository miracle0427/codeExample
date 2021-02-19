/*
				method：接收请求方式。值为get或者post
				url:请求地址
				data:请求数据。使用键值对进行传值，不同的键值对使用&符号隔开，例如:"a=123&b=456";
					如果没有请求数据，传入null即可
				ansyc:设置异步和同步，true表示异步，false表示同步，默认是true
				deal200:接收一个函数对象，用来处理响应数据的函数，函数必须声明一个形参用来接收ajax对象。
				deal404:接收一个函数对象，用来处理404的函数
				deal500:接收一个函数对象，用来处理500错误的函数
				
			*/
			function myAjax(method,url,data,deal200,deal404,deal500,ansyc){
				//使用ajax校验用户名是否存在
					//创建ajax引擎对象
						var ajax;
						if(window.XMLHttpRequest){
							ajax=new XMLHttpRequest();
						}else if(window.ActiveXObject){
							ajax=new ActiveXObject("Msxml2.XMLHTTP");
						}
					//覆写onreadystatechange
						ajax.onreadystatechange=function(){
							//判断ajax状态码
								if(ajax.readyState==4){
									//判断响应状态码
									if(ajax.status==200){
										if(deal200){
											deal200(ajax);
										}
									}else if(ajax.status==404){
										if(deal404){
											deal404();
										}
									}else if(ajax.status==500){
										if(deal500){
											deal500();
										}
									}
								}
								
						}
					//发起请求
						if("get"==method.toLowerCase()){
							//使用get
							ajax.open("get",url+(data==null?"":"?"+data),ansyc);
							//发起请求
							ajax.send(null);
						}else if("post"==method.toLowerCase()){
							ajax.open("post", url,ansyc);
							ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded");	
							ajax.send(data);
						}
						
			}
					