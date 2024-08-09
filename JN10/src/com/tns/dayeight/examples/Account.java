package com.tns.dayeight.examples;

public class Account implements Bank {
	String type;
	int accountNumber;
	String name;
	int balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String type, int accountNumber, String name, int balance) {
		super();
		this.type = type;
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) {
		if (amount > DEPOSIT_LIMIT)
			System.out.println("Deposit limit exceeded...");
		else
			balance += amount;
	}

	@Override
	public void withdraw(int amount) {
		if (balance - amount < MINIMUM_BALANCE)
			System.out.println("cannot withdraw");
		else
			balance -= amount;

	}

	@Override
	public String toString() {
		return "Account [type=" + type + ", accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ "]";
	}

}
