package com.nse.assignments;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Using For Loop: \n");
		System.out.print("Even Numbers:- ");
		for(int i=0; i<=30; i++) {
			if(i%2 == 0)
				System.out.print(i + " ");
		}
		
		System.out.print("\nOdd Numbers:- ");
		for(int i=0; i<=30; i++) {
			if(i%2 != 0)	
				System.out.print(i + " ");
		}
		
		System.out.println("\n\nUsing While Loop: \n");
		int i=0;
		System.out.print("Even Numbers:- ");
		while(i<=30) {
			if(i%2 == 0)
				System.out.print(i + " ");
			i++;
		}
		
		System.out.print("\nOdd Numbers:- ");
		int j =0;
		while(j<=30) {
			if(j%2 != 0)
				System.out.print(j + " ");
			j++;
		}
	}
}
