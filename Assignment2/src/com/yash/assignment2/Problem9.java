package com.yash.assignment2;

public class Problem9 implements Cloneable
{
	int empId; 
	String empName; 
	int empSalary;
	String deptname;
	
	public Problem9(int empId, String empName, int empSalary, String deptname) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptname = deptname;
	}
	
	public Object clone () throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Problem9 one = new Problem9(101,"Vedant",12000,"JAVA");
		Problem9 two = new Problem9(102,"AKshay",1000,"Testing");
		two =(Problem9) one.clone();
		
		System.out.println(two.deptname);
		System.out.println(two.empId);
		System.out.println(two.empName);
		System.out.println(two.empSalary);
		
		if (two instanceof Problem9) 
		{
			System.out.println("Yes It Is Object Of Class ProgramNine");
		}
		System.out.println(one == two);
		
	}
}
