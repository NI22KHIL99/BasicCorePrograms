package com.BasicCorePrograms;

import java.util.Scanner;

public class Powerof2 {

	 private static final Powerof2 Power = null;

	public static void main(String[] args) {
		 
		 long n,p,r=1;
		 
	     Scanner sc=new Scanner(System.in);
	 
	     System.out.println("enter number: ");
	 
	     n=sc.nextLong();
	  
	     System.out.println("enter power: ");
	 
	     p=sc.nextLong();
	 
	     r=Power.calpower(n,p);
	 
	     System.out.println(n+"^"+p+"="+r);
	 
	  }
	 
	  static long calpower(long n1,long p1)
	  {
	 
	     long r1=1;
	 
	     if(n1>=0&&p1==0)
	     
	        r1 =1;
	 
	     else if(n1==0&&p1>=1)
	 
	        r1=0;
	     else
	 
	       for(int i=1;i<=p1;i++)
	       
	         r1=r1 *n1;
	 
	     return r1;
	 
	    }
}
