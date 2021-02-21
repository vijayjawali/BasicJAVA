package programming;

import java.util.Scanner;

public class OddEvenLinkedList {
	
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
	
	static void disp(Node first)
    {
    	Node temp;
    	if(first==null)
    	{
    		System.out.println("Display not possible");
    	}
    	else if(first.link==null)
    	{
    		System.out.println(first.data);
        }
    	else
    	{
    		temp=first;
    		while(temp!=null)
    		{
    			System.out.print(temp.data+" ");
    			temp=temp.link;
    		}
    	}
    	System.out.println();
    }
	
	static void oddEven(Node first)
	{
		Node temp;
		int odd=0;
		int even=0;
		if(first==null)
		{
			System.out.println("Linked list does not exist");
			return;
		}
		else if(first.link==null)
		{
			if(first.data%2==0)
			{
				++even;
			}
			else
			{
				++odd;
			}
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				if(temp.data%2==0)
				{
					++even;
				}
				else
				{
					++odd;
				}
				temp=temp.link;
			}
		}
		System.out.println("odd numbers are "+odd);
		System.out.println("even numbers are "+even);
	}

	public static void main(String[] args) {

		Node first=null;
		System.out.println("enter the linked list");
		first=create(first);
		System.out.println("the linked list is");
		disp(first);
		oddEven(first);
	}

}
