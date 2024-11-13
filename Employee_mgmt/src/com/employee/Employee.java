package com.employee;

public abstract class Employee {

	protected String name;
	protected int id;
	protected double baseSalary;

	//constructor
	public Employee(String name, int id, double baseSalary) {
		this.name = name;
		this.id = id;
		this.baseSalary = baseSalary;
	}

	public abstract double calculateMonthlyPay();

	public void displayEmployeeDetails() {
		System.out.println("Employee ID: " + id + ", Name: " + name + ", Monthly Pay: Rs." + calculateMonthlyPay());
	}
}
