package com.iotek.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.TouristService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RequestMapping("/tourist")
@Controller 
public class Controllers {
	
	@Autowired
	private TouristService touristService;
	
	/**
	 * 登陆tourist/register
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/loginTour")//tourist/loginTour
	public String loginTourist(String name,String password) {
		Tourist tour = new Tourist();
		tour.setTname(name);
		tour.setTpassword(password);
		String str = "0";
		if(touristService.loginTourist(tour)) {
			str = "1";
		}
		return str;
	}
/**
 * 注册
 */
	@RequestMapping("/register")//Tourist/String  Tourist/register
	@ResponseBody
	public String registerTourist(String name,String password) {
		System.out.println(12);
		System.out.println(name+","+password);
		Tourist t = new Tourist();
		t.setTname(name);
        t.setTpassword(password);
        int num = touristService.registerTourist(t);
        System.out.println(num);
		return num+"";
	}
	/**
	 * 注册或登录成功后跳转
	 */
		@RequestMapping("/register2")//Tourist/String  Tourist/register
		public String registerTourist2() {
			return "tourists/re01";
		}
		
}
	