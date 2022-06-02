package com.firstprogram.corejava;

public class StringHandling {

	public static void main(String[] args) {
		String s=new String("Shivam");//Immutable
		s.concat("Karle");
		System.out.println(s);
		
		StringBuffer s1=new StringBuffer("Shivam");//Mutable
		s1.append("Karle");
		System.out.println(s1);
	}

}
