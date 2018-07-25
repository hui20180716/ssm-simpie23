package com.iotek.ssm.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.DeptDao;
import com.iotek.ssm.entity.Dept;
import com.iotek.ssm.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	public DeptDao deptDao;

	@Override
	public ArrayList<Dept> findAllDept() {
		return deptDao.findAllDept();
	}

	@Override
	public Dept findDeptById(int id) {
		return deptDao.findDeptById(id);
	}

}
