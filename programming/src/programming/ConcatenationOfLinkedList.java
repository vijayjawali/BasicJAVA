package programming;

import java.util.Scanner;



public class ConcatenationOfLinkedList {

	static Scanner scan=new Scanner(System.in);
	
	static Node concat(Node first1,Node first2)
	{
		Node temp;
		temp=first1;
		while(temp.link!=null)
		{
			temp=temp.link;
		}
		temp.link=first2;
		return first1;
	}
	
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
			System.out.println("display not possible");
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
				System.out.println(temp.data);
				temp=temp.link;
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
        first1=concat(first1,first2);
        System.out.println("the concatenated linked list is");
        disp(first1);
	}

}
