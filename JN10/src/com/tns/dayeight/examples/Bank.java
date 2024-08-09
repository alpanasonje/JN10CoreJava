package com.tns.dayeight.examples;

public interface Bank {
	void deposit(int amount);
	void withdraw(int amount);
	int MINIMUM_BALANCE=1000;
	int DEPOSIT_LIMIT=25000;
}
