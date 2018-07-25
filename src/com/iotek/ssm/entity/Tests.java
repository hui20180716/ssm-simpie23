package com.iotek.ssm.entity;

import java.util.Date;

public class Tests {
	private int id;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Tests(int id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Tests [id=" + id + ", date=" + date + "]";
	}
	public Tests() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
