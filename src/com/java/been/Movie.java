package com.java.been;

import java.util.Date;

public class Movie {
	public Movie(String name, String type, String playTime, int duration, String describe, int price) {
		super();
		Name = name;
		Type = type;
		PlayTime = playTime;
		Duration = duration;
		Describe = describe;
		this.price = price;
	}
	private int MId;
	private String Name;
	private String Type;
	private String PlayTime;
	private int Duration;
	private String Describe;
	private int price;
	public Movie() {
		super();
	}
	public Movie(int mId, String name, String type, String playTime, int duration, String describe, int price) {
		super();
		MId = mId;
		Name = name;
		Type = type;
		PlayTime = playTime;
		Duration = duration;
		Describe = describe;
		this.price = price;
	}
	public int getMId() {
		return MId;
	}
	public void setMId(int mId) {
		MId = mId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getPlayTime() {
		return PlayTime;
	}
	public void setPlayTime(String playTime) {
		PlayTime = playTime;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public String getDescribe() {
		return Describe;
	}
	public void setDescribe(String describe) {
		Describe = describe;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
