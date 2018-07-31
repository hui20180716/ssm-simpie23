package com.iotek.ssm.dao;

import java.util.ArrayList;

import com.iotek.ssm.entity.Salary;

public interface SalaryDao {
	/**
	 * 添加
	 */
	public int insertSalary (Salary sa);
	/**
	 * 查询所有
	 */
	public ArrayList<Salary> findSalary();
	/**
	 * 通过id查薪资
	 */
	public Salary findSaryById(int id ) ;

}
