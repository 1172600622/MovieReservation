package com.java.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.java.been.Comment;

public class CommentDao extends BaseDao<Comment> implements Ientity<Comment> {

	@Override
	public Comment getentity(ResultSet result) {
		// TODO Auto-generated method stub
		Comment c = new Comment();
		try {
			c.setMId(result.getInt("MId"));
			c.setId(result.getInt("Id"));
			c.setComment(result.getString("Comment"));
			c.setCommentTime(result.getString("CommentTime"));
			c.setGrade(result.getInt("Grade"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	public int addComm(Comment c){
		String sql = "insert comment(MId,Id,`Comment`,`CommentTime`,`Grade`) values('"+c.getMId()+"','"+c.getId()+"','"+c.getComment()+"','"+c.getCommentTime()+"','"+c.getGrade()+"')";
		return upSql(sql);
	}
	
	public int delComm(int mid,int id) {
		String sql = "DELETE FROM comment WHERE MId = '" + mid + "' and Id = '"+id+"'" ;
		return upSql(sql);
	}
	public List<Comment> queryAll() {
		String sql = "select * from comment";
		return querySql(sql, this);
	}
	public List<Comment> querybyid(int MId) {
		String sql = "select * from comment where MId=" +MId ;
		return querySql(sql, this);
	}
	public Comment querybyid(int MId,int Id) {
		String sql = "select * from comment where MId='" + MId + "' and Id = '"+Id+"'";
		return queryOne(sql, this);
	}

}
