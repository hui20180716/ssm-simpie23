package com.iotek.ssm.test;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.ResumeDao;
import com.iotek.ssm.entity.Dept;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Resume;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ResumeDaoTest {

	@Autowired
	private ResumeDao resumeDao;
	
	@Test
	public void findResumeByid() {
		Resume resume = resumeDao.findResumeById(1);
		System.out.println(resume);
}
	@Test
	public void findAllResume() {
		ArrayList<Resume> resume = resumeDao.findAllResume();
		for (Resume resume2 : resume) {
			
			System.out.println(resume2);
		}
}
	@Test
	public void updateResumeByid() {
		Resume resum = new Resume();
		resum.setRid(6);
		resum.setName("cc");
		Date de = new Date();
		resum.setCreatetime(de);
		resum.setAge(12);
			Dept dept = new Dept();
			dept.setdId(1);
			dept.setdName("aa");
		resum.setDept(dept);
			Position posi = new Position();
			posi.setpId(1);
			posi.setpName("aa");
		resum.setPosi(posi);
		resum.setLastjob("捡垃圾");
		resum.setSalary(100000);
		resum.setSex("男");
		resum.setEmail("1145020704@qq.com");
		resum.setPoitics("党员");
		resum.setExpe("五年java开发");
		resum.setHobby("吃饭");
		int resume = resumeDao.updateResumeByid(resum);
		System.out.println(resume);
}
	@Test
	public void deleteResumeById() {
		int resume = resumeDao.deleteResumeById(1);
		System.out.println(resume);
}
	@Test
	public void insertResumeByid() {
		Resume resum = new Resume();
		Date de = new Date();
		resum.setCreatetime(de);
		resum.setAge(12);
			Dept dept = new Dept();
			dept.setdId(1);
			dept.setdName("aa");
		resum.setDept(dept);
			Position posi = new Position();
			posi.setpId(1);
			posi.setpName("aa");
		resum.setPosi(posi);
		resum.setLastjob("捡垃圾");
		resum.setSalary(100000);
		resum.setSex("男");
		resum.setEmail("1145020703@qq.com");
		resum.setPoitics("党员");
		resum.setExpe("五年java开发");
		resum.setHobby("吃饭");
		int resume = resumeDao.insertResumeByid(resum);
		System.out.println(resume);
}
	
	@Test
	public void findMaxId() {
		int MaxId = resumeDao.selectMaxId();
		System.out.println(MaxId);
	}
}
