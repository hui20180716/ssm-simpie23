package com.iotek.ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.TouristDao;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.TouristService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TourstServiceTest {
	
	@Autowired
	private TouristService ts;
	
	//注册
	 @Test
	public void insert() {
		Tourist tour=new Tourist();
		tour.setTname("的撒");
		tour.setTpassword("cc");
		int reg = ts.registerTourist(tour);
		System.out.println(reg);
		
	}

}
