package com.abhishekvtcodes.classes;

public class BankExample {
	
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount("123456789", 500.0, 2.5);
		CheckingAccount checking = new CheckingAccount("987654321", 1000.0, 200.0);

		// Using methods from BankAccount
		savings.deposit(300.0);
		checking.withdraw(1100.0); // Uses overdraft functionality

		// Using specific method in SavingsAccount
		savings.applyInterest();

		System.out.println("Savings Account Balance: " + savings.getBalance());
		System.out.println("Checking Account Balance: " + checking.getBalance());
	}
}
