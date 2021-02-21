package programming;

import java.util.Scanner;

public class LinkedListCounting {
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
	
	static int linkedlistcount(Node first)
	{
		int count=0;
		Node temp=first;
		while(temp!=null)
		{
			temp=temp.link;
			count++;
		}
		
		return count;
		
	}

	public static void main(String[] args) {

		int count;
		Node first=null;
		System.out.println("enter the linked list");
		first=create(first);
		count=linkedlistcount(first);
		System.out.println("the number of elements in linked list are "+count);
	}

}
