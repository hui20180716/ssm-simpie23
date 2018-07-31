package com.iotek.ssm.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.SalaryDao;
import com.iotek.ssm.entity.Salary;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SararyTest {
	@Autowired
	private SalaryDao salaryDao;
	
	@Test
	public void isnert() {
		Salary sa = new Salary();
		sa.setMonth(6);
		sa.setOvertime(3);
		int ser = salaryDao.insertSalary(sa);
		System.out.println(ser);
	}
   @Test
   public void  selectSalary() {
	   ArrayList<Salary> sas = salaryDao.findSalary();
	   System.out.println(sas);
	   
   }
   @Test
   public void  selectSalaryById() {
	   Salary sa = salaryDao.findSaryById(1);
	   System.out.println(sa);
	   
   }
}
