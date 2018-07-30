package com.iotek.ssm.entity;

import java.util.Date;
//工资
public class Salary {

	private int sId;
	private int month;//月份
	private Date sendTime;//发放时间 
	private int bass;//基本工资
	private int socialSecurity;//社保
	private int eId;//员工id
	private int performance;//绩效工资
	private int overtime;//加班
	private int salaryAbout;//奖惩
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public int getBass() {
		return bass;
	}
	public void setBass(int bass) {
		this.bass = bass;
	}
	public int getSocialSecurity() {
		return socialSecurity;
	}
	public void setSocialSecurity(int socialSecurity) {
		this.socialSecurity = socialSecurity;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public int getPerformance() {
		return performance;
	}
	public void setPerformance(int performance) {
		this.performance = performance;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	public int getSalaryAbout() {
		return salaryAbout;
	}
	public void setSalaryAbout(int salaryAbout) {
		this.salaryAbout = salaryAbout;
	}
	public Salary(int sId, int month, Date sendTime, int bass, int socialSecurity, int eId, int performance,
			int overtime, int salaryAbout) {
		super();
		this.sId = sId;
		this.month = month;
		this.sendTime = sendTime;
		this.bass = bass;
		this.socialSecurity = socialSecurity;
		this.eId = eId;
		this.performance = performance;
		this.overtime = overtime;
		this.salaryAbout = salaryAbout;
	}
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Salary [sId=" + sId + ", month=" + month + ", sendTime=" + sendTime + ", bass=" + bass
				+ ", socialSecurity=" + socialSecurity + ", eId=" + eId + ", performance=" + performance + ", overtime="
				+ overtime + ", salaryAbout=" + salaryAbout + "]";
	}
	
}
