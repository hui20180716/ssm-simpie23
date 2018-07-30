package com.iotek.ssm.test;


import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.EmployeesDao;
import com.iotek.ssm.entity.Dept;
import com.iotek.ssm.entity.Employees;
import com.iotek.ssm.entity.Position;



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
	    em.setAge(23);
	    Dept d= new Dept();
	    d.setdId(1);
	    em.setDept(d);
	    Position po=new Position();
	    po.setpId(1);
	    em.setPosi(po);
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
	@Test
	public  void selectEmployeesByName() {
		Employees employees = employeesDao.findEmployeesByName("张大人");
		System.out.println(employees);
	}
	@Test
	public  void selectEmployeesByid() {
		Employees employees = employeesDao.findEmployeesById(8);
		System.out.println(employees);
	}
}
