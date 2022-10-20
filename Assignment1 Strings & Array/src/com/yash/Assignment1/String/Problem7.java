package com.yash.Assignment1.String;
import java.util.Scanner;

/*WAP to implement stack of String. A stack in which you can push and pop element from only
one side.*/
public class Problem7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Stack s= new Stack();
		System.out.println("Stack Operations");
		for (;;) {
			System.out.println("\nChose one from the below options...\n");
			System.out.println("\n1.Push\n2.Pop\n3.Exit");
			System.out.println("\n Enter your choice \n");
			choice = sc.nextInt();
			switch (choice) {
				case 1: {
					s.push(sc);
					s.display();
					break;
				}
				case 2: {
					s.pop();
					s.display();
					break;
				}
				case 3: {
					System.out.println("Exiting....");
					System.exit(0);
					break;
				}
				default: {
					System.out.println("Please Enter valid choice ");
				}
			}

		}
	}

}



class Stack   
{  
    int top;   
    int maxsize = 10;  
    String[] arr = new String[maxsize];  
      
      
    boolean isEmpty()  
    {  
        return (top < 0);  
    }  
    Stack()  
    {  
        top = -1;  
    }  
    boolean push (Scanner sc)  
    {  
        if(top == maxsize-1)  
        {  
            System.out.println("Overflow !!");  
            return false;  
        }  
        else   
        {  
            System.out.println("Enter Value");  
            String val = sc.next();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
            return true;  
        }  
    }  
    boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("Underflow !!");  
            return false;  
        }  
        else   
        {  
              
            System.out.println(arr[top]+" Item popped");  
            top --; 
            return true;  
        }  
    }  
    void display ()  
    {  
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
    }  
}  
