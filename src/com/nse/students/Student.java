package com.nse.students;

public class Student {

	//States/Attributes of Student
	public int studentId;
	public String studentName;
	public String studentMailid;
	public double studentPercentage;
	public String schoolName;

	public static void printStudentDetails(Student stu){
		System.out.println(stu.studentId);
		System.out.println(stu.studentName);
		System.out.println(stu.studentMailid);
	}

}
