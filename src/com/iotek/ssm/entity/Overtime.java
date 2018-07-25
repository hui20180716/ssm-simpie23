package com.iotek.ssm.entity;

import java.util.Date;

//加班
public class Overtime {
	
	private int oId;
	private Employees empl;//加班员工  一对一
	private Date begin;
	private Date end;
	private int Overtimes;//加班时长 四舍五入
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public Employees getEmpl() {
		return empl;
	}
	public void setEmpl(Employees empl) {
		this.empl = empl;
	}
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public int getOvertimes() {
		return Overtimes;
	}
	public void setOvertimes(int overtimes) {
		Overtimes = overtimes;
	}
	public Overtime(int oId, Employees empl, Date begin, Date end, int overtimes) {
		super();
		this.oId = oId;
		this.empl = empl;
		this.begin = begin;
		this.end = end;
		Overtimes = overtimes;
	}
	public Overtime() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Overtime [oId=" + oId + ", empl=" + empl + ", begin=" + begin + ", end=" + end + ", Overtimes="
				+ Overtimes + "]";
	}
	
}