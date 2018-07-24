package com.iotek.ssm.entity;

import java.util.ArrayList;
import java.util.Date;

//部门表
public class Dept {
	private int dId;
	private String dName;
	private Date dCreateTime;
	private ArrayList<Position> positionss;
	private ArrayList<Employees> empioyeess;

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Date getdCreateTime() {
		return dCreateTime;
	}

	public void setdCreateTime(Date dCreateTime) {
		this.dCreateTime = dCreateTime;
	}

	public ArrayList<Position> getPositionss() {
		return positionss;
	}

	public void setPositionss(ArrayList<Position> positionss) {
		this.positionss = positionss;
	}

	public ArrayList<Employees> getEmpioyeess() {
		return empioyeess;
	}

	public void setEmpioyeess(ArrayList<Employees> empioyeess) {
		this.empioyeess = empioyeess;
	}

	public Dept(int dId, String dName, Date dCreateTime, ArrayList<Position> positionss,
			ArrayList<Employees> empioyeess) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dCreateTime = dCreateTime;
		this.positionss = positionss;
		this.empioyeess = empioyeess;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dept [dId=" + dId + ", dName=" + dName + ", dCreateTime=" + dCreateTime + ", positionss=" + positionss
				+ ", empioyeess=" + empioyeess + "]";
	}

}
