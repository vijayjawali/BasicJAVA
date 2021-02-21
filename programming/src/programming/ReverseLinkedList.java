package programming;

import java.util.Scanner;

public class ReverseLinkedList {
	
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
	
	static Node reverse(Node first)
	{
		Node x,y,z;
		x=first;
		y=first.link;
		z=first.link.link;
		while(z!=null)
		{
			y.link=x;
			x=y;
			y=z;
			z=z.link;
		}
		y.link=x;
		first.link=null;
		first=y;
		
		return first;
	}

	public static void main(String[] args) {

		Node first=null;
		System.out.println("enter the linked list");
		first=create(first);
		System.out.println("the original linked list is");
		disp(first);
		first=reverse(first);
		System.out.println("the reversed linked list is");
		disp(first);
		
	}

}
