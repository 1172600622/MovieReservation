<%@ page language="java" import="java.util.*,com.java.been.*,com.java.Dao.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    


  </head>
  
  <body>
  <%
  			UserDao userDao = new UserDao();
			List<User> list = userDao.queryAll();
			
   %>
   <table border="1">
	   <tr>
			<td>用户编号</td>
			<td>用户名</td>
			<td>密码</td>
			<td>昵称</td>
			<td>电话号码</td>
			<td>是否拥有管理员权限</td>
			<td>删除</td>
			<td>修改</td>
		</tr>
	  <%
	  	for(int i=0;i<list.size();i++){
	  		User user=list.get(i);
	  %>
  		<tr>
  			<td><%=user.getId() %></td>
  			<td><%=user.getUserName()%></td>
  			<td><%=user.getPassWord() %></td>
  			<td><%=user.getName() %></td>
  			<td><%=user.getPhone() %></td>
			<td><%=user.isAdmin() %></td>
  			
  			<td><a href="UserManage?op=delUser&Id=<%=user.getId() %>">删除</a></td>
			<td><a href="admin/AdmUpdU.jsp?Id=<%=user.getId() %>">修改</a></td>
  			
  		</tr>
  		
	<%
	  	}
	%>
	<a href="admin/AdmAddU.jsp">添加电影</a>
	</table>
  </body>
</html>
