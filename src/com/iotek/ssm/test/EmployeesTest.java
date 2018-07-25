package com.iotek.ssm.test;


import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.EmployeesDao;
import com.iotek.ssm.entity.Employees;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class EmployeesTest {

	@Autowired
	private EmployeesDao employeesDao;
	
	@Test
	public  void insert() {
		Employees em=new Employees();
		em.setName("aa");
	    em.setPassword("aa");
	    Date da=new Date();
//	    SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String time=formatter.format(da);
//		Date date=formatter.parse(time);	
	    em.setCreateTime(da);
	    em.setStatus(0);
		int inser = employeesDao.insertEmployees(em);
		System.out.println(inser);	
	}

	@Test
	public  void selectAll() {
		ArrayList<Employees> findAllEmployees = employeesDao.findAllEmployees();
		for (Employees employees : findAllEmployees) {
			System.out.println(employees);
		}
	}
}
