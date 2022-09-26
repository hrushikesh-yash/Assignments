package com.yash.Assignment1.Array;

import java.util.Scanner;

/*
You are given a sequence of Character in the form of Array. Now you have to put all vowels and
consonants together in the array.
*/
public class Problem8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int j = 0;
		System.out.println("Enter the size of array");
		int sizeOfArray = in.nextInt();
		char[] letters = new char[sizeOfArray];
		char[] temp = new char[sizeOfArray];
		System.out.println("Enter the sequence of character Array : ");
		String sequence = in.next();
		letters = sequence.toCharArray();

		for (int i = 0; i < letters.length; i++) {

			char c = letters[i];
			if (c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {

				temp[j] = c;
				j++;
				letters[i] = '*';

			}
		}

		for (int i = 0; i < letters.length; i++) {
			if ((letters[i] >= 'a' && letters[i] <= 'z') || (letters[i] >= 'A' && letters[i] <= 'Z')) {
				temp[j] = letters[i];
				j++;
				letters[i] = '*';
			}
		}

//		System.out.println("Final result is : ");
//		for (int i = 0; i < temp.length; i++) {
//			System.out.print(temp[i]);
//		}
		letters = temp;
		System.out.println("Final result is : ");
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
		}

	}
}
