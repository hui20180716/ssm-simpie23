package com.iotek.ssm.dao;

import java.util.ArrayList;

import com.iotek.ssm.entity.Attendance;

public interface AttendanceDao {
	/**
	 * 添加一张考勤表
	 */
	public int insertAttendance(Attendance atten);
	/**
	 * 修改一张考勤表
	 */
	public int updateAttendance(Attendance atten);
	/**
	 * 查找id最大的考勤表
	 */
	public Attendance findAttendanceByMaxId();
	/**
	 * 通过游客id且最大的考勤表
	 */
	public ArrayList<Attendance> findAttendanceByEid(int id);
	
	/**
	 * 查找id最大的考勤表
	 */
	public Attendance findAttendanceById(int id);
	/**
	 * 查找所有考勤表
	 */
	public ArrayList<Attendance> findAttendanceAll();

}
