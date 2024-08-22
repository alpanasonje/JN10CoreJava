package com.tns.daynine;

public class Course {
	String name;
	double fees;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String name, double fees) {
		super();
		this.name = name;
		this.fees = fees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", fees=" + fees + "]";
	}

}
