package com.iotek.ssm.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	 Tourist to = tourist.findTouristById(55);
	 System.out.println(to);
 }
 
 @Test
 public void findTByName() {
	 Tourist to = tourist.findTouristByname("a123456");
	 System.out.println(to);
 }
 @Test
 public void update() {
	 Tourist tour = new Tourist();
	 //tour.setMessgae(messgae);
	 tour.setTid(49);
	 tour.setTname("a123456");
	 tour.setTpassword("a1234567");
	 Resume resume = new Resume();
	 resume.setRid(17);
	 tour.setResume(resume);
	 int num = tourist.updateTourist(tour);
	 System.out.println(num);
 }
 @Test
 public void update2() {
	 String DateStr1 = " 9:00:00";
	 String DateStr2 = " 15:50:35";
	 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 Date da = new Date();
	 DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
	 String dateString = dateFormat2.format(da);
	 DateStr1=dateString+DateStr1;
	 DateStr2=dateString+DateStr2;
	 System.out.println(DateStr1);
	 System.out.println(DateStr2);
	 Date dateTime1;
	try {
		dateTime1 = dateFormat.parse(DateStr1);
		Date dateTime2 = dateFormat.parse(DateStr2);
		int i = dateTime1.compareTo(dateTime2); 
		System.out.println(i );
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 @Test
 public  void getWeek(){
	 Date da = new Date();
	 
	 String DateStr2 = "2018-7-31 9:00:00";
	 
	 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	// Date dateTime1 = dateFormat.parse(DateStr1);
	 try {
		Date dateTime2 = dateFormat.parse(DateStr2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		String week = sdf.format(dateTime2);
        // 得到微秒级别的差值
        long diff = dateTime2.getTime() - da.getTime();
       System.out.println(diff);
        // 将级别提升到天
        double days = diff / ( 60 * 60  );
        System.out.println(days);
        double d=(-days %1000);
        System.out.println(d);
        if(d>500) {
        	
        	System.out.println( -days/1000+"是吗");
        }else { 
        	System.out.println( days);
        }
	} catch (ParseException e) {
		
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	 }
 @Test
 public void getWeek2(){
	 Date da= new Date();
		String DateStr1 = " 9:00:00";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String das = dateFormat.format(da);
		try {
			da = dateFormat.parse(das);
			DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
			String dateString = dateFormat2.format(da);
			DateStr1= dateString +	DateStr1;
			Date date= dateFormat.parse(DateStr1);//早上9点标准
			int i = date.compareTo(da); 
			
			if(i<0) {
				System.out.println("你迟到了");
			}else {
				System.out.println("你没有迟到");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//把当前时间转化为约束形式
	 }
 @Test
 public  void getWeek3(){
	 Date da = new Date();
	 
	 String DateStr2 = "2018-7-31 9:00:00";
	 
	 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	 try {
		Date dateTime2 = dateFormat.parse(DateStr2);
        long diff = dateTime2.getTime() - da.getTime();
       System.out.println("两个时间差"+diff);
        // 将级别提升到天
        double days = diff / ( 60 * 60  );
        System.out.println(days);
        double d=(-days %1000);
        System.out.println(d);
//        if(d>500) {
//        	
//        	System.out.println( -days/1000+"是吗");
//        }else { 
//        	System.out.println( days);
//        }
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	 }
}
