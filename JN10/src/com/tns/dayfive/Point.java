package com.tns.dayfive;

public class Point {
	float x;
	float y;
	
	public Point()
	{
		//x=0.0f;
		//y=0.0F;
		this(0.0f, 0.0f);
	}
	public Point(float value)
	{
		//x=value;
		//y=value;
		this(value, value);
	}
	public Point(float x, float y)
	{
		this.x=x;
		this.y=y;
	}
	
	Point increment()
	{
		x++;
		y++;
		return this;
	}
	@Override
	public String toString() {
		return "Point ("+x+", "+y + ")";
	}
	
	
	
}
