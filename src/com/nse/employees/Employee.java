package com.nse.employees;

public class Employee {

	public int employeeNo;
	public String employeeName;
	public int employeeSalary;
	public String companyName;

	public static void employeeDetails(Employee emp) {
		System.out.println(emp.employeeNo);
		System.out.println(emp.employeeName);
		System.out.println(emp.employeeSalary);
		System.out.println(emp.companyName);
	}
}
