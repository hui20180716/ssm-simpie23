package com.iotek.ssm.entity;

import java.util.Date;

//员工
public class Employees {
	private int id;
	private String name;
	private String password;
	private Date createTime ;//入职时间
	
	private long cardId;//银行卡号
	private long tel;//电话号码
	private String sex;//性别
	private String email;//邮箱
	private String educal;//学历 
	private int age;//年龄
	
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
	public long getCardId() {
		return cardId;
	}
	public void setCardId(long cardId) {
		this.cardId = cardId;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEducal() {
		return educal;
	}
	public void setEducal(String educal) {
		this.educal = educal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public Employees(int id, String name, String password, Date createTime, long cardId, long tel, String sex,
			String email, String educal, int age, Dept dept, Position posi, Salary salary, Attendance atten,
			Resume resume, Train train, SalaryAbout salaryAbout, Overtime overtime, int status) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.createTime = createTime;
		this.cardId = cardId;
		this.tel = tel;
		this.sex = sex;
		this.email = email;
		this.educal = educal;
		this.age = age;
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
	
	
}