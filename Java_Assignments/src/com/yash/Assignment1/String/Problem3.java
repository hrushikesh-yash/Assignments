package com.yash.Assignment1.String;
import java.util.Scanner;

/*WAP to replace all small letter by capital and capital by small*/
public class Problem3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String inputString;

		System.out.println("Enter the string  : ");
		inputString = sc.nextLine();
		char[] stringToChar=inputString.toCharArray();
		for (int i = 0; i<stringToChar.length; i++) {
		      if(stringToChar[i] >= 'a' && stringToChar[i] <= 'z') {
		    	  stringToChar[i] = (char) (stringToChar[i] - 32);
		      }
		      else if(stringToChar[i] >= 'A' && stringToChar[i] <= 'Z')
		      {
		    	  stringToChar[i] = (char) (stringToChar[i] + 32);
		      }
		   }
		   System.out.println("String in Upper Case : ");
		   for (int i = 0; i<stringToChar.length; i++) {
			   System.out.print(stringToChar[i]);
		   }
	}

}
