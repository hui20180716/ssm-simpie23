package com.iotek.ssm.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.DeptDao;
import com.iotek.ssm.dao.PositionDao;
import com.iotek.ssm.entity.Dept;
import com.iotek.ssm.entity.Position;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class PositionDaoTest {
	@Autowired
	private PositionDao positionDao;
	
	@Test
	public void findAllDept(){
		ArrayList<Position> findPositionAll = positionDao.findPositionAll();
		
       for (Position posi : findPositionAll) {
		System.out.println(posi);
	}
	}
	@Test
	public void findDeptById(){
		Position position = positionDao.findPositionById(1);
		System.out.println(position);
	
	}
}
