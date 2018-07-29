package com.iotek.ssm.controller;
//员工登录

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.iotek.ssm.entity.Employees;
import com.iotek.ssm.entity.SetResume;
import com.iotek.ssm.service.EmployeeService;
import com.iotek.ssm.service.SetResumeService;

@RequestMapping("/employees") /// employees/Invitation
@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private SetResumeService setResumeService;

	/**
	 * 员工登录
	 */
	@ResponseBody
	@RequestMapping("/loginTour")
	public String loginEmployees(String name, String password) {
		System.out.println("员工登录");
		String bool = "false";
		Employees empl = new Employees();
		empl.setName(name);
		empl.setPassword(password);
		int res = employeeService.logingEmployees(empl);
		if (res > 0) {
			bool = "true";
		}
		return bool;
	}

	@RequestMapping("menu")
	public String loginSuccessEmployee() {
		System.out.println("员工登录成功");
		return "manager/menu";
	}

	@ResponseBody
	@RequestMapping("setResume") // employees/loginTour setResume
	public String setResumeEmployee() {
		System.out.println("查看是否有新的简历投递");
		ArrayList<SetResume> srs = (ArrayList<SetResume>) setResumeService.findNewSetResume();
		System.out.println("查看是否有新的简历投递" + srs.size());
		//查看是否有面试
		ArrayList<SetResume> ser = setResumeService.findNewInterView();
		System.out.println("有几份面试"+ser);
		ArrayList<Integer> num =new ArrayList<Integer>();
		num.add(srs.size());
		num.add(ser.size());
		return JSON.toJSONString(num);
	}
    //查看新简历  
	@RequestMapping("looksetResume")
	public String lookSetResume(HttpServletRequest req) {
		System.out.println("查看所有新的简历");
		ArrayList<SetResume> srs = (ArrayList<SetResume>) setResumeService.findNewSetResume();
		//查看是否有面试
				ArrayList<SetResume> ser = setResumeService.findNewInterView();
		for (SetResume setResume : srs) {
			System.out.println(setResume);
		}
		req.setAttribute("newResume",srs );
		req.setAttribute("newInterview",ser );
		return "setResume/setResume";
	}
	//邀请面试
	@RequestMapping("Invitation")
	public String Invitation(int rtid,String date) throws ParseException {
		System.out.println("面试邀请 ，投递表的id："+rtid+"面试邀请的时间"+date);
		//修改投递表
		SetResume setResume = setResumeService.findSetResumeAllById(rtid);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//yyyy-mm-dd, 会出现时间不对, 因为小写的mm是代表: 秒
	    Date Date = sdf.parse(date);
		setResume.setVmtime(Date);
		setResume.setInterView(1);
		int ser = setResumeService.update(setResume);
		System.out.println("添加面试时间和面试的resume"+setResume);
		SetResume setResume2 = setResumeService.findSetResumeAllById(rtid);
		System.out.println("添加面试时间和面试的resume后，再从数据库读出来"+setResume2);
		System.out.println( "修改后的投递表"+ser);
		return "manager/menu";
	}
}
