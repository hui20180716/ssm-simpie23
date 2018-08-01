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
			System.out.println("上班打卡");
		    Employees ey =(Employees) session.getAttribute("employee3");
				//解决重复打卡、把考勤表中日期最大的表读出来，比对日期，日期相同则打过卡了，不同则没有打过卡
				
			//考勤表每天创建一份，
				/*
				 如何判断是同一天  比对日期 上班卡只能打一次 下班卡也只能打一次 
				 */
				Attendance attn = new Attendance();//每天创建一张表
				attn.setEmpl(ey);
				Date da= new Date();//上班时间
				attn.setCheckIn(da);
				double days = getworkShift();
				double lateTime=0; 
				
				if(days>0) {
					double d=(days %1);
			        System.out.println(d);
			        if(d>0.5) {      	
			        	lateTime=(int)days+1;
			        }else if(0<d&&d<=0.5){ 
			        	lateTime=(int)days+0.5;
			        }else if(d==0){
			        	lateTime=(int)days;
			        }
			        attn.setLateTime(lateTime);//迟到的时间
			        return("你迟到了"+lateTime+"小时");    
				}
				else {
					return("你没有迟到了，美好的一天，不是吗"); 
				}
				
				
		}
		//打卡详情
		public double getworkShift(){
			double days =0.00;
			Date da= new Date();
			String DateStr1 = " 9:00:00";
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String das = dateFormat.format(da);
//			da = dateFormat.parse(das);//把当前时间转化为约束形式
			DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd ");
			 String dateString = dateFormat2.format(da);//模板
			 DateStr1= dateString +	DateStr1;
			Date date;
			try {
				date = dateFormat.parse(DateStr1);
				 long diff =  da.getTime()-date.getTime() ;
				 System.out.println("两个时间差"+diff);
				 days = diff / ( 60 * 60 *1000.0 );
			        System.out.println(days);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//早上9点标准
			return days;
		}
}
