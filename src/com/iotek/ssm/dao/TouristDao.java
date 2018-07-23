package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Tourist;

public interface TouristDao {
	/**
	 * 添加游客(游客注冊)
	 * 
	 * @param tourist
	 * @return
	 */
	public int registerTourist(Tourist tourist);
	/**
	 * 游客登陆 通过名字查对象
	 */
   public Tourist findTouristByname(String name);
	/**
	 * 添加游客(游客填上的)
	 * 
	 * @param tourist
	 * @return
	 */
	//public int insertTouristOne(Tourist tourist);

	/**
	 * 修改游客信息
	 */
	public int updateTourist(Tourist tourist);
}
