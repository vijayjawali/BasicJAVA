package programming;

import java.util.Scanner;

public class EliminateDuplicateLinkedList {

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

	static Node lindup(Node first)
	{
		Node temp1,temp2,temp3;
		if(first==null)
		{
			System.out.println("duplicate not present");
			return first;
		}
		else if(first.link==null)
		{
			System.out.println("duplicate not present");
			return first;
		}
		else
		{
			temp1=first;
			while(temp1.link!=null)
			{
				temp2=temp1;
				temp3=temp1.link;
				while(temp3!=null)
				{
					if(temp1.data==temp2.data)
					{
						temp2.link=temp3.link;
						temp3=temp2.link;
					}
					else
					{
						temp2=temp3;
						temp3=temp3.link;
					}
				}
				temp1=temp1.link;
			}
			return first;
		}	
	}
	public static void main(String[] args) {

		Node first=null;
		System.out.println("enter the linked list");
		first=create(first);
		System.out.println("the linked list is");
		disp(first);
		first=lindup(first);
		System.out.println("the linked list after duplicate deletion is");
		disp(first);
		
	}

}
