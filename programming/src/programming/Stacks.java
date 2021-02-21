package programming;

import java.util.Arrays;
import java.util.Scanner;

public class Stacks {
	static Scanner scan=new Scanner(System.in);
	static int[] s;
	static int top=-1;
	static int stacksize;
	Stacks(int size)
	{
		s=new int[size];
		stacksize=size;
	}
	static void push()
	{
		int element;
		if(top==stacksize-1)
		{
			System.out.println("Push not possible");
		}
		else
		{
			System.out.println("enter the element");
			element=scan.nextInt();
			top++;
			s[top]=element;
		}
	}
	static void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("element deleted is"+s[top]);
			top--;
		}
	}
	static void disp()
	{
		if(top==-1)
		{
			System.out.println("Display notpossible");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(s[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the size of the stack");
		int n=scan.nextInt();
		Stacks stack=new Stacks(n);
		int choice;
		while(true)
		{
			System.out.println("press 1 to push");
			System.out.println("press 2 to pop");
			System.out.println("press 3 to display");
			System.out.println("press 4 to stop");
			choice=scan.nextInt();
			
			switch(choice)
			{
			case 1: push();
			           break;
			case 2: pop();
	                   break;   
			case 3: disp();
	                   break;
	        default: System.exit(0);  
	                    break;
			}
			
		}
		
	}

}
