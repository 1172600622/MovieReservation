package com.java.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.java.been.Movie;

public class MovieDao extends BaseDao<Movie> implements Ientity<Movie> {

	@Override
	public Movie getentity(ResultSet result) {
		// TODO Auto-generated method stub
		Movie m = new Movie();
		try {
			m.setMId(result.getInt("MId"));
			m.setName(result.getString("Name"));
			m.setType(result.getString("Type"));
			m.setPlayTime(result.getString("PlayTime"));
			m.setDuration(result.getInt("Duration"));
			m.setDescribe(result.getString("Describe"));
			m.setPrice(result.getInt("Price"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	public int addMovie(Movie m) {
		String sql = "insert movie(`Name`,`Type`,PlayTime,Duration,`Describe`,Price) values ('" + m.getName() + "','"
				+ m.getType() + "','" + m.getPlayTime() + "','" + m.getDuration() + "','" + m.getDescribe() + "','" + m.getPrice() + "')";
		return upSql(sql);
	}
	public int delMovie(int index) {
		String sql = "DELETE FROM movie WHERE MId = '" + index + "'";
		return upSql(sql);
	}
	public int updateMovie(Movie m) {
		String sql = "update movie set Name = '"+m.getName()+"',Type = '"+m.getType()+"',PlayTime = '"
				+m.getPlayTime()+"',Duration = '"+m.getDuration()+"',`Describe` = '"+m.getDescribe()+"',Price = '"+m.getPrice()+"' where MId = "+m.getMId();
		
		return upSql(sql);

	}
	public List<Movie> queryAll() {
		String sql = "select * from movie";
		return querySql(sql, this);
	}
	
	public Movie querybyid(int mid) {
		String sql = "select * from movie where MId='" + mid + "'";
		return queryOne(sql, this);
	}

}
