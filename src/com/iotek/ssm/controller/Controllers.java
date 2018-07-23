package com.iotek.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.dao.TouristDao;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.TouristService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RequestMapping("/Tourist")
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
	@RequestMapping("/register")//
	public String registerTourist(String name,String passwort) {
		Tourist t = new Tourist();
		t.setTname(name);
        t.setTpassword(passwort);
        int num = touristService.registerTourist(t);
        System.out.println(num);
		return null;
	}
}
	