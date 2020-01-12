package com.java.been;

import java.util.Date;

public class Comment {
	private int MId;
	private int Id;
	private String Comment;
	private String CommentTime; 
	private float Grade;
	public Comment() {
		super();
	}
	public Comment(int mId, int id, String comment, String commentTime, float grade) {
		super();
		MId = mId;
		Id = id;
		Comment = comment;
		CommentTime = commentTime;
		Grade = grade;
	}
	public int getMId() {
		return MId;
	}
	public void setMId(int mId) {
		MId = mId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public String getCommentTime() {
		return CommentTime;
	}
	public void setCommentTime(String commentTime) {
		CommentTime = commentTime;
	}
	public float getGrade() {
		return Grade;
	}
	public void setGrade(float grade) {
		Grade = grade;
	}
	
	
	
}
