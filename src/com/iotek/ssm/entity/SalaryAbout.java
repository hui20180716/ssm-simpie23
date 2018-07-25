package com.iotek.ssm.entity;

import java.util.Date;

//奖惩表
public class SalaryAbout {
	
	private int saId;
	private Employees enplouyess;//员工
	private int money;
	private String cause;
	private Date time;
	public int getSaId() {
		return saId;
	}
	public void setSaId(int saId) {
		this.saId = saId;
	}
	public Employees getEnplouyess() {
		return enplouyess;
	}
	public void setEnplouyess(Employees enplouyess) {
		this.enplouyess = enplouyess;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public SalaryAbout(int saId, Employees enplouyess, int money, String cause, Date time) {
		super();
		this.saId = saId;
		this.enplouyess = enplouyess;
		this.money = money;
		this.cause = cause;
		this.time = time;
	}
	public SalaryAbout() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SalaryAbout [saId=" + saId + ", enplouyess=" + enplouyess + ", money=" + money + ", cause=" + cause
				+ ", time=" + time + "]";
	}
	

}
