package programming;

import java.util.Scanner;

public class SumOfLinkedList {

	static Scanner scan=new Scanner(System.in);
	static Node create(Node first)
	{
		int choice;
		do
		{
			Node newnode=new Node();
			System.out.println("enter the element to add");
			newnode.data=scan.nextInt();
			newnode.link=null;
			
			if(first==null)
			{
				first=newnode;
			}
			else
			{
				newnode.link=first;
				first=newnode;
			}
			System.out.println("do you want to continue 0/1");
			choice=scan.nextInt();
		}while(choice==1);
			
		return first;
	}
	
	static int linadd(Node first)
	{
		int sum=0;
		Node temp;
		temp=first;
		while(temp!=null)
		{
			sum+=temp.data;
			temp=temp.link;
		}
		return sum;
	}
	public static void main(String[] args) {
		Node first=null;
		System.out.println("enter the linked list");
		first=create(first);
		int sum=linadd(first);
		System.out.println("the sum of all nodes in linked list is"+sum);		
	}

}
