package com.iotek.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.TouristService;

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
           session.setAttribute("Tourist", tourist);;
        }
        System.out.println(num);
		return num+"";
	}
	/**
	 * 注册或登录成功后跳转
	 */
		@RequestMapping("/register2")//Tourist/String  Tourist/register
		public String registerTourist2(String id,HttpServletRequest req) {
			System.out.println("登录或注册成功");
			//System.out.println(id);
			req.setAttribute("id", id);
			return "tourists/welcome";
		}
		/**
		 * 查看所有招聘信息
		 */
		@RequestMapping("recruit")
		public String findJob() {
			return "tourists/re01";
		}
}
	