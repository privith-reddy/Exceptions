package com.domain;

public class FinallyBlockTwo 
{
	public static void main(String[] args) 
	{
		B b = new B();
		int res = b.getDiv(10, 2);
		System.out.println("Result is : " + res);
		System.out.println("Bye");

	}

}

class B 
{
	public int getDiv(int x, int y) 
	{
		System.out.println("Hello");
		try 
		{
			return x/y;
		}
		
		catch(ArithmeticException ex) 
		{
			return 0;
		}
		// In finally block we can't write any return statement.
		finally 
		{
			System.out.println("Welcome");
			
		}
	}
	
}