package com.iotek.ssm.entity;

import java.util.Date;
//员工
public class Employees {
  private int id;
  private String password;
  private Date createTime;
  private Dept dept;//部门 多对一
  private  Position possition;//职位 一对一
  private  Salary salary;//薪资 一对一
  private   Attendance attendance;//考勤表
  private  Resume resume;//简历
  private   Train train;//培训
  private   SalaryAbout salaryAbout;//奖惩
  private   Overtime overtime;//加班
  private  int status;//1:在职；0:离职
  
  
  
}
