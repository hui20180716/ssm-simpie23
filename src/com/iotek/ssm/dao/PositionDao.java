package com.iotek.ssm.dao;

import java.util.ArrayList;

import com.iotek.ssm.entity.Position;

public interface PositionDao {

	/**
	 * 查找所有职位
	 */
	public ArrayList<Position> findPositionAll();
	
	/**
	 * 通过id 查找职位
	 */
	public Position  findPositionById(int id);
}
