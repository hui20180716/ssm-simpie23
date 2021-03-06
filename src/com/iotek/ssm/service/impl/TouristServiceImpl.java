package com.iotek.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.TouristDao;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.TouristService;
@Service
public class TouristServiceImpl implements TouristService {


	@Autowired
	private TouristDao touristDao;
	


	@Override
	public int registerTourist(Tourist tourist) {
		int num = -1;
		Tourist touris = findTouristByname(tourist.getTname());
		if(touris==null) {
			num = touristDao.registerTourist(tourist);
		}	
		return num;
	}

	@Override
	public Tourist findTouristByname(String name) {
		return touristDao.findTouristByname(name);
	}
	@Override
	public boolean loginTourist(Tourist tourist) {
		boolean flag = false;
		Tourist touris = findTouristByname(tourist.getTname());
		
		if(touris!=null&& tourist.getTpassword().equals(touris.getTpassword())) {
			flag = true ;
		}
		return flag;
	}

	@Override
	public Tourist findTouristById(int id) {
		
		return touristDao.findTouristById(id);
	}

	@Override
	public int updateTourist(Tourist tour) {
		
		return touristDao.updateTourist(tour);
	}
	
}
