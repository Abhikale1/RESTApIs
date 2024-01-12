package com.webapp.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
public class user{
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY )
       private int userid;
       private String username;
       private String password;
       private String role;
	@Override
	public String toString() {
		return "user [userid=" + userid + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
