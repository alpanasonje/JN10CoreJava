package com.tns.daysix;

public class Client extends Person{
	private int clienId;
	private String project;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String name, String city, int clienId, String project) {
		super(name, city);
		this.clienId = clienId;
		this.project = project;
	}
	public int getClienId() {
		return clienId;
	}
	public void setClienId(int clienId) {
		this.clienId = clienId;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "clienId=" + clienId + ", project=" + project + ", " + super.toString() ;
	}
	
	
	
	
}
