package com.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.webapp.dao.userDao;
import com.webapp.model.user;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class userServiceImpl implements userService {
	
	@Autowired
	private userDao ud;

	@Override
	public user findByUserid(int userid) {
		// TODO Auto-generated method stub
		return ud.findByUserid(userid);
	}

	@Override
	public int deleteByid(int userid) {
		// TODO Auto-generated method stub
		return ud.deleteByid(userid);
	}

	@Override
	public user save(user U) {
		// TODO Auto-generated method stub
		return ud.save(U);
	}
	
	
		
	}
	
	


