package programming;

import java.util.Scanner;

class Node
{
	int data;
	Node link;
	Node()
	{
		data=0;
		link=null;
	}
	Node(int data,Node link)
	{
		this.data=data;
		this.link=link;
	}
}

public class Linkedlist {	
	static Scanner scan=new Scanner(System.in);
    static Node first;
    static void disp()
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
    static void insertfront()
    {
    	Node newnode=new Node();
    	System.out.println("enter the data");
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
    }
    static void insertrear()
    {
    	Node temp;
    	Node newnode=new Node();
    	System.out.println("enter the data");
    	newnode.data=scan.nextInt();
    	newnode.link=null;
    	if(first==null)
    	{
    		first=newnode;
    	}
    	else
    	{
    		temp=first;
    		while(temp.link!=null)
    		{
    			temp=temp.link;
    		}
    		temp.link=newnode;
    	}
    }
    static void deletefront()
    {
    	if(first==null)
    	{
    		System.out.println("Delete not possible");
    	}
    	else if(first.link==null)
    	{
    		System.out.println("element deleted is"+first.data);
    		first=null;
    	}
    	else
    	{
    		System.out.println("element deleted is"+first.data);
    		first=first.link;
    	}
    }
    static void deleterear()
    {
    	Node temp;
    	if(first==null)
    	{
    		System.out.println("deletion not possible");
    	}
    	else if(first.link==null)
    	{
    		System.out.println("element deleted is "+first.data);
    		first=null;
    	}
    	else
    	{
    		temp=first;
    		while(temp.link.link!=null)
    		{
    			temp=temp.link;
    		}
    		System.out.println("element deleted is "+temp.link.data);
    		temp.link=null;
    	}
    }
    static void insertatposition()
    {
    	System.out.println("enter the position at which element has to be entered");
    	int position=scan.nextInt();
    	Node temp=first;
    	Node x;
    	Node newnode=new Node();
    	newnode.data=scan.nextInt();
    	newnode.link=null;
    	int i=0;
    	while(i<position-1)
    	{
    		temp=temp.link;
    		i++;
    	}
    	x=temp.link;
    	temp.link=newnode;
    	newnode.link=x;
    }
    static void deleteatposition()
    {
    	System.out.println("enter the position at which element has to be deleted");
    	int position=scan.nextInt();
    	Node temp=first;
    	Node x;
    	
    	int i=0;
    	while(i<position-1)
    	{
    		temp=temp.link;
    		i++;
    	}
    	temp.link=temp.link.link;
    	
    }
	
	public static void main(String[] args) {

		int choice;
		while(true)
		{
			Linkedlist linkedList=new Linkedlist();
			System.out.println("press 1 to insert at front");
			System.out.println("press 2 to insert at rear");
			System.out.println("press 3 to delete at front");
			System.out.println("press 4 to delete at rear");
			System.out.println("press 5 to display");
			System.out.println("press 6 to insert at position");
			System.out.println("press 7 to delete at position");
			System.out.println("press 8 to exit");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1: insertfront();
			           break;
			case 2: insertrear();
	                   break;   
			case 3: deletefront();
	                   break;
			case 4: deleterear();
	                   break;
			case 5: disp();
	                   break;
			case 6: insertatposition();
			           break;
			case 7: deleteatposition();
			           break;
	       default: System.exit(0);
	                   break;
			}
			
		}
	
	}

}
