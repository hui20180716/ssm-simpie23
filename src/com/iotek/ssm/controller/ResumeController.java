package com.iotek.ssm.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.Dept;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.SetResume;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.DeptService;
import com.iotek.ssm.service.PositionService;
import com.iotek.ssm.service.ResumeService;
import com.iotek.ssm.service.SetResumeService;
import com.iotek.ssm.service.TouristService;

@RequestMapping("/resume")//resume/showResume
@Controller
public class ResumeController {

	@Autowired
	private ResumeService resumeService;

	@Autowired
	private TouristService touristService;
	// 部门信息
	@Autowired
	private DeptService deptService;
	
	@Autowired
	private SetResumeService setResumeService;

	// 职位信息
	@Autowired
	private PositionService positionService;

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
	 * 
	 * @return
	 */
	@RequestMapping("/04")
	public String find4(HttpSession session) {
		/*ArrayList<Dept> depts = deptService.findAllDept();//resume/employment
		session.setAttribute("depts", depts);*/
		System.err.println("去创建简历");
		return "resume/resume";
	}

	/**
	 * 填写简历 返回简历的id 后再添加简历id到有游客表中 a为所添加的id
	 */
	@RequestMapping("/resume") // tourist/resume
	public String resumeTourist(Resume resume, HttpSession session) {
		System.out.println("收到填写的id");
		System.out.println("从简历中获取的简历信息" + resume);
		Date date = new Date();
		resume.setCreatetime(date);
		// 获取简历中的职位信息，查到完整部门信息和职位的完整信息
		int did = resume.getDept().getdId();
		Dept dept = deptService.findDeptById(did);
		int pid = resume.getPosi().getpId();
		Position posi = positionService.findPositionById(pid);
		resume.setDept(dept);
		resume.setPosi(posi);
		System.out.println("从数据库中获取完整部门和职位的简历信息" + resume);
		int a = resumeService.addResume(resume);//把简历填入到数据库中
		Tourist tour = (Tourist) session.getAttribute("Tourist");
		System.out.println("session域对象中还有tourist"+tour);
		Resume resume2 = resumeService.findResumeById(a);// 完整的简历信息
		System.out.println("把id加入的完整简历信息" + resume2);
		tour.setResume(resume2); // 把简历表填入游客表中
		touristService.updateTourist(tour);// 存入数据库中
		Tourist tourist = touristService.findTouristById(tour.getTid());
		System.out.println("查找出来的游客信息是否完整" + tourist);
		session.setAttribute("Tourist", tourist);
		System.out.println("查找出来的游客信息是否完整，放入域对象中" + tourist);
		// System.out.println(a);
		// System.out.println(resume2);
		
		return "tourists/welcome";
	}

	/**
	 * 查看/修改简历
	 */
	@RequestMapping("/updateResume") // tourist/resume updateResume
	public String updateResume(HttpServletRequest req, HttpSession session) {
		System.out.println("查看修改简历");
		Tourist tour = (Tourist) session.getAttribute("Tourist");
		System.out.println("修改简历的游客表中是否有有简历id" + tour);
		int rId = tour.getResume().getRid();
		if(rId!=0) {
			System.out.println("游客表中的简历rid1"+rId);
		Resume resume = resumeService.findResumeById(rId);
		req.setAttribute("resume", resume);
		System.out.println("通过简历id 查出简历表信息，放入域对象中"+resume);
		return "resume/updateResume";
		} else {
			System.out.println("游客表中的简历rid2"+rId);
			req.setAttribute("flage","true" );
		  return "tourists/welcome";
		}
	}
	/**
	 * 修改简历后保存到数据库中
	 */
	@RequestMapping("/update2Resume") // resume/update2Resume updateResume
	public String updateResume2(Resume resume, HttpSession session) {
	
		System.out.println("来到修改后存简历的信息");
		System.out.println("修改后的简历"+resume);
		Date date = new Date();
		resume.setCreatetime(date);
		// 获取简历中的职位信息，查到完整部门信息和职位的完整信息
		int did = resume.getDept().getdId();
		Dept dept = deptService.findDeptById(did);
		int pid = resume.getPosi().getpId();
		Position posi = positionService.findPositionById(pid);
		resume.setDept(dept);
		resume.setPosi(posi);
		System.err.println("添加完部门信息后的简历信息"+resume);
		int res = resumeService.updateResume(resume);
		System.out.println("修改后返回值"+res);
		return "tourists/welcome";
	}
   
	//展示简历 查看后把状态修改下
	@RequestMapping("showResume")
	public String showDate(int id,HttpServletRequest req,int srid) {
		System.out.println("展示简历,简历的id"+id+"投递简历的id:"+srid);
		Resume resume = resumeService.findResumeById(id);
		System.out.println("通过rid找到的简历"+resume );
		SetResume setResume = setResumeService.findSetResumeAllById(srid);
		setResume.setState(1);//把是否查看改为查看
		setResumeService.update(setResume);
		System.out.println("此时简历被查看了，state应该等于1"+setResume);
		req.setAttribute("resume", resume);
		req.setAttribute("setResume", setResume);
		return "setResume/resumeShow";
	}
	//resume/employment 录用 //resume/employment
	@RequestMapping("employment")
	public String employments(HttpServletRequest req,int srid,int id) {
		System.err.println("进入录用过程" +"是否被录用"+id);
		SetResume setResume = setResumeService.findSetResumeAllById(srid);
		setResume.setEmployment(id);;//把是否录用改为录用
		int ser = setResumeService.update(setResume);
		System.out.println("此时简历被查看了，employment应该等于1"+setResume+"修改返回值"+ser);
		
		return "manager/menu";
		
	}
}








