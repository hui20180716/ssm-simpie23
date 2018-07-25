package com.iotek.ssm.service;

import java.util.ArrayList;

import com.iotek.ssm.entity.Position;

public interface PositionService  {
	/**
	 * 查询所有职位
	 */
	public ArrayList<Position> findAllPosition();
	/**
	 * 通过id 查找职位
	 */
	public Position findPositionById(int id);

}
