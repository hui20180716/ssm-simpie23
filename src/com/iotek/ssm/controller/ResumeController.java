package com.iotek.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.Resume;

@RequestMapping("/resume")
@Controller
public class ResumeController {

	@RequestMapping("/02")
	public String find2() {
		return "tourists/re02";
	}
	
	@RequestMapping("/03")
	public String find3() {
		return "tourists/re03";
	}
	@RequestMapping("/04")
	public String find4() {
		return "resume/resume";
	}
	/**
	 * 填写简历
	 */
		@RequestMapping("/resume")//tourist/resume
		public String resumeTourist(Resume resume) {
			
			System.out.println("00");
			System.out.println(resume);
			
			return "resume/resume2";
		}
	
	
}
