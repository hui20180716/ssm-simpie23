package com.iotek.ssm.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.ResumeService;
import com.iotek.ssm.service.TouristService;

@RequestMapping("/resume")
@Controller
public class ResumeController {

	@Autowired
	private ResumeService resumeService;
	@Autowired
	private TouristService touristService;
	
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
	 * 填写简历  返回简历的id 后再添加简历id到有游客表中  a为所添加的id
	 */
		@RequestMapping("/resume")//tourist/resume
		public String resumeTourist(Resume resume,HttpSession session) {
			System.out.println(resume);
			Date date = new Date();
			resume.setCreatetime(date);
			int a = resumeService.addResume(resume);
			Tourist tour = (Tourist)session.getAttribute("Tourist");
			Resume resume2 = resumeService.findResumeById(a);//完整的简历信息
			tour.setResume(resume2); //把简历表填入游客表中
			touristService.updateTourist(tour);//存入数据库中
			 session.setAttribute("Tourist", tour);
			System.out.println(tour);
//			System.out.println(a);
//			System.out.println(resume2);
			System.out.println("简历填写后的游客信息是否填入游客表"+tour);
			return "tourists/welcome";
		}
	/**
	 * 查看/修改简历
	 */
		@RequestMapping("/updateResume")//tourist/resume updateResume
		public String updateResume(HttpServletRequest req,HttpSession session) {
			System.out.println("查看修改简历");
			Tourist tour = (Tourist)session.getAttribute("Tourist");
			System.out.println("修改简历中是否有"+tour);
			Resume resume = resumeService.findResumeById(tour.getResume().getRid());
			req.setAttribute("resume", resume);
			System.out.println(resume);
			return "resume/updateResume";
		}	
	
}
