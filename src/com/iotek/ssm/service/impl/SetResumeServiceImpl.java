package com.iotek.ssm.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.SetResumeDao;
import com.iotek.ssm.entity.SetResume;
import com.iotek.ssm.service.SetResumeService;


@Service
public class SetResumeServiceImpl implements SetResumeService {

	@Autowired
	private SetResumeDao setResumeDao;

	@Override
	public int insertSetResume(SetResume serResum) {

		return setResumeDao.insertSerResume(serResum);
	}

	@Override
	public ArrayList<SetResume> findSetResumeAll() {

		return setResumeDao.findSetResumeAll();
	}

	@Override
	public SetResume findSetResumeAllById(int id) {

		return setResumeDao.findSetResumeAllById(id);
	}

	@Override
	public ArrayList<SetResume> findNewSetResume() {
		ArrayList<SetResume> srs= new ArrayList<SetResume>();
	   ArrayList<Integer> tids= new ArrayList<Integer>();
		ArrayList<SetResume> setResumes = findSetResumeAll();
		for (SetResume setResume : setResumes) {
			if(setResume.getState()==0 &&!tids.contains(setResume.getTourist().getTid())) {
             srs.add(setResume);
             tids.add(setResume.getTourist().getTid());
			}
		}
		return srs;
	}

	@Override
	public int update(SetResume serResum) {
		
		return setResumeDao.updateSetResum(serResum);
	}

	@Override
	public SetResume findSetResumeByTId(int tid) {
		SetResume sr= new SetResume();
		ArrayList<SetResume> srs= setResumeDao.findSetResumeByTId(tid);
		for (SetResume s : srs) {
		if(s.getSrId()>sr.getSrId()) {
			sr=s;
		}
		}
		return sr;
	}

	@Override
	public ArrayList<SetResume> findNewInterView() {
		
		ArrayList<SetResume> srs= new ArrayList<SetResume>();
		 ArrayList<Integer> tids= new ArrayList<Integer>();
		ArrayList<SetResume> findNewSetResume = findSetResumeAll();
		for (SetResume setResume : findNewSetResume) {
			if(setResume.getInterView()==2&&setResume.getEmployment()==0&&!tids.contains(setResume.getTourist().getTid())) {
				srs.add(setResume);
				 tids.add(setResume.getTourist().getTid());
			}
		}
		return srs;
	}

}
