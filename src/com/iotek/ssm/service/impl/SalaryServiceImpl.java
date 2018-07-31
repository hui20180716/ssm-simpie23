package com.iotek.ssm.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.SalaryDao;
import com.iotek.ssm.entity.Salary;
import com.iotek.ssm.service.SalaryService;


@Service
public class SalaryServiceImpl implements SalaryService {

	private SalaryDao salaryDao;
	

	@Override
	public int insertSalary(Salary sa) {
		// TODO Auto-generated method stub
		return salaryDao.insertSalary(sa);
	}

	@Override
	public ArrayList<Salary> findSalary() {
		// TODO Auto-generated method stub
		return salaryDao.findSalary();
	}

	@Override
	public Salary findSaryById(int id) {
		// TODO Auto-generated method stub
		return salaryDao.findSaryById(id);
	}
	
}
