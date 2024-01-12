package com.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.model.user;

@Repository
public interface userDao extends JpaRepository<user, Integer> {
    
	user findByUserid(int userid);
	int deleteByid(int userid);
	user save(user U);
}
