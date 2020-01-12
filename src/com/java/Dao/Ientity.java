package com.java.Dao;

import java.sql.ResultSet;

public interface Ientity<T> {
	/**
	 * 获取一个实体
	 */
	public T getentity(ResultSet result);
	
	
	
}
