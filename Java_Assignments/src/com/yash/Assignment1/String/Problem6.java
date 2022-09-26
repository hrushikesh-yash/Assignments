package com.yash.Assignment1.String;

import java.util.Scanner;
import java.util.Vector;

/*WAP to implement split function by you*/
public class Problem6 {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String inputString, spitString;

		System.out.println("Enter the string  : ");
		inputString = in.nextLine();

		System.out.println("Enter the spilt Charcater : ");
		spitString = in.next();
		
		char[] inputStringToChar=inputString.toCharArray();
		char spitStringToChar=spitString.charAt(0);
		String[] split= new String[4];
		int k=0,splitFrom = 0;
		for(int i=0;i<inputStringToChar.length;i++)
		{
			if(inputStringToChar[i]==spitStringToChar && k==0)
			{
				split[k]=split(0,i,inputStringToChar);
				splitFrom=i;
				k++;
				System.out.println("Split from: "+splitFrom);
			}
			else if(k>0)
			{
				if(inputStringToChar[i]==spitStringToChar)
				{
					split[k]=split(splitFrom+1,i,inputStringToChar);
					splitFrom=i;
					k++;
				}
				else if((i+1)==inputStringToChar.length)
				{
					split[k]=split(splitFrom+1,i+1,inputStringToChar);
					splitFrom=i;
					k++;
				}
				
			}
			
		}
		
		for(int i=0;i<split.length;i++)
		{
			if(split[i]!= null)
			{
				System.out.println(split[i]);
			}
			
		}
		
	}

	private static String split(int start, int end, char[] inputStringToChar) {
		
		String split = "";
		for(int i=start;i<end;i++)
		{
			split+=inputStringToChar[i];
		}
		return split;
	}

	public static String[] mySplit(String str, String regex)
	{
	    Vector<String> result = new Vector<String>();
	    int start = 0;
	    int pos = str.indexOf(regex);
	    
	    while (pos>=start) {
	        if (pos>start) {
	            result.add(str.substring(start,pos));
	        }
	        start = pos + regex.length();
	        result.add(regex);
	        pos = str.indexOf(regex,start); 
	    }
	    if (start<str.length()) {
	        result.add(str.substring(start));
	    }
	    String[] array = result.toArray(new String[0]);
	    return array;
	}
	
}
