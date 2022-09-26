package com.yash.Assignment1.Array;
/*
 WAP to sort array on the basis of unit place. For example we are having following numbers:-
10,2,3,41,12,13,19,81,9,100. Output will be 10,100,41,81,2,12,3,13,19,9
*/
public class Problem12 {
	public static void main(String[] args)
	{
		int a[] = {10,2,3,41,12,13,19,81,9,100};  
		  int n = a.length;  
//		  System.out.println("Before sorting array elements are - \n");  
//		  printArray(a,n);  
//		  radixsort(a, n);  
//		  System.out.println("After applying Radix sort, the array elements are - \n");  
//		  printArray(a, n);  
	}
}
//
//static int getMax(int a[], int n) {  
//	   int max = a[0];  
//	   for(int i = 1; i<n; i++) {  
//	      if(a[i] > max)  
//	         max = a[i];  
//	   }  
//	   return max; //maximum element from the array  
//	}  
//	  
//	static void countingSort(int a[], int n, int place) // function to implement counting sort  
//	{  
//	  int [] output= new int[n+1];  
//	  int[] count = new int[] {0,0,0,0,0,0,0,0,0,0};    
//	  
//	  // Calculate count of elements  
//	  for (int i = 0; i < n; i++)  
//	    count[(a[i] / place) % 10]++;  
//	      
//	  // Calculate cumulative frequency  
//	  for (int i = 1; i < 10; i++)  
//	    count[i] += count[i - 1];  
//	  
//	  // Place the elements in sorted order  
//	  for (int i = n - 1; i >= 0; i--) {  
//	    output[count[(a[i] / place) % 10] - 1] = a[i];  
//	    count[(a[i] / place) % 10]--;  
//	  }  
//	  
//	  for (int i = 0; i < n; i++)  
//	    a[i] = output[i];  
//	}  
//	  
//	// function to implement radix sort  
//	static void radixsort(int a[], int n) {  
//	   
//	  // get maximum element from array  
//	  int max = getMax(a, n);  
//	  
//	  // Apply counting sort to sort elements based on place value  
//	  for (int place = 1; max / place > 0; place *= 10)  
//	    countingSort(a, n, place);  
//	}  
//	  
//	// function to print array elements  
//	static void printArray(int a[], int n) {  
//	  for (int i = 0; i < n; ++i) {  
//		  System.out.println(" "+ a[i]);  
//	  }  
//	  System.out.println("\n");  
//	}  
//}
//	