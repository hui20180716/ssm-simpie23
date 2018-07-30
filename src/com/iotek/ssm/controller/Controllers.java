package com.iotek.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.ssm.entity.Dept;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.SetResume;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.DeptService;
import com.iotek.ssm.service.ResumeService;
import com.iotek.ssm.service.SetResumeService;
import com.iotek.ssm.service.TouristService;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RequestMapping("/tourist") // tourist/setResume3
@Controller
public class Controllers {
	@Autowired
	private SetResumeService setResumeService;

	@Autowired
	private TouristService touristService;
	// 部门信息
	@Autowired
	private DeptService deptService;
	@Autowired
	private ResumeService resumeService;
	/**
	 * 登陆tourist/loginTour
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/loginTour") // tourist/loginTour
	public String loginTourist(String name, String password, HttpSession session) {
		System.out.println("登录成功");
		Tourist tour = new Tourist();
		tour.setTname(name);
		tour.setTpassword(password);
		// System.out.println(tour);
		Boolean b = touristService.loginTourist(tour);
		System.out.println(b);
		String str = "0";
		if (b) {
			str = "1";

			Tourist tour2 = touristService.findTouristByname(name);
			session.setAttribute("Tourist", tour2);
			System.out.println("登录时查到的游客信息" + tour2);
			;

		}
		System.out.println(str);
		return str;
	}

	/**
	 * 注册
	 */
	@RequestMapping("/register") // Tourist/String Tourist/register
	@ResponseBody
	public String registerTourist(String name, String password, HttpSession session) {
		System.out.println("注册成功");
		System.out.println(name + "," + password);
		Tourist t = new Tourist();
		t.setTname(name);
		t.setTpassword(password);
		int num = touristService.registerTourist(t);
		if (num > 0) {
			Tourist tourist = touristService.findTouristByname(name);
			session.setAttribute("Tourist", tourist);
			System.out.println("注册查看游客信息" + tourist);
		}
		System.out.println(num);
		return num + "";
	}

	/**
	 * 注册或登录成功后跳转
	 */
	@RequestMapping("/register2") // Tourist/String Tourist/register
	public String registerTourist2(HttpSession session) {
		System.out.println("登录或注册成功");
		// System.out.println(id);
		Tourist tour = (Tourist) session.getAttribute("Tourist");

		session.setAttribute("Tourist", tour);
		System.out.println("通过游客id查找游客" + tour);
		ArrayList<Dept> depts = deptService.findAllDept();
		session.setAttribute("depts", depts);
		System.out.println("登录或注册成功后，把部门信息放进域对象中" + depts);
		return "tourists/welcome";
	}

	/**
	 * 查看所有招聘信息
	 */
	@RequestMapping("recruit")
	public String findJob() {
		System.out.println("查看所有招聘信息");
		return "tourists/re01";
	}

	/**
	 * 修改密码 tourist/ tourist/updatepassword2
	 */
	@RequestMapping("updatePassword")
	public String updatepassword() {
		System.out.println("修改密码1");
		return "tourists/updatepassword";
	}

	/**
	 * 修改密码 data:{"password":a,"newPassword":b}tourist/updatepassword2
	 */
	@RequestMapping("updatepassword2")
	@ResponseBody
	public String updatepassword2(String password, String newPassword, HttpSession session) {
		System.out.println("修改游客密码验证2");
		Tourist tour = (Tourist) session.getAttribute("Tourist");
		if (tour.getTpassword().equals(password)) {
			tour.setTpassword(newPassword);
			System.out.println("修改后的游客密码" + newPassword);
			int res = touristService.updateTourist(tour);
			Tourist tourist = touristService.findTouristById(tour.getTid());
			System.out.println(tourist);
			if (res == 1) {
				return "true";
			} else {
				return "false";
			}
		} else {
			return "false";
		}
	}

