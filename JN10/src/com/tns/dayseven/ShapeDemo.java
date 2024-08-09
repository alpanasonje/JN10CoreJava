package com.tns.dayseven;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s;
		
		//s=new Shape(); abstract class cannot be instantiated
		s=new Circle(4.5f);
		s.calArea(); //circle class calArea()
		s.show();

		s=new Rectangle(10, 40);
		s.calArea(); //rectangle class calArea()
		s.show();
		
		s=new Rectangle();
		s.calArea();//rectangle class calArea()
		s.show();
	}

}
