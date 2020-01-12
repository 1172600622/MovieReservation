<%@ page language="java" import="java.util.*,com.java.been.*,com.java.Dao.*" pageEncoding="Utf-8"%>
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
			
  			IndentDao indentDao = new IndentDao();
			List<Indent> list = indentDao.queryAll();
			UserDao userDao = new UserDao();
			MovieDao movieDao = new MovieDao();
			
   %>
   <table border >
	   <tr>
			<td>订单日期</td>
			<td>用户昵称</td>
			<td>电影名</td>
			<td>座位号</td>
			<td>放映时间</td>
			<td>影片时长</td>
			<td>删除</td>
			
		</tr>
	  <%
	  	for(int i=0;i<list.size();i++){
	  		Indent indent=list.get(i);
	  		User user = userDao.querybyid(indent.getId());
	  		Movie movie = movieDao.querybyid(indent.getMId());
	  %>
  		<tr>
  			<td><%=indent.getOrderTime() %></td>
  			<td><%=user.getName() %></td>
  			<td><%=movie.getName()%></td>
  			<td><%=indent.getSeatNo() %></td>
  			<td><%=movie.getPlayTime() %></td>
  			<td><%=movie.getDuration() %></td>
  			<td><a href="IndentManage?op=delI&Id=<%=indent.getId() %>&MId=<%=indent.getMId() %>">删除</a></td>
  		</tr>
  		
	<%
	  	}
	%>
  </body>
</html>
