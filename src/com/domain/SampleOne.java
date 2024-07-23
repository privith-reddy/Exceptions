package com.domain;

public class SampleOne 
{
	public static void main(String[] args) 
	{
		//int i = 100;
		//System.out.println(i);
		System.out.println("Hello");
		
		try 
		{
			int div = 50/0;
			System.out.println(div);
		}
		
		catch(ArithmeticException ex) 
		{
			System.out.println("Dividing by zero is not allowed");
		}
		
		System.out.println("Bye");
	}

}
