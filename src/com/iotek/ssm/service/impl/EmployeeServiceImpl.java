package com.iotek.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.EmployeesDao;
import com.iotek.ssm.entity.Employees;
import com.iotek.ssm.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeesDao employeesDao;
	/**
	 * 员工登录
	 */
	public Employees findEmployeesByName(Employees employees) {
		return employeesDao.findEmployeesByName(employees.getName()) ;
	}
	@Override
	public int logingEmployees(Employees employees) {
		Employees employee = findEmployeesByName(employees);
		//int ser = 0;
		if(employee!=null&&employee.getPassword().equals(employees.getPassword())) {
			return 1;
		}else {
			
		return 0;
		}
	}

}
