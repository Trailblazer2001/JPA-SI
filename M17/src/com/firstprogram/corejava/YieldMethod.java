package com.firstprogram.corejava;

public class YieldMethod {

	public static void main(String[] args) {
		MyThreadz t=new MyThreadz();
		Thread obj=new Thread(t);
		obj.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread...");
		}
	}

}
class MyThreadz implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread...");
			Thread.yield(); //Static
		}
	}


	}

