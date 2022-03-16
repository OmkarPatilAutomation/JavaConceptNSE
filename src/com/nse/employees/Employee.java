package com.nse.employees;

public class Employee {

	public int employeeNo;
	public String employeeName;
	public int employeeSalary;
	public static String companyName;

	public static void printEmployeeDetails(Employee emp) {
		System.out.println(emp.employeeNo);
		System.out.println(emp.employeeName);
		System.out.println(emp.employeeSalary);
		System.out.println(Employee.companyName);
	}
}
