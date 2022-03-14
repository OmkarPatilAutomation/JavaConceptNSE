package com.nse.methodsdemo;

public class Area {

	public static double areaOfSquare(double a) {
		return a*a;
	}
	
	public static double areaOfTrapezium(double h, double a, double b) {
		double area = (1/2)*h*(a+b);
		return area;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Area.areaOfSquare(9));
		

	}

}
