package com.iotek.ssm.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.SynthesizedAnnotation;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.AttendanceDao;
import com.iotek.ssm.entity.Attendance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class AttonTest {

	@Autowired // AttendanceDao
	private AttendanceDao attendanceDao;

	/**
	 * 增加一张表
	 */
	@Test
	public void insertAtton() {
		Date da = new Date();
		Attendance atte = attendanceDao.findAttendanceByMaxId();
		Date checkIn = atte.getCheckIn();
		DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
		String checkin = dateFormat2.format(checkIn);
		String da2 = dateFormat2.format(da);
		System.out.println("最大日期"+checkIn);
		System.out.println("最大日期"+checkin);
		System.out.println("最大日期"+da2.equals(checkin));
		if(!da2.equals(checkin)) {
		Attendance attn = new Attendance();// 每天创建一张表
		double days = 0.00;
		String DateStr1 = " 9:00:00";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String das = dateFormat.format(da);
		// da = dateFormat.parse(das);//把当前时间转化为约束形式
		String dateString = dateFormat2.format(da);// 模板
		DateStr1 = dateString + DateStr1;
		Date date;
		try {
			date = dateFormat.parse(DateStr1);
			long diff = da.getTime() - date.getTime();
			System.out.println("两个时间差" + diff);
			days = diff / (60 * 60 * 1000.0);
			System.out.println(days);
			double lateTime = 0;
			if (days > 0) {
				double d = (days % 1);
				System.out.println(d);
				if (d > 0.5) {
					lateTime = (int) days + 1;
				} else if (0 < d && d <= 0.5) {
					lateTime = (int) days + 0.5;
				} else if (d == 0) {
					lateTime = (int) days;
				}
				attn.setLateTime(lateTime);// 迟到的时间
				System.out.println(("你迟到了" + lateTime + "小时"));
			} else {
				System.out.println("你没有迟到了，美好的一天，不是吗");
			}
			
			attn.setData(da);
			attn.setCheckIn(da);
		
			System.out.println(attn);
			attendanceDao.insertAttendance(attn);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 早上9点标准
		}else{
			System.out.println("你已经打过卡了");
		}
	}
/**
 * 下班打卡
 */
	public void checkOut() {
		ArrayList<Attendance> atte = attendanceDao.findAttendanceByEid(12);
		int id=0;
		Attendance atten =new Attendance();
		for (Attendance attendance : atte) {
			//System.out.println(attendance);
			if(attendance.getAid()>id) {
				id= attendance.getAid();
				atten = attendance;		
			}
			
		}
	}
	/**
	 * 查看所有表
	 * 
	 * @return
	 */
	@Test
	public void findAllAtton() {
		ArrayList<Attendance> findAttendanceAll = attendanceDao.findAttendanceAll();
		for (Attendance att : findAttendanceAll) {
			System.out.println(att);
		}
	}

	@Test
	public void findAllAttonById() {
		Attendance atte = attendanceDao.findAttendanceById(8);
		System.out.println(atte);
	}
	@Test //通过游客查找考勤表
	public void findAllAttonByeId() {
		ArrayList<Attendance> atte = attendanceDao.findAttendanceByEid(12);
		int id=0;
		String str = null;
		Attendance atten =new Attendance();
		for (Attendance attendance : atte) {
			//System.out.println(attendance);
			if(attendance.getAid()>id) {
				id= attendance.getAid();
				atten = attendance;
			}
		}
		System.out.println(atten);
		System.out.println(atten.getCheckIn()!=null);
		System.out.println(atten.getCheckIn()!=null&&atten.getCheckOut()==null);
		
		if(atten.getCheckIn()!=null&&atten.getCheckOut()==null) {
			Date da = new Date ();
			atten.setCheckOut(da);
			int at= attendanceDao.updateAttendance(atten);
			System.out.println(at);
			str="打卡成功";
		}else{
			str = "上班未打卡或下班已经打过";
		}
		System.out.println(str);
	}
	@Test
	public void findAllAttonByMaxId() {
		Attendance atte = attendanceDao.findAttendanceByMaxId();
		System.out.println(atte);
	}

	// 打卡详情
	public double getworkShift() {
		double days = 0.00;
		Date da = new Date();
		String DateStr1 = " 9:00:00";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String das = dateFormat.format(da);
		// da = dateFormat.parse(das);//把当前时间转化为约束形式
		DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
		String dateString = dateFormat2.format(da);// 模板
		DateStr1 = dateString + DateStr1;
		Date date;
		try {
			date = dateFormat.parse(DateStr1);
			long diff = da.getTime() - date.getTime();
			System.out.println("两个时间差" + diff);
			days = diff / (60 * 60 * 1000.0);
			System.out.println(days);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 早上9点标准
		return days;
	}
	// 修改
	@Test
	public void update() {
		Attendance atten =new Attendance();
		atten.setAid(9);
		Date da = new Date();
		atten.setCheckIn(da);
		int at= attendanceDao.updateAttendance(atten);
		System.out.println(at);
	}
		
}
