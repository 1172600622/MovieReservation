<%@ page language="java" import="java.util.*,com.java.been.*,com.java.Dao.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>电影</title>
    


  </head>
 
  <body>
     <%
  			MovieDao movieDao = new MovieDao();
			List<Movie> list = movieDao.queryAll();
			
   %>
   <table border >
	   <tr>
			<td>电影编号</td>
			<td>电影名</td>
			<td>电影类型</td>
			<td>放映时间</td>
			<td>持续时间</td>
			<td>电影简介</td>
			<td>票价</td>
			<td>影评</td>
			<td>购票</td>
		</tr>
	  <%
	  	for(int i=0;i<list.size();i++){
	  		Movie movie=list.get(i);
	  %>
  		<tr>
  			<td><%=movie.getMId() %></td>
  			<td><%=movie.getName()%></td>
  			<td><%=movie.getType() %></td>
  			<td><%=movie.getPlayTime() %></td>
  			<td><%=movie.getDuration() %></td>
  			<td><%=movie.getDescribe() %></td>
  			<td><%=movie.getPrice() %></td>
  			<td><a href="ShowC.jsp?MId=<%=movie.getMId() %>">影评</a></td>
  			<td><a href="Seat.jsp?MId=<%=movie.getMId() %>">购票</a></td>
  			
  		</tr>
  		
	<%
	  	}
	%>
	
  </body>
</html>
