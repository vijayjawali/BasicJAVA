package programming;

import java.util.Scanner;

class TreeNode
{
	TreeNode leftnode;
	int data;
	TreeNode rightnode;
	TreeNode()
	{
		leftnode=null;
		data=0;
		rightnode=null;
	}
	TreeNode(TreeNode leftnode ,int data, TreeNode rightnode)
	{
		this.leftnode=leftnode;
		this.data=data;
		this.rightnode=rightnode;
	}
}

public class Trees {
	static Scanner scan=new Scanner(System.in);
	static TreeNode root;
	TreeNode create(TreeNode root)
	{
		TreeNode newnode=new TreeNode();
		TreeNode temp1,temp2;
		int element;
		System.out.println("Entert the element");
		newnode.leftnode=null;
		newnode.data=scan.nextInt();
		newnode.rightnode=null;
		
		if(root==null)
		{
			root=newnode;
		}
		else
		{
			temp1=null;
			temp2=root;
			while(temp2!=null)
			{
				if(newnode.data<temp2.data)
				{
					temp1=temp2;
					temp2=temp2.leftnode;
				}
				else
				{
					temp1=temp2;
					temp2=temp2.rightnode;
				}
			}
			if(newnode.data<temp1.data)
			{
				temp1.leftnode=newnode;
			}
			else
			{
				temp1.rightnode=newnode;
			}
		}
		return root;		
	}
	
	void preOrderTraversal(TreeNode root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			preOrderTraversal(root.leftnode);
			preOrderTraversal(root.rightnode);
		}
	}
	
	void postOrderTraversal(TreeNode root)
	{
		if(root!=null)
		{
			postOrderTraversal(root.leftnode);
			postOrderTraversal(root.rightnode);
			System.out.println(root.data);
			
		}
	}
	
	void inOrderTraversal(TreeNode root)
	{
		if(root!=null)
		{
			inOrderTraversal(root.leftnode);
			System.out.println(root.data);
			inOrderTraversal(root.rightnode);
		}
	}
	
	void min(TreeNode root)
	{
		TreeNode temp1,temp2;
		
		if(root==null)
		{
			System.out.println("Tree does not exist");
		}
		else
		{
			temp1=null;
			temp2=root;
			while(temp2!=null)
			{
				temp1=temp2;
				temp2=temp2.leftnode;
			}
			System.out.println("minimum element is"+temp1.data);
		}
	}
	
	void max(TreeNode root)
	{
		TreeNode temp1,temp2;
		
		if(root==null)
		{
			System.out.println("Tree does not exist");
		}
		else
		{
			temp1=null;
			temp2=root;
			while(temp2!=null)
			{
				temp1=temp2;
				temp2=temp2.rightnode;
			}
			System.out.println("maximum element is"+temp1.data);
		}
	}

	public static void main(String[] args) {

		Trees tree=new Trees();
		int choice;
		while(true)
		{
		    
			System.out.println("press 1 to create a node");
			System.out.println("press 2 for pre order traversal ");
			System.out.println("press 3 for in order traversal ");
			System.out.println("press 4 for post order traversal ");
			System.out.println("press 5 to find the maximum element ");
			System.out.println("press 6 to find the minimum element ");
			System.out.println("press 7 to exit");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:root=tree.create(root);
			          break;
			case 2:tree.preOrderTraversal(root);
	                  break;
			case 3:tree.inOrderTraversal(root);
	                  break;
			case 4:tree.postOrderTraversal(root);
                      break;
			case 5:tree.max(root);
			          break;
			case 6:tree.min(root);
			          break;
		    default:System.exit(0);
			          break;
			}
			
		}
	}

}
