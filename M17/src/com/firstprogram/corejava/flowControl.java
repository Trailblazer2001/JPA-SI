package com.firstprogram.corejava;

public class flowControl {

	public static void main(String[] args) 
	{int x=0;
	do
	{
		x++;
		System.out.println(x);
		
		if(++x<5)
			continue;
		x++;
		
		System.out.println(x);
		
	}while(++x<10);
}
}
		
