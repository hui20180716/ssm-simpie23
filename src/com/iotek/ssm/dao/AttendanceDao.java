package com.iotek.ssm.dao;

import java.util.ArrayList;

import com.iotek.ssm.entity.Attendance;

public interface AttendanceDao {
	/**
	 * 添加一张考勤表
	 */
	public int insertAttendance(Attendance atten);
	/**
	 * 查找id最大的考勤表
	 */
	public Attendance findAttendanceByMaxId();
	/**
	 * 查找所有考勤表
	 */
	public ArrayList<Attendance> findAttendanceAll();

}
