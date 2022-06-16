package com.firstprogram.corejava;

public class MethodOverloading {

	public static void main(String[] args) {
		Test t=new Test();
		t.m();		// Exact method will be called
		t.m(56);	// Integer will be called
		t.m('a');
		

	}

}
class Test 
{
	public void m()
	{
	System.out.println("No arguments");
	}
	public void m(int i)
	{
		System.out.println("Integer arguments");
	}
	public void m(double d)
	{
		System.out.println("Double arguments");
	}
}

