package com.nse.assignments;

public class Task4 {

	public static void main(String[] args) {
		
		double [] temp = {5.0, 11.0, 12.5, -2.0, 3.6, -4.3, 9.0};
		
		double max = temp[0];
		for(int i=0; i<temp.length; i++) {
			if(max < temp[i])
				max = temp[i];
		}
		
		double min = temp[0];
		for(int i=0; i<temp.length; i++) {
			if(min > temp[i])
				min = temp[i];
		}
		
		System.out.println("Maximum Temp: " + max);
		System.out.println("Minimum Temp: " + min);
	}
}
