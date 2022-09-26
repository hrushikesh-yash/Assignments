package com.yash.Assignment1.Array;

import java.util.Scanner;

/*WAP to remove duplicate numbers from list of numbers.*/
public class Problem2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add");
		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Element: " + (i + 1));
			arr[i] = sc.nextInt();
		}
		System.out.println("");

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
//					System.out.println("Duplicates Elements Are :" + arr[i]);
					arr[j] = arr[n - 1];
					n--;
				}
			}
		}
		System.out.println("New Array Without Repeatations");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
