package com.firstprogram.corejava;

public  class Outer {
	int x=10;

	class Inner
	{
		public void demo() {
			System.out.println("I'm Inner class");
			x=100;
	
	}
	
	}

	public void main(String[] args) {
		Outer.Inner obj=new Outer.Inner();
		obj.demo();
	}
	}


