package com.iotek.ssm.entity;

import java.util.ArrayList;
import java.util.Date;
//培训
public class Train {

	private int tId;
	private String Title;//培训标题
	private Date Time;//培训时间
	private String Details;//培训详情
	private String Speaker;//讲师
	private ArrayList<Employees> emps;//培训员工
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Date getTime() {
		return Time;
	}
	public void setTime(Date time) {
		Time = time;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	public String getSpeaker() {
		return Speaker;
	}
	public void setSpeaker(String speaker) {
		Speaker = speaker;
	}
	public ArrayList<Employees> getEmps() {
		return emps;
	}
	public void setEmps(ArrayList<Employees> emps) {
		this.emps = emps;
	}
	public Train(int tId, String title, Date time, String details, String speaker, ArrayList<Employees> emps) {
		super();
		this.tId = tId;
		Title = title;
		Time = time;
		Details = details;
		Speaker = speaker;
		this.emps = emps;
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Train [tId=" + tId + ", Title=" + Title + ", Time=" + Time + ", Details=" + Details + ", Speaker="
				+ Speaker + ", emps=" + emps + "]";
	}
	
	
	
}
