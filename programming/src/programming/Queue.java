package programming;

import java.util.Scanner;
import java.util.Stack;

public class Queue {
	static Scanner scan=new Scanner(System.in);
	static int front=0;
	static int rear=-1;
	static int size;
	static int q[];
	Queue(int size)
	{
		this.size=size;
		q=new int[size];
	}
	static void insert()
	{
		int element;
		if(rear==size-1)
		{
			System.out.println("insertion not possible");
		}
		else
		{
			System.out.println("enter the element to insert ");
			element=scan.nextInt();
			rear++;
			q[rear]=element;
		}
	}
	static void delete()
	{
		if(rear==-1 || front>rear)
		{
			System.out.println("deletion not possible");
		}
		else
		{
			System.out.println("element deleted is "+q[front]);
			front++;
		}
	}
	static void disp()
	{
		if(rear==-1 || front>rear)
		{
			System.out.println("display not possible");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(q[i]+" ");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("enter the size of the queue");
		int n=scan.nextInt();
		Queue queue=new Queue(n);
		int choice;
		while(true)
		{
			
			System.out.println("press 1 to insert");
			System.out.println("press 2 to delete");
			System.out.println("press 3 to display");
			System.out.println("press 4 to stop");
			choice=scan.nextInt();
			
			switch(choice)
			{
			case 1: insert();
			           break;
			case 2: delete();
	                   break;   
			case 3: disp();
	                   break;
	        default: System.exit(0);  
	                    break;
			}
			
		}
	
		
		
	}

}
