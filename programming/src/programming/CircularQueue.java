package programming;

import java.util.Scanner;

public class CircularQueue {
     static Scanner scan=new Scanner(System.in);
	int size;
	int front=0;
	int rear=-1;
	int count=0;
	int cq[];
	CircularQueue(int size)
	{
		this.size=size;
		cq=new int[size];
	}
	void insert()
	{
		int element;
		if(count==size)
		{
			System.out.println("insertion not possible");
		}
		else
		{
			System.out.println("enter an element");
			element=scan.nextInt();
			rear=(rear+1)%size;
			cq[rear]=element;
			count++;
		}
	}
	void delete()
	{
		if(count==0)
		{
			System.out.println("deletion not possible");
		}
		else
		{
			System.out.println("element deleted is"+cq[front]);
			front=(front+1)%size;
			count--;
		}
	}
	void disp()
	{
		int front1=front;
		if(count==0)
		{
			System.out.println("Display not possible");
		}
		else
		{
			for(int i=0;i<count;i++)
			{
				System.out.println(cq[front1]);
				front1=(front1+1)%size;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("enter the size of the circularqueue");
		int n=scan.nextInt();
		CircularQueue circularQueue=new CircularQueue(n);
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
			case 1: circularQueue.insert();
			           break;
			case 2: circularQueue.delete();
	                   break;   
			case 3: circularQueue.disp();
	                   break;
	        default: System.exit(0);  
	                    break;
	                      
			}
			
		}
	
		

	}

}
