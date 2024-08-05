package com.tns.daysix;

public class Employee extends Person {
	private int empId;
	private float salary;
	private String dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, float salary, String dept, String name, String city) {
		super(name,city);
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return super.toString()+", empId=" + empId + ", salary=" + salary + ", dept=" + dept ;
	}
	
	
	
}
