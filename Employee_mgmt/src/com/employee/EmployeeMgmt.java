package com.employee;

import java.util.Scanner;

public class EmployeeMgmt {
	public static void main(String[] args) {

		// full-time employee ,base salary fixed with variable performance bonus
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the performance bonus =");
		double bonus = sc.nextDouble();
		FullTimeEmployees fullTimeEmp = new FullTimeEmployees("Manoj", 101, 4000, bonus);
		fullTimeEmp.displayEmployeeDetails();

		// contract Employees with hourly pay
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter no of working hours =");
		int hours = sc.nextInt();
		ContractEmployees contractor = new ContractEmployees("chintu", 102, 150, hours); // 150rs/hour for 160 hours
		contractor.displayEmployeeDetails();
		sc.close();
		sc2.close();
	}
}
