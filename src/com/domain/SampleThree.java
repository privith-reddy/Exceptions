package com.domain;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleThree 
{
	public static void main(String[] args) 
	{
		//C:\\Users\\HOME\\Desktop\\JavaFileWritting.txt
		A a = new A();
		try 
		{
			a.readMe("D:\\Palle Technology\\JavaFileWritting.txt");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File doesn't exist");
			e.printStackTrace();
		}
	}

}

class A 
{
	public void readMe(String filepath) throws FileNotFoundException 
	{
		FileReader fr = new FileReader(filepath);
		
	}
	
}
