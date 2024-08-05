package com.tns.daysix;

import java.util.Arrays;

public class Manager extends Employee {
	private String[] projects;
	private int teamSize;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int empId, float salary, String dept, String name, String city,String[] projects, int teamSize) {
		super(empId, salary, dept, name, city);
		this.projects = projects;
		this.teamSize = teamSize;
	}
	public String[] getProjects() {
		return projects;
	}
	public void setProjects(String[] projects) {
		this.projects = projects;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	@Override
	public String toString() {
		return "projects=" + Arrays.toString(projects) + ", teamSize=" + teamSize +", "+ super.toString() ;
	}
	
	
	
	
}
