package com.example.demo.utils;

public class Constants {
	
	
	public static void createRandomNumber()   
	{  
	int min = 1;  
	int max = 2000;  
	int b = (int)(Math.random()*(max-min+1)+min);  
	System.out.println(b);  
	} 

}
