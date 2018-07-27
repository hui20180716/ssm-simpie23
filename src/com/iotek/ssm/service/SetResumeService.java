package com.iotek.ssm.service;

import java.util.ArrayList;

import com.iotek.ssm.entity.SetResume;

/**
 * 投递简历
 * @author zhanghui
 *
 */
public interface SetResumeService {
 /**
  * 投递简历
  */
	public  int insertSetResume(SetResume serResum);
	
	/* * 查看所有为被查看的简历
	 * 
	 */
	public ArrayList<SetResume> findSetResumeAll();
	
	
	/**
	 * 查看所有为被查看的简历
	 * 
	 */
	public SetResume findSetResumeAllById(int id);
	
	/**
	 * 查看是否未被查看的简历的简历 要去重复投递
	 * 
	 */
	public ArrayList<SetResume>  findNewSetResume();
	
	/**
	 * 修改
	 */
	public int update(SetResume serResum);
	
	/**
	 * 通过id查看游客的简历
	 * 
	 */
	public SetResume findSetResumeByTId(int tid);
		
	
}
