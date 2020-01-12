package com.java.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.java.been.Indent;

public class IndentDao extends BaseDao<Indent> implements Ientity<Indent>{

	@Override
	public Indent getentity(ResultSet result) {
		// TODO Auto-generated method stub
		Indent i = new Indent();
		try {
			i.setId(result.getInt("Id"));
			i.setMId(result.getInt("MId"));
			i.setOrderTime(result.getString("OrderTime"));
			i.setSeatNo(result.getInt("SeatNo"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	public int addIdent(Indent i) {
		String sql = "insert indent(Id,MId,OrderTime,SeatNo) values ('" + i.getId() + "','" + i.getMId() + "','"
				+ i.getOrderTime() + "','" + i.getSeatNo() + "')";
		System.out.println(sql);
		return upSql(sql);
	}
	public int delIdent(int Id,int MId) {
		String sql = "DELETE FROM indent WHERE Id = '" + Id + "' and '"+MId+"'";
		
		return upSql(sql);
	}
	public int updateIdent(Indent i) {
		String sql = "update indent set Id='" + i.getId() + "',MId='" + i.getMId()
				+ "',OrderTime='" + i.getOrderTime()+ "',SeatNo='" + i.getSeatNo()+ "' where Id=" + i.getId()+"'and MId='"+i.getMId()+"'";
		return upSql(sql);

	}
	public List<Indent> queryAll() {
		String sql = "select * from indent";
		return querySql(sql, this);
	}
	public List<Indent> querybyid(int Id) {
		String sql = "select * from indent where Id=" + Id ;
		return querySql(sql, this);
	}
	public Indent querybyid(int Id,int MId) {
		String sql = "select * from indent where Id='" + Id + "' and MId = '"+MId+"'";
		return queryOne(sql, this);
	}

}
