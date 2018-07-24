package com.iotek.ssm.service;

import com.iotek.ssm.entity.Tourist;

public interface TouristService{
	/**
	 * 注册  返回值为0时，则注册失败；返回值为-1时，则此名字已被注册；返回值为1 时注册成功
	 */
	public int registerTourist(Tourist tourist);
	/**
	 * 通过名字查找游客
	 */
	 public Tourist findTouristByname(String name);
	 /**
	  * 登录
	  * @param tourist
	  * @return
	  */
	public boolean loginTourist(Tourist tourist);
}
