package com.iotek.ssm.entity;

import java.util.Date;

//加班
public class Overtime {
	
	private int oId;
	private Employees empl;//加班员工  一对一
	private Date begin;
	private Date end;
	private int Overtimes;//加班时长 四舍五入
}