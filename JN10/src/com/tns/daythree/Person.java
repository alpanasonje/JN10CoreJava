package com.tns.daythree;

public class Person {
	String name;
	int age;
	long contactNo;
	private String city;
	
	//default constructor
	Person()
	{
		this.name="I am a Person";
		System.out.println("in constructor");
		city="Nashik";
	}
	//parameterized constructor
	Person(String name, String city, int age, long contactNo) 
	{
		this.name=name;
		this.city=city;
		this.age=age;
		this.contactNo=contactNo;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public long getContactNo()
	{
		return contactNo;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setContactNo(long contactNo)
	{
		this.contactNo=contactNo;
	}
	void show()
	{
		System.out.println("in show method");
		System.out.println("name is "+name);
		System.out.println("Age is "+age);
		System.out.println("City is "+city);
		System.out.println("Contact Number is "+contactNo);
	}
	
}
