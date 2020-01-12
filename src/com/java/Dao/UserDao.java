package com.java.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.java.been.User;

public class UserDao extends BaseDao<User> implements Ientity<User> {
	
	@Override
	public User getentity(ResultSet result) {
		// TODO Auto-generated method stub
		
		User user = new User();
		try {
			user.setId(result.getInt("Id"));
			user.setUserName(result.getString("UserName"));
			user.setPassWord(result.getString("PassWord"));
			user.setName(result.getString("Name"));
			user.setPhone(result.getString("Phone"));
			user.setAdmin(result.getBoolean("Admin"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
	public int addUser(User u) {
		String sql = "insert user(UserName,PassWord,Name,Phone,Admin) values ('" + u.getUserName() + "','"
				+ u.getPassWord() + "','" + u.getName() + "','" + u.getPhone() + "'," + u.isAdmin() + ")";
		return upSql(sql);
	}
	
	public int delUser(int index) {
		String sql = "DELETE FROM user WHERE Id = '" + index + "'";
		return upSql(sql);
	}
	public int updateAdm(User u) {
		String sql = "update user set `UserName`='" + u.getUserName() + "',`PassWord`='" + u.getPassWord()
				+ "',`Name`='" + u.getName() + "',`Phone`='" + u.getPhone() + "',`Admin`=" + u.isAdmin() + " where Id=" + u.getId();
		System.out.println(sql);
		return upSql(sql);

	}
	
	public List<User> queryAll() {
		String sql = "select * from user";
		return querySql(sql, this);
	}
	public User querybyid(int Id) {
		String sql = "select * from user where Id='" + Id + "'";
		return queryOne(sql, this);
	}
	public User querybyUN(String username) {
		String sql = "select * from user where UserName='" + username + "'";
		return queryOne(sql, this);
	}
	public boolean checkPwd(String username,String password) {
		String sql = "select * from user where UserName='" + username + "'";
		UserDao userdao = new UserDao();
		User user = userdao.queryOne(sql, this);
		System.out.println(user.getPassWord());
		if(password.equals(user.getPassWord())){
			
			return true;
		}else{
			return false;
		}
		
		
	}
	
}
