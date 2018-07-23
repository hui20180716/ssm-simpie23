package com.iotek.ssm.entity;

import java.util.Date;
//任务消息
public class Message {
	
	private int Mid ;
	private Date createtime ;
	private Employees sender =new Employees();//发件人
	private Employees Target = new Employees();//收件人
	private String Context;//消息内容
	private int Course = 0;//出理进程 0 表示生成 1表示处理
	

}
