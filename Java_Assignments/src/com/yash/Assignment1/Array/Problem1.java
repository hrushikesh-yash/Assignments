package com.yash.Assignment1.Array;
import java.util.Scanner;

/*WAP to find third minimum number from list of numbers.*/

public class Problem1 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int sizeOfArray= in.nextInt();
		int [] array = new int [sizeOfArray];
        for (int i = 0; i < array.length; i++) {
        	System.out.println("Enter the element of the array : "+(i+1));
        	array[i]=in.nextInt();
		}
		thirdSmallestElement(array);

	}
	
	public static void thirdSmallestElement(int [] arrA){

        if(arrA.length<3){
            System.out.println("Invalid Input, array size is less than 3");
        }

        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i <arrA.length ; i++) {
            int current = arrA[i];
            if(first>current){
                third = second;
                second = first;
                first = current;
            }else if(second>current){
                third = second;
                second = current;
            }else if(third>current){
                third=current;
            }
        }
        System.out.println("Third smallest element is: " + third);
    }

	

}
