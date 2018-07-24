package com.iotek.ssm.entity;
//职位表
public class Position {

	private int pId;
	private String pName;
	private Dept dept;
	private int lv;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public Position(int pId, String pName, Dept dept, int lv) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.dept = dept;
		this.lv = lv;
	}
	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Position [pId=" + pId + ", pName=" + pName + ", dept=" + dept + ", lv=" + lv + "]";
	}
	
}
