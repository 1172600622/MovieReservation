<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>猪猪侠电影订票网</title>
<style type="text/css">
body, html {
	/*overflow-y:hidden;*/
	
}

* {
	margin: 0;
	padding: 0;
}

#register {
	width: 100%;
	height: 150px;
}

.a1 {
	display: inline-block;
	margin: 20px 0 0 50px;
	width: 57px;
	height: 57px;
	border: 2px solid;
	border-color: dimgray;
	border-radius: 50%;
	overflow: hidden;
}

.a2 {
	display: inline-block;
	margin: 3px 0 0 20%;
	color: #e0e1e4;
	font-size: 13px;
	text-decoration: none;
}

#nav {
	background: #393d49;
	/*margin-top:20px;*/
	width: 15%;
	height: 550px;
	float: left;
	/*border-right:1px solid;*/
}

#nav1 {
	margin-top: -20px;
	background: #393d49;
}

#nav1 li {
	display: inline-block;
	width: 75%;
	height: 30px;
	padding-left: 21%;
	overflow: hidden;
	list-style: none;
	padding-top: 10px;
	margin: 0 auto;
	/*border-top: 2px solid;*/
}

#nav1 li:hover {
	background-color: #444959;
}

#nav1 li a {
	text-decoration: none;
	font-size: 15px;
	letter-spacing: 6px;
	color: #e0e1e4;
}

#nav1 li img {
	display: inline-block;
}

#nav2 {
	/*  float: left;*/
	width: 100%;
	height: 65px;
	background: #23262e;
}

#box1 {
	width: 25%;
	height: 100%;
}

#txt1 {
	display: inline-block;
	margin-left: 12%;
	margin-top: 10px;
	font-size: 28px;
	color: white;
}

#box1, #box2 {
	float: left;
}

#box2 {
	width: 20%;
	height: 100%;
}

#nav2 img {
	float: left;
	width: 3%;
	padding-top: 12px;
	margin-left: 30px;
}

#inp {
	display: inline-block;
	width: 100%;
	height: 28px;
	margin-top: 15px;
}

#reg {
	float: right;
	/*background: red;*/
	width: 20%;
	height: 65px;
}

#reg img {
	display: inline-block;
	width: 50px;
	height: 50px;
	border-radius: 50%;
	/*overflow:hidden;*/
}

#reg p {
	display: inline-block;
	color: white;
	margin-left: 8px;
	margin-top: 25px;
	font-size: 15px;
}

#xiton {
	float: left;
	margin-left: 120px;
	width: 15%;
}

#xiton p {
	display: inline-block;
	font-size: 13px;
	color: #e0e1e4;
	margin-right: 40px;
	margin-top: 22px;
}

iframe {
	width: 85%;
	height: 570px;
	overflow-x: hidden;
}
</style>
<script type="text/javascript">
	window.onload = function() {
		var li = document.getElementsByTagName("li");
		for (var i = 0; i < li.length; i++) {
			li[i].num = i;
			li[i].onmousemove = function() {
				var j = this.num;
				li[j].style.backgroundImage = "url(img/bg2.jpg)"
			}
		}
		for (var i = 0; i < li.length; i++) {
			li[i].num = i;
			li[i].onmouseout = function() {
				var j = this.num;
				li[j].style.backgroundImage = "";
			}
		}
	}
</script>
</head>

<body>
	<div id="nav2">
		<div id="box1">
			<p id="txt1">manage管理员系统</p>
		</div>
		<img src="img/hui.png" />&nbsp;
		<div id="box2">
			<input type="text" name="inp" id="inp" value=""
				placeholder="请输入搜索内容并回车" />
		</div>
		<div id="xiton">
			<p>系统公告</p>
			<p>管理须知</p>
		</div>
		<div id="reg">
			<a href="/MoiveReservation/login.jsp"><img src="/MoiveReservation/WebRoot/img/pig.jpg" /></a>
			<p>会飞的猪猪侠</p>
		</div>
	</div>
	<div id="nav">
		<div id="register">
			<a href="/MoiveReservation/login.jsp" class="a1"><img src="img/head.png" /></a> <a
				href="/MoiveReservation/login.jsp" class="a2">会飞的猪猪侠</a>
		</div>
		<div id="nav1">
			<ul id="ul">
			
				<li><a href="AdmShowM.jsp" target="tom">热门电影</a></li>
				<li><a href="AdmShowU.jsp" target="tom">用户管理</a></li>
				<li><a href="AdmShowI.jsp" target="tom">订单管理</a></li>
			</ul>
		</div>
	</div>
	<iframe src="AdmShowM.jsp" name="tom" frameborder="no" scrolling="auto"></iframe>
</body>
</html>
