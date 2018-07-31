package com.iotek.ssm.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.ssm.entity.Attendance;
import com.iotek.ssm.entity.Employees;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.Salary;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.EmployeeService;
import com.iotek.ssm.service.ResumeService;
import com.iotek.ssm.service.SalaryService;
import com.iotek.ssm.service.SetResumeService;

@RequestMapping("/employee2") /// employee2/insert
@Controller
public class Employee2Controller {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private SetResumeService setResumeService;
	@Autowired
	private ResumeService resumeService;
	@Autowired
	private SalaryService SalaryService;
	/**
	 * 员工注册
	 * @throws ParseException 
	 */
	@RequestMapping("insert")//insert
   public String insertEmployee(Employees em,String cTime, HttpSession session) throws ParseException {
	   System.out.println("员工注册"+cTime);
	   System.out.println("注册的员工信息"+em);
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//yyyy-mm-dd, 会出现时间不对, 因为小写的mm是代表: 秒
	   Date Date = sdf.parse(cTime);
	   em.setCreateTime(Date);
	  
	   /*ey.setCreateTime(em.getCre);
	   ey.setName(em.getName());
	   ey.setCardId(em.getCardId());
	   ey.setTel(em.getTel());
	   ey.setSex(em.getSex());
	   ey.setEmail(em.getEmail());
	   ey.setEducal(em.getEducal());
       ey.setAge(em.getAge());*/
       //需要简历 
       int rid = em.getResume().getRid();
       Resume re = resumeService.findResumeById(rid);
       em.setResume(re);
       em.setDept(re.getDept());
		Tourist tour = (Tourist) session.getAttribute("Tourist");
       em.setPassword(tour.getTpassword());
       //部门信息
       em.setDept(re.getDept());
       em.setPosi(re.getPosi());
       //建立考勤表
      
      //状态为在职
       em.setStatus(1);
       //建一张薪资表  考勤表 培训表 
       System.out.println("员工表"+em);
        int ser = employeeService.insertenployee(em);
        System.out.println("添加员工的返回值"+ser);
	   return "employee/employeeMenu";
	}
	/**
	 * 员工培训
	 */
		@RequestMapping("insert")//insert
	   public String trainget(HttpSession session) {
			Employees ey =(Employees) session.getAttribute("employee3");
			
			return null;
		}
		/**
		 * 上班打卡
		 * @throws ParseException 
		 */
		@ResponseBody
		@RequestMapping("workShift")//insert
		public String workShift(HttpSession session) throws ParseException {
				Employees ey =(Employees) session.getAttribute("employee3");
				if(ey.getAtten().getAid()==0) {
					Attendance a=new Attendance();
					a.setEmpl(ey);
					ey.setAtten(a);
					Date da= new Date();
					a.setData(da);
				}
				Date da= new Date();
				ey.getAtten().setData(da);
				String DateStr1 = " 9:00:00";
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String das = dateFormat.format(da);
				da = dateFormat.parse(das);//把当前时间转化为约束形式
				DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
				 String dateString = dateFormat2.format(da);
				 DateStr1= dateString +	DateStr1;
				Date date= dateFormat.parse(DateStr1);//早上9点标准
				int i = date.compareTo(da); 
				
				if(i<0) {
					System.out.println("你迟到了");
				}else {
					System.out.println("你没有迟到");
				}
				System.out.println(i < 0); 

				/*dateTime1.compareTo(dateTime2)*/
				return null;
		}
}
