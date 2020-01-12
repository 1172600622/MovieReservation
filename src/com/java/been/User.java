package com.java.been;

public class User {
	int Id;
	private String UserName;
	private String PassWord;
	private String name;
	private String Phone;
	private boolean Admin;
	
	
	public User(String userName, String passWord, String name, String phone, boolean admin) {
		super();
		UserName = userName;
		PassWord = passWord;
		this.name = name;
		Phone = phone;
		Admin = admin;
	}


	public User() {
		super();
	}


	public User(int id, String userName, String passWord, String name, String phone, boolean admin) {
		super();
		Id = id;
		UserName = userName;
		PassWord = passWord;
		this.name = name;
		Phone = phone;
		Admin = admin;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getPassWord() {
		return PassWord;
	}


	public void setPassWord(String passWord) {
		PassWord = passWord;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}


	public boolean isAdmin() {
		return Admin;
	}


	public void setAdmin(boolean admin) {
		Admin = admin;
	}


	@Override
	public String toString() {
		return "user [Id=" + Id + ", UserName=" + UserName + ", PassWord=" + PassWord + ", name=" + name + ", Phone="
				+ Phone + ", Admin=" + Admin + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (Admin ? 1231 : 1237);
		result = prime * result + Id;
		result = prime * result + ((PassWord == null) ? 0 : PassWord.hashCode());
		result = prime * result + ((Phone == null) ? 0 : Phone.hashCode());
		result = prime * result + ((UserName == null) ? 0 : UserName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (Admin != other.Admin)
			return false;
		if (Id != other.Id)
			return false;
		if (PassWord == null) {
			if (other.PassWord != null)
				return false;
		} else if (!PassWord.equals(other.PassWord))
			return false;
		if (Phone == null) {
			if (other.Phone != null)
				return false;
		} else if (!Phone.equals(other.Phone))
			return false;
		if (UserName == null) {
			if (other.UserName != null)
				return false;
		} else if (!UserName.equals(other.UserName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	

}
