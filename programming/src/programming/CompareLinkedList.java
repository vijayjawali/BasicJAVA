package programming;

import java.util.Scanner;

public class CompareLinkedList {

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

	
	static void linequ(Node first1,Node first2)
	{
		Node temp1,temp2;
		if(first1==null && first2==null)
		{
			System.out.println("linked lists do not exists");
		}
		else if(first1.link==null && first2.link==null)
		{
			if(first1.data==first2.data)
			{
				System.out.println("linked lists are equal");
			}
			else
			{
				System.out.println("linked lists are not equal");
			}
		}
		else
		{
			temp1=first1;
			temp2=first2;
			while(temp1!=null && temp2!=null)
			{
				if(temp1.data!=temp2.data)
				{
					System.out.println("linked lists are unequal");
					return;
				}
				else
				{
					temp1=temp1.link;
					temp2=temp2.link;
				}		
			}
			if(temp1==null && temp2!=null)
			{
				System.out.println("linked lists are unequal");
			}
			else if(temp2==null && temp1!=null)
			{
				System.out.println("linked lists are unequal");
			}
			else
			{
				System.out.println("linked lists are equal");
			}
		}
	}
	public static void main(String[] args) {

		Node first1=null;
		Node first2=null;
		System.out.println("enter the first linked list");
		first1=create(first1);
		System.out.println("enter the second linked list");
		first2=create(first2);
		disp(first1);
		
		disp(first2);
		linequ(first1,first2);
		
	}

}
