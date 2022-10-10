package com.yash.Assignment1.Array;

import java.util.Scanner;

/*
An array contains different numbers. You have to calculate average of two consecutive
numbers.
 */
public class Problem6 {
	public static void main(String[] args) 
	{
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add"); 
		n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i<n;i++)
		{
			System.out.println("Enter The Element: " + (i + 1));
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		
		for(int i = 0; i < n; i++)
		{
			if((i + 1) < n)
			{
				double avg = (arr[i] + arr [i + 1])/2;
				System.out.println("Average Of two Consecutive Number " + avg);
			}
			
		}
	}

}
