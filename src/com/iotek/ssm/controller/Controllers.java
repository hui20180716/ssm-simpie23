package com.iotek.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;

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
	 * 登陆
	 * @return
	 */
	@RequestMapping("/loginTour")//register
	public String loginTourist() {
		return null;
	}
/**
 * 注册
 */
	@RequestMapping("/register")//Tourist/String  Tourist/register
	public String registerTourist(String name,String password) {
		System.out.println(12);
		System.out.println(name+","+password);
		Tourist t = new Tourist();
		t.setTname(name);
        t.setTpassword(password);
        int num = touristService.registerTourist(t);
        System.out.println(num);
		return "resume";
	}
}
	