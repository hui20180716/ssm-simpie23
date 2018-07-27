package com.iotek.ssm.entity;

import java.util.Date;

//投递简历
public class SetResume {

	private int srId;
	private Tourist tourist;//游客一对一
	private Date srTime;//投递时间
	private int state;//0:未查看；1：查看
	private int interView;//0：未查看；1：不邀请面试；2:邀请面试；3：接受面试
	private Date vmtime;//面试时间
	private int employment;//0:不录用；1：录用
	public int getSrId() {
		return srId;
	}
	public void setSrId(int srId) {
		this.srId = srId;
	}
	
	public Tourist getTourist() {
		return tourist;
	}
	public void setTourist(Tourist tourist) {
		this.tourist = tourist;
	}
	
	public Date getSrTime() {
		return srTime;
	}
	public void setSrTime(Date srTime) {
		this.srTime = srTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getInterView() {
		return interView;
	}
	public void setInterView(int interView) {
		this.interView = interView;
	}
	public int getEmployment() {
		return employment;
	}
	public void setEmployment(int employment) {
		this.employment = employment;
	}
	
	public SetResume(int srId, Tourist tourist, Date srTime, int state, int interView, Date vmtime, int employment) {
		super();
		this.srId = srId;
		this.tourist = tourist;
		this.srTime = srTime;
		this.state = state;
		this.interView = interView;
		this.vmtime = vmtime;
		this.employment = employment;
	}
	@Override
	public String toString() {
		return "SetResume [srId=" + srId + ", tourist=" + tourist + ", srTime=" + srTime + ", state=" + state
				+ ", interView=" + interView + ", vmtime=" + vmtime + ", employment=" + employment + "]";
	}
	public SetResume() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getVmtime() {
		return vmtime;
	}
	public void setVmtime(Date vmtime) {
		this.vmtime = vmtime;
	}
	
	
}
