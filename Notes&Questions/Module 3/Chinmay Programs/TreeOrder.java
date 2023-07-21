

import java.util.Scanner;
 
public class TreeOrder
{	
	static Node create()
	{
		Scanner sc=new Scanner(System.in);
		Node root=null;
		System.out.print("enter value");
		int data=sc.nextInt();
		if(data== -1)
			return null;
		Node root=new Node(data);
		System.out.println("enter left child of" +root.data);
		root.left=create();  //recursive call
		System.out.println("enter right child of" +root.data);
		root.right=create();   //recursive call
		return root;
	}
	
	static void inorder(Node root) //LNR
	{
		if(root==null)
			return;
		
		inorder(root.left);
		System.out.println(root.data +" ");
		inorder(root.right);
	}
	
	static void preorder(Node root)  //NLR
	{
		if(root==null)
			return;
		
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	
	static void postorder(Node root)  //LRN
	{
		if(root==null)
			return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
	
	
	public static void main(String...args)
	{
		Node root=create();
		preorder(root);
		System.out.println();
		
		postorder(root);
		System.out.println();
		
		inorder(root);
		System.out.println();
	}
}

class Node
{
	Node left,right;
	int data;
	public Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}