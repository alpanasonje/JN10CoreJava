package com.tns.dayseven;

public class Circle extends Shape {
	float radius;

	public Circle()
	{}
	public Circle(float radius)
	{
		this.radius=radius;
	}
	@Override
	void calArea() {
		area=(float) (Math.PI* radius*radius);
	}

}
