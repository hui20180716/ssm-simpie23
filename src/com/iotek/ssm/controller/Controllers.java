package com.iotek.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.ssm.entity.Dept;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.DeptService;
import com.iotek.ssm.service.TouristService;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RequestMapping("/tourist")
@Controller 
public class Controllers {
	
	@Autowired
	private TouristService touristService;
	// 部门信息
		@Autowired
		private DeptService deptService;
	/**
	 * 登陆tourist/loginTour
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/loginTour")//tourist/loginTour
	public String loginTourist(String name,String password,HttpSession session) {
		System.out.println("登录成功");
		Tourist tour = new Tourist();
		tour.setTname(name);
		tour.setTpassword(password);
	//	System.out.println(tour);
	Boolean b =	touristService.loginTourist(tour);
		System.out.println(b);
		String str = "0";
		if(b) {
			str = "1";
		 
			Tourist tour2 = touristService.findTouristByname(name);
	          session.setAttribute("Tourist", tour2);
	          System.out.println("登录时查到的游客信息"+tour2);;
			
		}
		System.out.println(str);
		return str;
	}
/**
 * 注册
 */
	@RequestMapping("/register")//Tourist/String  Tourist/register
	@ResponseBody
	public String registerTourist(String name,String password,HttpSession session) {
		System.out.println("注册成功");
		System.out.println(name+","+password);
		Tourist t = new Tourist();
		t.setTname(name);
        t.setTpassword(password);
        int num = touristService.registerTourist(t);
        if(num>0) {
           Tourist tourist = touristService.findTouristByname(name);
           session.setAttribute("Tourist", tourist);
          System.out.println("注册查看游客信息"+tourist);
        }
        System.out.println(num);
		return num+"";
	}
	/**
	 * 注册或登录成功后跳转
	 */
		@RequestMapping("/register2")//Tourist/String  Tourist/register
		public String registerTourist2(HttpSession session) {
			System.out.println("登录或注册成功");
			//System.out.println(id);
			Tourist tour =(Tourist)session.getAttribute("Tourist");
			
			session.setAttribute("Tourist", tour);
			System.out.println("通过游客id查找游客"+tour);
			ArrayList<Dept> depts = deptService.findAllDept();
			session.setAttribute("depts", depts);
			System.out.println("登录或注册成功后，把部门信息放进域对象中"+depts);
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
}
	