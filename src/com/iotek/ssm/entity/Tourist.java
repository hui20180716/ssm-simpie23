package com.iotek.ssm.entity;
//游客
public class Tourist {

	private int Tid;
	private String Tname;
	private String Tpassword;
	private Resume resume = new Resume();//简历
	private Message messgae = new Message();//任务消息
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTpassword() {
		return Tpassword;
	}
	public void setTpassword(String tpassword) {
		Tpassword = tpassword;
	}
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	public Message getMessgae() {
		return messgae;
	}
	public void setMessgae(Message messgae) {
		this.messgae = messgae;
	}
	@Override
	public String toString() {
		return "Tourist [Tid=" + Tid + ", Tname=" + Tname + ", Tpassword=" + Tpassword + ", resume=" + resume
				+ ", messgae=" + messgae + "]";
	}
	public Tourist(int tid, String tname, String tpassword, Resume resume, Message messgae) {
		super();
		Tid = tid;
		Tname = tname;
		Tpassword = tpassword;
		this.resume = resume;
		this.messgae = messgae;
	}
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
