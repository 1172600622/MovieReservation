package com.java.been;

import java.util.Date;

public class Indent {
	private int Id;
	private int MId;
	private String OrderTime;
	private int SeatNo;
	public Indent() {
		super();
	}
	public Indent(int id, int mId, String orderTime, int seatNo) {
		super();
		Id = id;
		MId = mId;
		OrderTime = orderTime;
		SeatNo = seatNo;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getMId() {
		return MId;
	}
	public void setMId(int mId) {
		MId = mId;
	}
	public String getOrderTime() {
		return OrderTime;
	}
	public void setOrderTime(String orderTime) {
		OrderTime = orderTime;
	}
	public int getSeatNo() {
		return SeatNo;
	}
	public void setSeatNo(int seatNo) {
		SeatNo = seatNo;
	}
	
	
	
}
