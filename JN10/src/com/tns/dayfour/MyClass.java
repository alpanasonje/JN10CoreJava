//Program to define MyClass
package com.tns.dayfour;

public class MyClass {
	private int privateNo;
	protected int protectedNo;
	int defaultNo;
	public int publicNo;
	
	public MyClass()
	{
		privateNo=1;
		protectedNo=11;
		defaultNo=101;
		publicNo=1001;		
	}

	@Override
	public String toString() {
		return "MyClass [privateNo=" + privateNo + ", protectedNo=" + protectedNo + ", defaultNo=" + defaultNo
				+ ", publicNo=" + publicNo + "]";
	}

	
}
