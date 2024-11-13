package com.employee;

class FullTimeEmployees extends Employee {
	private double performanceBonus;

	public FullTimeEmployees(String name, int id, double baseSalary, double performanceBonus) {
		super(name, id, baseSalary);
		this.performanceBonus = performanceBonus;
	}

	@Override
	public double calculateMonthlyPay() {
		return baseSalary + performanceBonus;
	}
}
