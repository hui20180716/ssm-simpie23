package com.iotek.ssm.dao;

import java.util.ArrayList;

import com.iotek.ssm.entity.SetResume;

/**
 * 投递简历表
 * @author zhanghui
 *
 */
public interface SetResumeDao {

	/**
	 * 投递简历
	 */
	public int insertSerResume(SetResume serResum) ;
	/**
	 * 查看所有为被查看的简历
	 * 
	 */
	public ArrayList<SetResume> findSetResumeAll();
	
	
	/**
	 * 查看所有为被查看的简历
	 * 
	 */
	public SetResume findSetResumeAllById(int id);
	/**
	 * 修改投递简历
	 * @param serResum
	 * @return
	 */
	public int updateSetResum(SetResume serResum);
	/**
	 * 通过id查看游客的简历
	 * 
	 */
	public ArrayList<SetResume> findSetResumeByTId(int tid);
	
}
