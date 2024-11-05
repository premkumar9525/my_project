package com.example.demo;

public class RandomNumberExample2  
{  
public static void main( String args[] )   
{  
int min = 1;  
int max = 2000;  
int b = (int)(Math.random()*(max-min+1)+min);  
System.out.println(b);  
}  
}  
