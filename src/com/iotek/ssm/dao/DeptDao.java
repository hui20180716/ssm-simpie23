package com.iotek.ssm.dao;

import java.util.ArrayList;

import com.iotek.ssm.entity.Dept;

public interface DeptDao {
/**
 * 查找所有部门
 */
	public ArrayList<Dept> findAllDept();
	
	/**
	 * 通过id 查找部门
	 */
	public Dept findDeptById(int id);
}
