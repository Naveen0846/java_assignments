package com.abhishekvtcodes.classes;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance); // Calling superclass constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw method to include overdraft functionality
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit >= amount)) {
            super.withdraw(amount);
        }
    }
}

