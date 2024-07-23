package com.domain;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleTwo 
{

	public static void main(String[] args) 
	{
		//C:\\Users\\HOME\\Desktop\\JavaFileWritting.txt
		try 
		{
			FileReader fr = new FileReader("D:\\Palle Technology\\JavaFileWritting.txt");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File doesn't exist");
			e.printStackTrace();
		}
	

	}

}
