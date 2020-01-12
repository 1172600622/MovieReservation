<%@ page language="java" import="java.util.*,com.java.been.*,com.java.Dao.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	

  </head>
  <style type="text/css">
body{
padding-left:400px;
background-color:white;
}
input{
width:200px;
background-color:rgba(255,255,255,0.6);
}
.box{
padding-left:80px;
}
.bu1{
width:70px;
margin:23px;
border-radius:20px;
}
.bu1:hover{
background-color:forestgreen;
}
.bu1:active{
background-color:green;
}
</style>
  <body>
  <%
  
  int Id =Integer.parseInt(request.getParameter("Id")) ;
  UserDao userDao = new UserDao();
  User user = userDao.querybyid(Id);
   %>
  <div class="box"><h1>添加用户</h1></div>
	<form action="UserManage?op=updUser&Id=<%=user.getId() %>" method="post">

			
			用户名:<input type="text"	name="userName"	required="required" value="<%=user.getUserName()%>"><br><br>
			密码:<input type="text"	name="passWord"	required="required" value="<%=user.getPassWord()%>"><br><br>
			用户昵称:<input type="text" name="name" 	required="required" value="<%=user.getName()%>"><br><br>
			电话:<input type="text"	name="phone" 	required="required" value="<%=user.getPhone()%>"><br><br>
			是否拥有管理权限:<input type="text"	name="admin" 	required="required" value="<%=user.isAdmin() %>"><br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="bu1"	type="submit" value = "添加">
			<input	type="reset" class="bu1" value = "重置">
	</form>		
  </body>
</html>
