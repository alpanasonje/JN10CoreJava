package com.tns.dayeleven;

public class InvalidQuantityException extends Throwable{

	public InvalidQuantityException() {
		super("Invalid Quantity");
		
	}

	public InvalidQuantityException(String message) {
		super(message);
		
	}
	
}
