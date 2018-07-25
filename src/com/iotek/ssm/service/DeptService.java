package com.iotek.ssm.service;

import java.util.ArrayList;

import com.iotek.ssm.entity.Dept;

public interface DeptService {

	/**
	 * 查询所有部门
	 */
	public ArrayList<Dept> findAllDept();
	/**
	 * 通过id查询部门
	 */
	public  Dept findDeptById(int id);
}
