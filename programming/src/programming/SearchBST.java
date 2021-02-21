package programming;

import java.util.Scanner;

public class SearchBST {
	
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
	
	static void inOrderTraversal(TreeNode root)
	{
		if(root!=null)
		{
			inOrderTraversal(root.leftnode);
			System.out.println(root.data);
			inOrderTraversal(root.rightnode);
		}
	}

	// A utility function to search a given key in BST 
	public static  TreeNode search(TreeNode root, int key) 
	{ 
	    // Base Cases: root is null or key is present at root 
	    if (root==null)
	    {
	    	System.out.println("key not found/tree is empty");
	    	return root;
	    }
	    	
	    
	    if (root.data==key) 
	    {
	    	System.out.println("key found");
	    	return root;
	    }
	         
	  
	    // val is greater than root's key 
	    if (root.data > key) 
	        return search(root.leftnode, key); 
	  
	    // val is less than root's key 
	    return search(root.rightnode, key); 
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
		System.out.println("enter the key to search");
		int a=scan.nextInt();
		search(root,a);
		

	}

}
