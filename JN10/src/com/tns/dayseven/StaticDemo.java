package com.tns.dayseven;

public class StaticDemo {

	public static void main(String[] args) {

		UsingStatic.show();
		UsingStatic obj=new UsingStatic();
		obj.display();	
		
		System.out.println(MyClass.STATIC_CONSTANT);
		System.out.println(MyClass.staticNo);
		MyClass obj1=new MyClass();
		MyClass obj2=new MyClass(20,200);
		System.out.println(obj1);
		System.out.println(obj2);
		obj1.change();
		System.out.println("After increment");
		System.out.println(obj1);
		System.out.println(obj2);
		

	}

}
