package programming;

import java.util.Scanner;

public class SearchLinkedList {
	
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
	
	static void search(Node first,int key)
	{
		Node temp;
		if(first==null)
		{
			System.out.println("Search not possible");
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				if(temp.data==key)
				{
					System.out.println("key found");
					return;
				}
				else
				{
					temp=temp.link;
				}
			}
			System.out.println("key not found");
		}
	}
	
	

	public static void main(String[] args) {

		
		Node first=null;
		System.out.println("enter the linked list");
		first=create(first);
		System.out.println("he linked list is");
		disp(first);
		System.out.println("enter the key to search");
		int key=scan.nextInt();
		search(first,key);
	}

}
