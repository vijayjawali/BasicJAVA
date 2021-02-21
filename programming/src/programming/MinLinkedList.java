package programming;

import java.util.Scanner;

public class MinLinkedList {
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
	
	static int linMin(Node first)
	{
		int min;
		Node temp;
		if(first==null)
		{
			System.out.println("linked list does not exist");
			return 0;
		}
		else if(first.link==null)
		{
			min=first.data;
			return min;
		}
		else
		{
			min=first.data;
			temp=first.link;
			while(temp!=null)
			{
				if(temp.data<min)
				{
					min=temp.data;
				}
				temp=temp.link;
			}
			return min;
		}
	}

	public static void main(String[] args) {

		Node first=null;
		System.out.println("enter the linked list");
		first=create(first);
		System.out.println("the linked list is");
		disp(first);
		int min=linMin(first);
		System.out.println("minimum node is "+min);
	}

}
