<%@ page language="java"
	import="java.util.*,com.java.Dao.*,com.java.been.*"
	pageEncoding="utf-8"%>


<%
	String username = request.getParameter("username");
	if (username != null && !"".equals(username)) {
		String password = request.getParameter("password");
		UserDao userdao = new UserDao();
		boolean ret = userdao.checkPwd(username, password);
		
		if (ret == true) {
			User user = userdao.querybyUN(username);
			session.setAttribute("username", username);
			session.setAttribute("Id", user.getId());
			
			if (user.isAdmin() == true) {
				response.sendRedirect("admin/index.jsp");
			} else {
				response.sendRedirect("index.jsp");
			}
		} else {
			response.sendRedirect("login.jsp");
		}
	}
%>
<html>
<head>


<title>猪猪侠在线订票</title>


<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

body {
	background-image: url(img/bg3.jpg);
}

#index {
	width: 300px;
	height: 63px;
	background-image: url(img/bg3.png);
	margin: 40px 0 0 50px;
}

#register {
	width: 400px;
	height: 280px;
	background-color: rgba(255, 255, 255, 0.4);
	margin: 40px 0 0 440px;
}

#title {
	width: 380px;
	height: 63px;
	background-image: url(img/bg2.png);
	margin-bottom: 25px;
}

#acc, #pas, #reg {
	width: 280px;
	height: 32px;
	margin-bottom: 18px;
}

#logon {
	width: 50px;
	height: 30px;
	background-color: green;
	border: 0;
	border-radius: 5%;
	font-size: 14px;
}

#reg {
	width: 250px;
	margin-left: 50px;
	border: 0;
	border-radius: 5%;
	background-color: green;
	font-size: 18px;
}

#reg:hover, #logon:hover {
	background-color: darkgreen;
}

#help {
	margin: -10px 0 0 280px;
}

#help a {
	color: black;
}
</style>
</head>

<body>
	<div id="index"></div>
	<div id="register">
		<div id="title"></div>
		<form action="login.jsp" method="post">
			<div>
				&nbsp;&nbsp;&nbsp;&nbsp;账号：<input type="text" name="username"
					id="acc" placeholder="account/请输入账号" />
			</div>
			<div>
				&nbsp;&nbsp;&nbsp;&nbsp;密码：<input type="password" name="password"
					id="pas" placeholder="password/请输入密码" />
			</div>
			<div>
				<input type="submit" id="reg" value="登录" /> <input type="button"
					name="" id="logon" value="注册" />
			</div>
			<div id="help">
				<a href="#">忘记密码</a>
			</div>
		</form>
	</div>
</body>
</html>
