package com.tns.dayeleven;

import java.util.Scanner;

public class PlaceOrder {
	public static void validateQuantity(int qty) throws InvalidQuantityException
	{
		if (qty<1)
			throw new InvalidQuantityException();
			//throw new InvalidQuantityException("Quantity must be greater than 0");
		else
			System.out.println("order is placed..");
	}
	public static void main(String[] args) {
		String productName;
		int qty;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Name : ");
		productName=sc.nextLine();
		System.out.println("Enter Quantity to order : ");
		qty=sc.nextInt();
		try {
			validateQuantity(qty);
		} catch (InvalidQuantityException e) {
			System.out.println(e.getMessage());
		}
	}
}
