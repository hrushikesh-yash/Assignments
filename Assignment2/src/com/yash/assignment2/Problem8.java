package com.yash.assignment2;

public class Problem8
{
	Problem8()
	{
		System.out.println("Object Is Created");
	}
	
	protected void finalize()
	{
		System.out.println("Object Is Destroyed");
	}
	
	
	public static void main(String[] args) 
	{
		Problem8 pe = new Problem8();
		//System.out.println(pe.hashCode());
		//System.out.println(pe.hashCode());
		pe = null;// By giving Null Refrence
		//System.out.println(pe);
		Problem8 p1 = new Problem8();
		//System.out.println(p1.hashCode());
		Problem8 p2 = new Problem8();
		//System.out.println(p2.hashCode());
		p1 = p2; //By Assigning
		new Problem8();//anoymonous object refrence
		//System.out.println(p1.hashCode());
		//System.out.println(pe.hashCode());
		//System.out.println(p2.hashCode());
		System.gc();
	}
	//System.out.println("Four Objects Are Created And Two Objects Are Destroyed");
}

