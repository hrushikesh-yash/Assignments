package com.yash.Assignment1.Array;

import java.util.Scanner;

/*
An Array contain the n numbers you have to find out combination which satisfy Pythagoras
Template. ( Pythagoras templates:- 3*3+4*4==5*5)
*/
public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of sides of triangle. ");
		int size = 3;
		int inputArray[] = new int[size];
		int first, second, third;

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the of " + (i + 1) + " length of the thr Triangle ");
			inputArray[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = i + 2; k < size; k++) {
					first = inputArray[i];
					second = inputArray[j];
					third = inputArray[k];
					if (first * first + second * second == third * third) {
						System.out.println("This side of triangles are in the templet of Pythagoras");
						System.out.println("Value of side of traignles are :  " + first + " " + second + " " + third);
					} else {
						System.out.println("This side of triangles are not in the templet of Pythagoras");
						System.out.println("Value of side of traignles are :  " + first + " " + second + " " + third);
					}

				}
			}
		}
	}

}
