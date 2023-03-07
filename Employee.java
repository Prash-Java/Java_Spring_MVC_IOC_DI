package com.java.spring.mvc.list;

import java.util.List;

public class Employee {

	private String name;
	private List<String> profiles;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<String> profiles) {
		this.profiles = profiles;
	}

}
