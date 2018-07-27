package com.iotek.ssm.test;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletRegistration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.SetResumeDao;
import com.iotek.ssm.entity.SetResume;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.SetResumeService;

import sun.print.resources.serviceui;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SerResumeDaoTest {

	@Autowired
	private SetResumeDao setResumeDao;
	
	@Autowired
	private SetResumeService setResumeService;
	
	@Test
	public void insertSerResume() {
		SetResume setResum = new SetResume();
		Date da = new Date();
		setResum.setSrTime(da);
		Tourist tour = new Tourist();
		tour.setTid(55);
		setResum.setTourist(tour);
    int ser = setResumeDao.insertSerResume(setResum);
    System.out.println(ser);
		
	}
	
	@Test
	public void findAllSerResume() {
		ArrayList<SetResume> setResumes = setResumeDao.findSetResumeAll();
		for (SetResume setResume : setResumes) {
			System.out.println(setResume);
		}
	}
	@Test
	public void findAllSerResumeById() {
		SetResume serr = setResumeDao.findSetResumeAllById(2);
		System.out.println(serr);
	}
	@Test
	public void findSerResumeBytId() {
		ArrayList<SetResume> serr = setResumeDao.findSetResumeByTId(55);
		for (SetResume sr : serr) {
			System.out.println(sr);
		}
	}
	@Test
	public void updateSerResume() {
		SetResume setResum = new SetResume();
		Date da = new Date();
		setResum.setSrTime(da);
		setResum.setVmtime(da);
		setResum.setSrId(2);
		Tourist tour = new Tourist();
		tour.setTid(49);
		setResum.setTourist(tour);
		setResum.setState(0);
    int ser = setResumeDao.updateSetResum(setResum);
    System.out.println(ser);
	}
	//setResumeService;
	@Test
	public void findSerResumeBytId2() {
		SetResume s = setResumeService.findSetResumeByTId(55);
		System.out.println(s);
	}
	@Test
	public void findSerResumeBytId23() {
		 ArrayList<SetResume> ss = setResumeService.findNewSetResume();
		 for (SetResume s : ss) {
			
			 System.out.println(s);
		}
	}
}
