package com.iotek.ssm.dao;

import java.util.ArrayList;

import com.iotek.ssm.entity.Resume;

public interface ResumeDao {
	/**
	 * 通过id查看简历
	 * @param id
	 * @return
	 */
	public  Resume findResumeById(int id) ;
	/**
	 * 查看所有人简历
	 */
	public ArrayList<Resume> findAllResume();
	/**
	 * 修改简历
	 */
    public int updateResumeByid(Resume resum);
    /**
     * 删除简历 通过id
     */
    public int deleteResumeById(int id);
    
    /**
	 * 添加简历 truncate
	 */
    public int insertResumeByid(Resume resum);
    /**
     * 查询数据库中最大的id
     */
    public int selectMaxId();
 }
