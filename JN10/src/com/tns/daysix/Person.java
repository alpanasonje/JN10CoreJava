package com.tns.daysix;

public class Person {
	private String name;
	private String city;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "name=" + name + ", city=" + city ;
	}
	
	
}
