package com.iotek.ssm.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.iotek.ssm.entity.Salary;

@Service
public interface SalaryService {
 
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
