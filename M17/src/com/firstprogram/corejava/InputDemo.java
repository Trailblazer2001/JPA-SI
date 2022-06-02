package com.firstprogram.corejava;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter any number= ");
		Scanner s= new Scanner(System.in);
		number=s.nextInt();
		
	 	if (number%2==0)
	 		System.out.println("Even");
	 	else 
	 		System.out.println("Odd");
s.close();
	}
	
}
