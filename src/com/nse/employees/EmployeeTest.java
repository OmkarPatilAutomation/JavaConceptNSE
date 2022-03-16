package com.nse.employees;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName = "NSE";
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.employeeNo = 1001;
		emp1.employeeName = "Jack";
		emp1.employeeSalary = 4500;
		//emp1.companyName = "NSE";
		
		emp2.employeeNo = 1002;
		emp2.employeeName = "Peter";
		emp2.employeeSalary = 5000;
		//emp2.companyName = "NSE";
		
		emp3.employeeNo = 1003;
		emp3.employeeName = "Mark";
		emp3.employeeSalary = 9000;
		//emp3.companyName = "NSE";

		Employee.printEmployeeDetails(emp2);
	}

}
