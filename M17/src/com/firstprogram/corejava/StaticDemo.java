package com.firstprogram.corejava;

public class StaticDemo {
	public StaticDemo(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	String name;
	int roll;
	static String college="St. John Palghar"; //Static Variable //class bound

	static void change()
	{
		college="Mumbai University";
	}
	

	
	void display()
	{
		System.out.println(roll+"	"+name+"	"+college);
	}
	public static void main(String[] args) {
		StaticDemo s1=new StaticDemo ("Shivam",1);
		StaticDemo s2=new StaticDemo ("Himanshu",2);
		StaticDemo s3=new StaticDemo ("Sahil",3);
		s1.display();
		s2.display();
		s3.display();
		change();
		s1.display();
		s2.display();
		s3.display();
	}

}
