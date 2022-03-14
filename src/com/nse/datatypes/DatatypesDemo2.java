package com.nse.datatypes;

public class DatatypesDemo2 {

	public static void main(String[] args) {
		
		//10,20,30,40
		int [] numbers= new int [5]; // 32 bits * 5 memory
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		System.out.println(numbers[0]);
		
		String[] colours = new String[3];
		colours[0] = "red";
		colours[1] = "yellow";
		//colours[2] = "green";
		
		System.out.println("Default Value of String: " +colours[2]);
		
		char[] characters = new char[3]; //16bit *3 memory will be allocated
		characters[0] = 'a';
		characters[1] = 'v';
		
		//task 1
		//check default value for char
		System.out.println("Default Value of Char: " + characters[2]);
		
		System.out.println();
		
		//task2
		int base=25;
		int height=1;
		//calculate - area of triangle
		
		double areaOfTriangle =(double) (base * height) / 2;
		System.out.println("Area of Triangle: " + areaOfTriangle);

	}

}
