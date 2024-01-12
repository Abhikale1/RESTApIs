package com.webapp.service;

import com.webapp.model.user;

public interface userService {
	
	user findByUserid(int userid);
	
	int deleteByid(int userid);
	
	user save(user U);

}
