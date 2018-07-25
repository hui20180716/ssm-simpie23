package com.iotek.ssm.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.iotek.ssm.dao.TestsDao;
import com.iotek.ssm.entity.Tests;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestsTest {

	@Autowired
	private TestsDao testsDao;
	@Test
	public void get() {
		Tests t= new Tests();
		Date tt=new Date();
		t.setDate(tt);
		testsDao.insertTest(t);
	}
}
