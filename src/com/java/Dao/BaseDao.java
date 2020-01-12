package com.java.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BaseDao<T> {
	private Connection getCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/Movie_reservation_system";
			String username = "root";
			String password = "root";

			con = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public int upSql(String sql) {
		Connection con = getCon();
		Statement stmt = null;
		int update = 0;
		try {
			stmt = con.createStatement();
			update = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return update;
	}

	public List<T> querySql(String sql, Ientity<T> ie) {

		Connection con = getCon();
		Statement stmt = null;
		ResultSet result = null;
		List<T> list = null;

		try {
			stmt = con.createStatement();
			result = stmt.executeQuery(sql);
			list = new ArrayList<T>();
			while (result.next()) {
				T t = ie.getentity(result);
				list.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
				}
				if(stmt!=null){
					stmt.close();
				}
				if(con!=null){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;

	}
	public T queryOne(String sql, Ientity<T> ie) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		con = this.getCon();
		T t = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				t = ie.getentity(rs);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return t;
	}
	

}
