package com.employee;

public class ContractEmployees extends Employee {
	
	private double hourlyRate;
	private int hoursWorked;

	public ContractEmployees(String name, int id, double hourlyRate, int hoursWorked) {
		super(name, id, 0);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateMonthlyPay() {
		return hourlyRate * hoursWorked;
	}
}
