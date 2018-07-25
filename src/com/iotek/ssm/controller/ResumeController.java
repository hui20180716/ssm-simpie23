package com.iotek.ssm.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.service.ResumeService;
import com.iotek.ssm.service.TouristService;

@RequestMapping("/resume")
@Controller
public class ResumeController {

	@Autowired
	private ResumeService resumeService;
	
	@RequestMapping("/02")
	public String find2() {
		return "tourists/re02";
	}
	
	@RequestMapping("/03")
	public String find3() {
		return "tourists/re03";
	}
	/**
	 * 创建简历
	 * @return
	 */
	@RequestMapping("/04")
	public String find4() {
		return "resume/resume";
	}
	/**
	 * 填写简历  返回简历的id 后再添加简历id到有游客表中 
	 */
		@RequestMapping("/resume")//tourist/resume
		public String resumeTourist(Resume resume) {
			System.out.println(resume);
			Date date = new Date();
			resume.setCreatetime(date);
			int a = resumeService.addResume(resume);
			
			System.out.println(a);
			return "resume/resume2";
		}
	/**
	 * 查看简历
	 */
		@RequestMapping("/updateResume")//tourist/resume updateResume
		public String updateResume(int id) {
			/*System.out.println(resume);
			Date date = new Date();
			resume.setCreatetime(date);
			int a = resumeService.addResume(resume);
			System.out.println(a);*/
			return "resume/resume2";
		}	
	
}
