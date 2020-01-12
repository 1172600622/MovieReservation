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

  <div class="box"><h1>添加用户</h1></div>
	<form action="MovieManage?op=addMovie" method="post">

			
			电影名称:<input type="text"	name="Name"	required="required" ><br><br>
			电影类型:<input type="text"	name="Type"	required="required" ><br><br>
			放映时间:<input type="datetime-local"	 step="01" name="PlayTime" 	required="required" ><br><br>
			持续时间:<input type="text"	name="Duration" 	required="required" value=><br><br>
			电影简介:<input type="text"	name="Describe" 	required="required" value=><br><br>
			票价:<input type="text"	name="Price" 	required="required" value=><br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="bu1"	type="submit" value = "添加">
			<input	type="reset" class="bu1" value = "重置">
	</form>		
  </body>
</html>
