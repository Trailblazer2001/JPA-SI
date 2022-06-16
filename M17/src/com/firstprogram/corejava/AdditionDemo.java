package com.firstprogram.corejava;

import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
	System.out.println("Enter the first number:");
		int a= sc.nextInt();
	System.out.println("Enter the second number:");
		int b= sc.nextInt();
	int Sum = a+b;
	System.out.println("Answer is: "+Sum);
	sc.close();
	
	
	}

}
