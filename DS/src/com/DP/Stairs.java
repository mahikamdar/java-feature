package com.DP;

import java.util.Scanner;

public class Stairs {
	 static int stcount(int n)
	    {
	        if (n <= 1)
	            return n;
	        return stcount(n - 1) + stcount(n - 2);
	    }
	    static int count(int stairs)
	    {
	        return stcount(stairs + 1);
	    }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter The no Of Stairs: ");
		int stairs=sc.nextInt();
		 System.out.println("Number of ways = " + count(stairs));
	
	}

}
