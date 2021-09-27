package com.BasicCorePrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	int a, b;  
	  
	public void swapNum(SwapTwoNumbers stn)  
	{  
		int temp;  
		temp = stn.a;  
		stn.a = stn.b;  
		stn.b = temp;  
	}  
	public static void main(String args[])   
	{  
	  
		SwapTwoNumbers sn = new SwapTwoNumbers();  
		Scanner sc = new Scanner(System.in);               
		System.out.print("Enter the first number: ");  
		sn.a = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		sn.b = sc.nextInt();  
		
		sn.swapNum(sn);  
		  
		System.out.println("After swapping: a= " + sn.a + ", b= " + sn.b);  
	}  

}
