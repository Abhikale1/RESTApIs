package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.model.user;
import com.webapp.service.userService;


@RestController
@RequestMapping(value = "/uservehicle")
public class userVehicleController {

	@Autowired
	private userService us;
	@GetMapping(value = "/getbyuserid/{userid}")
	public user m1(@PathVariable int userid)
	{
		return us.findByUserid(userid);
		
	}
	
	@DeleteMapping(value = "/deletedbyid/{sid}")
	public int m5(@PathVariable int userid) {
		
		return us.deleteByid(userid);
	}
	
	@PostMapping(value="/insert")
	public user m6(@RequestBody user U) {
		
		return us.save(U);
	}
}
