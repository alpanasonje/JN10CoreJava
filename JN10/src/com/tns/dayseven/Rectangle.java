package com.tns.dayseven;

public class Rectangle extends Shape {
	float length;
	float width;

	public Rectangle() {
		length=5;
		width=5;
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	@Override
	void calArea() {
		area = length * width;

	}

}
