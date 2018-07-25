package com.iotek.ssm.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.PositionDao;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.service.PositionService;
@Service
public class PositionServiceImpl implements PositionService{
	
	@Autowired
	private PositionDao positionDao;

	@Override
	public ArrayList<Position> findAllPosition() {
		return positionDao.findPositionAll();
	}

	@Override
	public Position findPositionById(int id) {
		// TODO Auto-generated method stub
		return positionDao.findPositionById(id);
	}

	
}
