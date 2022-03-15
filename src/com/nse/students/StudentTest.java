package com.nse.students;

public class StudentTest {

	public static void main(String[] args) {

		Student stu1 = new Student();
		stu1.studentId = 1001;
		stu1.studentName = "Jack";
		stu1.studentMailid = "jack@gmail.com";
		stu1.studentPercentage = 45.2;
		stu1.schoolName = "Global school";
		
		Student stu2 = new Student();
		stu2.studentId = 1002;
		stu2.studentName = "peter";
		stu2.studentMailid = "peter@gmail.com";
		stu2.studentPercentage = 85.2;
		stu2.schoolName = "Global school";
		
		Student stu3 = new Student();
		stu3.studentId = 1003;
		stu3.studentName = "mark";
		stu3.studentMailid = "mark@gmail.com";
		stu3.studentPercentage = 56.2;
		stu3.schoolName = "Global school";
		
		Student.printStudentDetails(stu2);
		
	}

}
