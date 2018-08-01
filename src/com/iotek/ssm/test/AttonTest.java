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

import com.iotek.ssm.entity.Attendance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class AttonTest {

	@Autowired//AttendanceDao
	private com.iotek.ssm.dao.AttendanceDao attendanceDao;
	
	@Test
	public void insertAtton() {
		Attendance attn = new Attendance();//每天创建一张表
		Date da = new Date();
		attn.setData(da);
		attn.setCheckIn(da);
		//attn.setLateTime(2.5);
		System.out.println(attn);
		attendanceDao.insertAttendance(attn);
	}
	//打卡详情
			public double getworkShift(){
				double days =0.00;
				Date da= new Date();
				String DateStr1 = " 9:00:00";
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String das = dateFormat.format(da);
//				da = dateFormat.parse(das);//把当前时间转化为约束形式
				DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
				 String dateString = dateFormat2.format(da);//模板
				 DateStr1= dateString +	DateStr1;
				Date date;
				try {
					date = dateFormat.parse(DateStr1);
					 long diff =  da.getTime()-date.getTime() ;
					 System.out.println("两个时间差"+diff);
					 days = diff / ( 60 * 60 *1000.0 );
				        System.out.println(days);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//早上9点标准
				return days;
			}
}
