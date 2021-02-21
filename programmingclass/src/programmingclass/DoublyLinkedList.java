package programmingclass;

import java.util.Scanner;



class DoubleNode
{
	DoubleNode leftlink;
	int data;
	DoubleNode rightlink;
	DoubleNode()
	{
		leftlink=null;
		data=0;
		rightlink=null;
	}
	DoubleNode(DoubleNode leftlink,int data,DoubleNode rightlink)
	{
		this.leftlink=leftlink;
		this.data=data;
		this.rightlink=rightlink;
	}
}
public class DoublyLinkedList {
	 static Scanner scan=new Scanner(System.in);
	static DoubleNode first;
	void insertfront()
	{
		DoubleNode newnode=new DoubleNode();
		System.out.println("enter the element to be added at the front");
		newnode.data=scan.nextInt();
		newnode.leftlink=null;
		newnode.rightlink=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			newnode.rightlink=first;
			first.leftlink=newnode;
			first=newnode;
		}
		
	}
	
	void insertrear()
	{
		DoubleNode temp;
		DoubleNode newnode =new DoubleNode();
		System.out.println("enter the element to be added at rear end");
		newnode.data=scan.nextInt();
		newnode.leftlink=null;
		newnode.rightlink=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			temp=first;
			while(temp.rightlink!=null)
			{
				temp=temp.rightlink;
			}
			temp.rightlink=newnode;
			newnode.leftlink=temp;
		}
	}

	void deletefront()
	{
		if(first==null)
		{
			System.out.println("deletion not possible");
		}
		else if(first.rightlink==null)
		{
			System.out.println("element deleted is "+first.data);
			first=null;
		}
		else
		{
			System.out.println("element deleted is "+first.data);
			first=first.rightlink;
			first.leftlink=null;
		}
	}
	
	void deleterear()
	{
		DoubleNode temp;
		if(first==null)
		{
			System.out.println("deletion not possible");
		}
		else if(first.rightlink==null)
		{
			System.out.println("element deleted is "+first.data);
			first=null;
		}
		else
		{
			temp=first;
			while(temp.rightlink.rightlink!=null)
			{
				temp=temp.rightlink;
			}
			System.out.println("element deleted is"+temp.rightlink.data);
			temp.rightlink=null;
		}
		
	}
	
	void disp()
	{
		DoubleNode temp;
		if(first==null)
		{
			System.out.println("display not possible");
		}
		else if(first.rightlink==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.rightlink;
			}
			
		}
		System.out.println();
		
	}
	void insertatposition()
	{
		System.out.println("enter the position at which element has to be entered");
    	int position=scan.nextInt();
    	DoubleNode temp=first;
    	DoubleNode x;
    	DoubleNode newnode=new DoubleNode();
    	newnode.data=scan.nextInt();
    	newnode.rightlink=null;
    	newnode.leftlink=null;
    	int i=0;
    	while(i<position-1)
    	{
    		temp=temp.rightlink;
    		i++;
    	}
    	x=temp.rightlink;
    	temp.rightlink=newnode;
    	newnode.rightlink=x;
    	newnode.leftlink=temp;
    	x.leftlink=newnode;
	}
	void deleteatposition()
	{
		System.out.println("enter the position at which element has to be deleted");
    	int position=scan.nextInt();
    	DoubleNode temp=first;
    	
    	int i=0;
    	while(i<position-1)
    	{
    		temp=temp.rightlink;
    		i++;
    	}
    	temp.rightlink=temp.rightlink.rightlink;
    	
	}
	public static void main(String[] args) {

		int choice;
		while(true)
		{
			DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
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
			case 1: doublyLinkedList.insertfront();
			           break;
			case 2: doublyLinkedList.insertrear();
	                   break;   
			case 3: doublyLinkedList.deletefront();
	                   break;
			case 4: doublyLinkedList.deleterear();
	                   break;
			case 5: doublyLinkedList.disp();
	                   break;
			case 6: doublyLinkedList.insertatposition();
			           break;
			case 7: doublyLinkedList.deleteatposition();
			           break;
	       default: System.exit(0);
	                   break;
			}
			
		}
	}

}
