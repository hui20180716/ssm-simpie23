package com.iotek.ssm.entity;

import java.util.Date;

//员工
public class Employees {
	private int id;
	private String name;
	private String password;
	private Date createTime ;
	private Dept dept = new Dept();// 部门 多对一
	private Position posi = new Position();// 职位 一对一
	private Salary salary = new Salary();// 薪资 一对一
	private Attendance atten = new Attendance();// 考勤表
	private Resume resume = new Resume();// 简历
	private Train train = new Train();// 培训
	private SalaryAbout salaryAbout = new SalaryAbout();// 奖惩
	private Overtime overtime = new Overtime();// 加班
	private int status;// 1:在职；0:离职
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Position getPosi() {
		return posi;
	}
	public void setPosi(Position posi) {
		this.posi = posi;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public Attendance getAtten() {
		return atten;
	}
	public void setAtten(Attendance atten) {
		this.atten = atten;
	}
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public SalaryAbout getSalaryAbout() {
		return salaryAbout;
	}
	public void setSalaryAbout(SalaryAbout salaryAbout) {
		this.salaryAbout = salaryAbout;
	}
	public Overtime getOvertime() {
		return overtime;
	}
	public void setOvertime(Overtime overtime) {
		this.overtime = overtime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Employees(int id, String name, String password, Date createTime, Dept dept, Position posi, Salary salary,
			Attendance atten, Resume resume, Train train, SalaryAbout salaryAbout, Overtime overtime, int status) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.createTime = createTime;
		this.dept = dept;
		this.posi = posi;
		this.salary = salary;
		this.atten = atten;
		this.resume = resume;
		this.train = train;
		this.salaryAbout = salaryAbout;
		this.overtime = overtime;
		this.status = status;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", password=" + password + ", createTime=" + createTime
				+ ", dept=" + dept + ", posi=" + posi + ", salary=" + salary + ", atten=" + atten + ", resume=" + resume
				+ ", train=" + train + ", salaryAbout=" + salaryAbout + ", overtime=" + overtime + ", status=" + status
				+ "]";
	}

	
}
