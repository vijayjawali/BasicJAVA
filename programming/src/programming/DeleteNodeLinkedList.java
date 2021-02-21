package programming;

import java.util.Scanner;

public class DeleteNodeLinkedList {
	
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
	
	static Node delete(Node first,int key)
	{
		Node prev,temp;
		int count=0;
		if(first==null)
		{
			System.out.println("deletion not possible");
		}
		else if(first.link==null)
		{
			if(first.data==key)
			{	
				temp=first;
				first=first.link;
				++count;
			}
		}
		else
		{
			prev=null;
			temp=first;
			while(temp!=null)
			{
				if(temp.data==key)
				{
					prev.link=temp.link;
					++count;
					temp=prev.link;
				}
				else
				{
					prev=temp;
					temp=temp.link;
				}
			}
			if(count==0)
			{
				System.out.println("key not found");
			}
			else
			{
				System.out.println("the number of times the node deleted is"+count);
			}   
		}
		 return first;
	}

	public static void main(String[] args) {

		Node first=null;
		System.out.println("enter the linked list");
		first=create(first);
		System.out.println("the linked list is");
		disp(first);
		System.out.println("enter the key node to be deleted");
		int key=scan.nextInt();
		first=delete(first,key);
		System.out.println("the linked list after deletion is");
		disp(first);
		
	}

}
