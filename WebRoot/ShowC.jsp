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
     		int MId = Integer.parseInt(request.getParameter("MId"));
  			CommentDao commentDao = new CommentDao();
			List<Comment> list = commentDao.querybyid(MId);
			Object o = session.getAttribute("Id") ;
			
   %>
   <table border >
		<% 
		if(o!=null){
			int Id=(Integer) o;
		
		%>
   		 <form action="ComManage?Id=<%=Id %>&MId=<%=MId %>" method="post">
   		 	<textarea rows="10" cols="20" name = "comment">
			快来说说你的看法吧。
			</textarea>
			请评分(0~10)：<input type = "text" name="Grade">
			<input type = "submit" value="提交">
   		 </form>
   		<%
   		} 
   		%>
	   <tr>
			<td>用户昵称</td>
			<td>评论</td>
			<td>评论时间</td>
			
		</tr>
	  <%
	  	for(int i=0;i<list.size();i++){
	  		Comment comment=list.get(i);
	  		int Id = comment.getId();
	  		UserDao userDao = new UserDao();
	  		User user = userDao.querybyid(Id);
	  %>
  		<tr>
  			<td><%=user.getName() %></td>
  			<td><%=comment.getComment()%></td>
  			<td><%=comment.getCommentTime()%></td>

  			
  		</tr>
  		
	<%
	  	}
	%>
	
	</table>
  </body>
</html>
