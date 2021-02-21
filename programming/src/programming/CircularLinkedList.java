package programming;

import java.util.Scanner;

class CircularNode
{
	int data;
	CircularNode link;
	CircularNode()
	{
		data=0;
		link=null;
	}
	CircularNode(int data,CircularNode link)
	{
		this.data=data;
		this.link=link;
	}
}

public class CircularLinkedList {
	static Scanner scan=new Scanner(System.in);
    static CircularNode first;
    static void disp()
    {
    	CircularNode temp;
    	if(first==null)
    	{
    		System.out.println("Display not possible");
    	}
    	else if(first.link==first)
    	{
    		System.out.println(first.data);
        }
    	else
    	{
    		temp=first;
    		while(temp.link!=first)
    		{
    			System.out.print(temp.data+" ");
    			temp=temp.link;
    		}
    		System.out.print(temp.data);
    		
    	}
    	System.out.println();
    }
    static void insertfront()
    {
    	CircularNode newnode=new CircularNode();
    	CircularNode temp;
    	System.out.println("enter the data");
    	newnode.data=scan.nextInt();
        newnode.link=null;
        if(first==null)
        {
        	first=newnode;
        	first.link=first;
        }
        else
        {
        	temp=first;
        	while(temp.link!=first)
        	{
        		temp=temp.link;
        	}
        	temp.link=newnode;
        	newnode.link=first;
        	first=newnode;
        }
    }
    static void insertrear()
    {
    	CircularNode temp;
    	CircularNode newnode=new CircularNode();
    	System.out.println("enter the data");
    	newnode.data=scan.nextInt();
    	newnode.link=null;
    	if(first==null)
    	{
    		first=newnode;
    		first.link=first;
    	}
    	else
    	{
    		temp=first;
    		while(temp.link!=first)
    		{
    			temp=temp.link;
    		}
    		temp.link=newnode;
    		newnode.link=first;
    	}
    }
    static void deletefront()
    {
    	CircularNode temp;
    	if(first==null)
    	{
    		System.out.println("Delete not possible");
    	}
    	else if(first.link==first)
    	{
    		System.out.println("element deleted is"+first.data);
    		first=null;
    	}
    	else
    	{
    		System.out.println("element deleted is"+first.data);
    		temp=first;
    		while(temp.link!=first)
    		{
    			temp=temp.link;
    		}
    		
    		first=first.link;
    		temp.link=first;
    		
    	}
    }
    static void deleterear()
    {
    	CircularNode temp;
    	if(first==null)
    	{
    		System.out.println("deletion not possible");
    	}
    	else if(first.link==first)
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
    		temp.link=first;
    	}
    }
    static void insertatposition()
    {
    	System.out.println("enter the position at which element has to be entered");
    	int position=scan.nextInt();
    	CircularNode temp=first;
    	CircularNode x;
    	CircularNode newnode=new CircularNode();
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
    	CircularNode temp=first;
    	CircularNode x;
    	
    	int i=0;
    	while(i<position-1)
    	{
    		temp=temp.link;
    		i++;
    	}
    	temp.link=temp.link.link;
    	
    }
	
	public static void main(String[] args) {

		CircularLinkedList circularlinkedList=new CircularLinkedList();
		int choice;
		while(true)
		{
		
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
