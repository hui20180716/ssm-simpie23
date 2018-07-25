package com.iotek.ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.TouristDao;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.Tourist;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TouristDaoTest {
 @Autowired
	private TouristDao tourist;
 /*@Autowired
 private Tour*/
 
 @Test
 public void insert() {
	 Tourist tour = new Tourist();
	 //tour.setMessgae(messgae);
	 tour.setTname("bb");
	 tour.setTpassword("bb");
	 int ser = tourist.registerTourist(tour);
	 System.out.println(ser);
 }
 @Test
 public void login() {
	 boolean b = false;
	 //Tourist tour = new Tourist();
	 //tour.setMessgae(messgae);loginTourist
	//try {
	 Tourist t = tourist.findTouristByname("cc");
	// if(t.getTpassword().equals("bb")) {
		 b=true;
	// }
	 System.out.println(t);
	//}
	//catch(NullPointerException e) {
	//	System.out.println("没有");
	//}
 }
 @Test
 public void findTById() {
	 Tourist to = tourist.findTouristById(46);
	 System.out.println(to);
 }
 
 @Test
 public void findTByName() {
	 Tourist to = tourist.findTouristByname("a1234567");
	 System.out.println(to);
 }
 @Test
 public void update() {
	 Tourist tour = new Tourist();
	 //tour.setMessgae(messgae);
	 tour.setTid(44);
	 tour.setTname("r123456");
	 tour.setTpassword("bb");
	 Resume resume = new Resume();
	 resume.setRid(13);
	 tour.setResume(resume);
	 int num = tourist.updateTourist(tour);
	 System.out.println(num);
 }
}
