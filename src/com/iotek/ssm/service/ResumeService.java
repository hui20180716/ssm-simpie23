package com.iotek.ssm.service;

import com.iotek.ssm.entity.Resume;

public interface ResumeService {

	/**
	 * 添加简历 返回值为添加后的id
	 */
	public int addResume(Resume resum) ;
	
	/**
	 * 修改简历
	 */
	public int updateResume(Resume resum);
	/**
	 * 通过id 查找简历
	 */
	public Resume findResumeById(int id);
}
