package com.iotek.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.ResumeDao;
import com.iotek.ssm.dao.TouristDao;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.service.ResumeService;


@Service
public class ResumeServiceImpl implements ResumeService {

	@Autowired
	private ResumeDao resumeDao;
	
	@Override
	public int addResume(Resume resum) {
		int num = 0;
		num = resumeDao.insertResumeByid(resum);
		if(num>0) {
			num = resumeDao.selectMaxId();
		}
		return num;
	}

	@Override
	public int updateResume(Resume resum) {
		
		return resumeDao.updateResumeByid(resum);
	}

	@Override
	public Resume findResumeById(int id) {
	
		return resumeDao.findResumeById(id);
	}

}
