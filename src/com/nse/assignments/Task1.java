package com.nse.assignments;

public class Task1 {

	public static void main(String[] args) {

		int omi = 27;
		int sachin = 27;
		int rohit = 27;
		
		if(omi<sachin && omi<rohit) {
			System.out.println("Omi is Younger.");
		}
		else if(sachin<omi && sachin<rohit) {
			System.out.println("Sachin is Younger.");
		}
		else if(rohit<omi && rohit<sachin) {
			System.out.println("Rohit is Younger.");
		}
		else if(omi==sachin && omi==rohit) {
			System.out.println("Omi, Sachin, & Rohit are of same Age.");
		}
	}

}
