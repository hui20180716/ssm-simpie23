package com.iotek.ssm.dao;

import java.util.ArrayList;

import com.iotek.ssm.entity.Employees;

public interface EmployeesDao  {
	/**
	 * 添加
	 */
	public int insertEmployees(Employees empl) ;
	/**
	 * 查看所有
	 */
	public ArrayList<Employees> findAllEmployees();
	/**
	 * 通过id 查看员工
	 */
	public Employees findEmployeesById(int id);
	/**
	 * 修改
	 */
	public int updateEmployees();
	/**
	 * 通过id 查看员工
	 */
	public Employees findEmployeesByName(String name);

}
