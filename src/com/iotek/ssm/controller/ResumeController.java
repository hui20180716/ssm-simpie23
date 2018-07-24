package com.iotek.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/resume")
@Controller
public class ResumeController {

	@RequestMapping("/02")
	public String find() {
		return "resume/re02";
	}
	
	@RequestMapping("/03")
	public String find2() {
		return "resume/re03";
	}
	@RequestMapping("/04")
	public String find3() {
		return "resume/re04";
	}
	
	@RequestMapping("/05")
	public String find4() {
		return "resume/re05";
	}
	
}
