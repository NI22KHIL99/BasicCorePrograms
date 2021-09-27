package com.BasicCorePrograms;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");  
        num = sc.nextInt();  
  
        if (num % 2 == 0) {
  
            System.out.println("Entered Number is Even");
        }
        else {
  
        	System.out.println("Entered Number is Odd");
        }
    }

}
