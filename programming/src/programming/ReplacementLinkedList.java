package programming;

import java.util.Scanner;

public class ReplacementLinkedList {
	
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
	
	static void replace(Node first,int oldkey,int newkey)
	{
		int count=0;
		Node temp;
		if(first==null)
		{
			System.out.println("replacement not possible");
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				if(temp.data==oldkey)
				{
					temp.data=newkey;
					++count;
					temp=temp.link;
				}
				else
				{
					temp=temp.link;
				}
			}
			if(count==0)
			{
				System.out.println("old key not found");
			}
			else
			{
				System.out.println("the number of old keys replaced are"+count);
			}
		}
	}

	public static void main(String[] args) {

		Node first=null;
		System.out.println("enter the linked list");
		first=create(first);
		System.out.println("the entered linked list is");
		disp(first);
		System.out.println("enter the key to be replaced ");
		int oldkey=scan.nextInt();
		System.out.println("enter the new key");
		int newkey=scan.nextInt();
		replace(first,oldkey,newkey);
		System.out.println("the modified linked list is");
		disp(first);
	}

}
