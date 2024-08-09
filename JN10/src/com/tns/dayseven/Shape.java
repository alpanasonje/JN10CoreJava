package com.tns.dayseven;

public abstract class Shape {
protected float area;
public void show()
{
	System.out.println("Area is "+area);
}

abstract void calArea();
}
