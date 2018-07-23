package com.iotek.ssm.entity;

import java.util.Date;
//考勤表
public class Attendance {

	private int id;
	private Employees  empl;//员工 一对一
	private Date data;//考勤日期
	private Date checkIn;//上班打卡时间
	private Date checkOut;//下班时间
	
}
