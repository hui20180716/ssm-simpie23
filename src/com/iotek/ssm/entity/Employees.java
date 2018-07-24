package com.iotek.ssm.entity;

import java.util.Date;

//员工
public class Employees {
	private int id;
	private String name;
	private String password;
	private Date createTime;
	private Dept dept;// 部门 多对一
	private Position possition;// 职位 一对一
	private Salary salary;// 薪资 一对一
	private Attendance attendance;// 考勤表
	private Resume resume;// 简历
	private Train train;// 培训
	private SalaryAbout salaryAbout;// 奖惩
	private Overtime overtime;// 加班
	private int status;// 1:在职；0:离职

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Position getPossition() {
		return possition;
	}

	public void setPossition(Position possition) {
		this.possition = possition;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public Attendance getAttendance() {
		return attendance;
	}

	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", password=" + password + ", createTime=" + createTime
				+ ", dept=" + dept + ", possition=" + possition + ", salary=" + salary + ", attendance=" + attendance
				+ ", resume=" + resume + ", train=" + train + ", salaryAbout=" + salaryAbout + ", overtime=" + overtime
				+ ", status=" + status + "]";
	}

	public Employees(int id, String name, String password, Date createTime, Dept dept, Position possition,
			Salary salary, Attendance attendance, Resume resume, Train train, SalaryAbout salaryAbout,
			Overtime overtime, int status) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.createTime = createTime;
		this.dept = dept;
		this.possition = possition;
		this.salary = salary;
		this.attendance = attendance;
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

}
