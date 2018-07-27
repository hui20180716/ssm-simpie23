package com.iotek.ssm.service;

import com.iotek.ssm.entity.Employees;

public interface EmployeeService {

	/**
	 *通过名字查找员工
	 */
	public Employees findEmployeesByName(Employees employees) ;
	/**
	 * 员工登录
	 */
	public int logingEmployees(Employees employees);
}
