package com.domain;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyBlockOne 
{
	
	public static void main(String[] args)
	{
		FileWriter fw = null;
		try 
		{
			fw = new FileWriter("D:\\Palle Technology\\JavaFileWritting.txt");
		} 
		
		// When the file is not present in the location
		catch (FileNotFoundException ex) //Child 
		{
			ex.printStackTrace();		
		}
		
		// When you are not able to writing in the file 
		catch (IOException e) //Parent
		{
			e.printStackTrace();
		}
		
		finally 
		{
			try 
			{
				fw.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
