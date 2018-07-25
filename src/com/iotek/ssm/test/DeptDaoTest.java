package com.iotek.ssm.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.DeptDao;
import com.iotek.ssm.entity.Dept;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class DeptDaoTest {
	
	@Autowired
	private DeptDao deptDao;
	
	@Test
	public void findAllDept(){
		ArrayList<Dept> AllDept = deptDao.findAllDept();
       for (Dept dept : AllDept) {
		System.out.println(dept);
	}
	}
	@Test
	public void findDeptById(){
		Dept dept = deptDao.findDeptById(1);
		System.out.println(dept);
	
	}
}
