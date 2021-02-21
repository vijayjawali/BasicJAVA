package programming;

import java.util.Scanner;

public class DeleteNodeBST {
	
	static Scanner scan=new Scanner(System.in);
	static TreeNode root;
	static TreeNode create(TreeNode root)
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
	
	static int min(TreeNode root)
	{
		TreeNode temp1,temp2;
		
		if(root==null)
		{
			System.out.println("Tree does not exist");
			return 0;
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
			return temp1.data;
			
		}
	}
	
	static TreeNode deleteNode(TreeNode root, int key) 
	{ 
		/* Base Case: If the tree is empty */
		if (root == null) return root; 

		/* Otherwise, recur down the tree */
		if (key < root.data) 
			root.leftnode = deleteNode(root.leftnode, key); 
		else if (key > root.data) 
			root.rightnode = deleteNode(root.rightnode, key); 

		// if key is same as root's key, then This is the node 
		// to be deleted 
		else
		{ 
			// node with only one child or no child 
			if (root.leftnode == null) 
				return root.rightnode; 
			else if (root.rightnode == null) 
				return root.leftnode; 

			// node with two children: Get the inorder successor (smallest 
			// in the right subtree) 
			root.data = min(root.rightnode); 

			// Delete the inorder successor 
			root.rightnode = deleteNode(root.rightnode, root.data); 
		} 

		return root; 
	} 

	static void inOrderTraversal(TreeNode root)
	{
		if(root!=null)
		{
			inOrderTraversal(root.leftnode);
			System.out.println(root.data);
			inOrderTraversal(root.rightnode);
		}
	}
	
	public static void main(String[] args) {
		int x=1;
		while(x==1)
		{
			root=create(root);
			System.out.println("press 1 to repeat");
			x=scan.nextInt();
			
		}
		
		
		inOrderTraversal(root);
		System.out.println("enter the key to delete");
		int a=scan.nextInt();
		deleteNode(root,a);
		inOrderTraversal(root);
	
	}

}
