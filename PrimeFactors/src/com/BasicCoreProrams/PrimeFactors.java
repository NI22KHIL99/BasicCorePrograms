package com.BasicCoreProrams;

import java.io.*;
import java.lang.Math;

public class PrimeFactors {
	
	public static void primeFactors(int n)
    {

		while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }
 
        for (int i = 6; i*i <= Math.sqrt(n); i++)
        {
  
        	while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
 
 
        if (n > 2)
            System.out.print(n);
    }
 
    public static void main (String[] args)
    {
        int n = 7587;
        primeFactors(n);
    }

}