	/**
	 * 投递简历 tourist/setResume 就是把自己的简历信息部分发投递表中 setResume
	 */
	@RequestMapping("setResume") // findsetResume
	public String setResume(HttpSession session, HttpServletRequest req) {
		System.out.println("投递简历");
		SetResume setResum = new SetResume();// 创建一个投递表
		Date da = new Date();
		setResum.setSrTime(da);// 加入时间
		Tourist tour = (Tourist) session.getAttribute("Tourist");
		System.out.println("此时游客表中信息" + tour);
		int rId = tour.getResume().getRid();
		if (rId != 0) {
			System.out.println("游客表中的简历rid1" + rId);
			SetResume sr = setResumeService.findSetResumeByTId(tour.getTid());
			if (sr.getState() == 1) {
				req.setAttribute("flage", "f2");
			} else {
				setResum.setTourist(tour);// 加入游客
				int ser = setResumeService.insertSetResume(setResum);// 添加到数据库
				if (ser == 1) {
					req.setAttribute("flage", "ok");
				} else {
					req.setAttribute("flage", "no");
				}
			}
		} else {
			System.out.println("游客表中的简历rid2" + rId);
			req.setAttribute("flage", "false");
		}
		return "tourists/welcome";
	}

	/**
	 * 
	 * 自动查看是否有面试
	 * 
	 * @return
	 */
	@RequestMapping("findsetResume") // tourist/findsetResume
	@ResponseBody
	public String findsetResume(HttpSession session) {
		int ser = 0;
		Tourist tour = (Tourist) session.getAttribute("Tourist");
		System.out.println("查看面试游客表中信息" + tour);
		int tId = tour.getTid();
		SetResume sr = setResumeService.findSetResumeByTId(tId);
		System.out.println("查看面试时的投递表" + sr);
		if (sr.getInterView() == 1) {
			ser = 1;
			System.out.println("说明有面试");
		}
		if (sr.getEmployment() == 1) {
			ser = 2;
			System.out.println("说明通过了面试");
		}

		return ser + "";
	}

	/**
	 * 查看面试进度
	 */
	@RequestMapping("findsetResume2") // tourist/setResume2
	public String findsetResume2(HttpServletRequest req, HttpSession session) {
		Tourist tour = (Tourist) session.getAttribute("Tourist");
		System.out.println("查看面试进度游客表中信息" + tour);
		int tId = tour.getTid();
		SetResume sr = setResumeService.findSetResumeByTId(tId);
		System.out.println("查看面试进度的投递表" + sr);
		req.setAttribute("newResume", sr);
		if (sr == null) {
			System.out.println("没有setresume");
			req.setAttribute("flage", "no2");
			return "tourists/welcome";
		}
		return "tourists/setresume";
	}

	/**
	 * 查看面试进度 //setResume
	 */
	@RequestMapping("findsetResume3") // tourist/setResume3 tourist/setResume3
	public String findsetResume3(String bolean, HttpSession session) {
		System.out.println("查看游客是否接受面试" + bolean);
		Tourist tour = (Tourist) session.getAttribute("Tourist");
		System.out.println("查看面试进度游客表中信息" + tour);
		int tId = tour.getTid();
		SetResume sr = setResumeService.findSetResumeByTId(tId);
		System.out.println("查看面试进度的投递表" + sr);
		if (bolean.equals("true")) {
			sr.setInterView(2);
		} else {
			sr.setInterView(3);
		}
		int ser = setResumeService.insertSetResume(sr);// 添加到数据库
		System.out.println("是否添加成功 1:成功；0未成功" + ser);
		return "tourists/welcome";
	}

	/**
	 * 填写用户表
	 */
	@RequestMapping("insertEmployees")
	public String insertEnployee(HttpServletRequest req, HttpSession session) {
		Tourist tour = (Tourist) session.getAttribute("Tourist");
		System.out.println("填用户表" + tour);
		int tId = tour.getTid();
		SetResume sr = setResumeService.findSetResumeByTId(tId);
		System.out.println("填写用户表时的投递表" + sr);
		int rId = tour.getResume().getRid();
		Resume resume = resumeService.findResumeById(rId);
		System.out.println("这位游客的简历"+resume);
		req.setAttribute("resume", "resume");
		if (sr.getEmployment() != 2) {
			System.out.println("没有录用");
			req.setAttribute("flage", "no3");
			return "tourists/welcome";
		}
		return "employee/employee";
	}
	
}
