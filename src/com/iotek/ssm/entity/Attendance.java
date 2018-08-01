package com.iotek.ssm.entity;

import java.util.Date;
//考勤表
public class Attendance {

	private int aid;
	private Employees  empl;//员工 一对一
	private Date data;//考勤日期
	private Date checkIn;//上班打卡时间
	private Date checkOut;//下班时间
	private double lateTime ;//迟到时间
	private  double overTime;//加班时间
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Employees getEmpl() {
		return empl;
	}
	public void setEmpl(Employees empl) {
		this.empl = empl;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public double getLateTime() {
		return lateTime;
	}
	public void setLateTime(double lateTime) {
		this.lateTime = lateTime;
	}
	public double getOverTime() {
		return overTime;
	}
	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}
	public Attendance(int aid, Employees empl, Date data, Date checkIn, Date checkOut, double lateTime, double overTime) {
		super();
		this.aid = aid;
		this.empl = empl;
		this.data = data;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.lateTime = lateTime;
		this.overTime = overTime;
	}
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Attendance [aid=" + aid + ", empl=" + empl + ", data=" + data + ", checkIn=" + checkIn + ", checkOut="
				+ checkOut + ", lateTime=" + lateTime + ", overTime=" + overTime + "]";
	}
	
}
