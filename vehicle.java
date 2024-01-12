package com.webapp.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class vehicle {
	    private int vehicleid;
	    private String name;
	    private String feedback;
	    @ManyToOne
	    @JoinColumn(name = "userid")
	    private user user;
		public user getUser() {
			return user;
		}
		public void setUser(user user) {
			this.user = user;
		}
		@Override
		public String toString() {
			return "vehicle [vehicleid=" + vehicleid + ", name=" + name + ", feedback=" + feedback + ", user=" + user
					+ "]";
		}
		public int getVehicleid() {
			return vehicleid;
		}
		public void setVehicleid(int vehicleid) {
			this.vehicleid = vehicleid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getFeedback() {
			return feedback;
		}
		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

}
