

import java.util.Scanner;
public class BT_Creation
{
	
	
	static Node create()
	{
		Scanner sc=new Scanner(System.in);
		Node root=null;
		System.out.println("enter value");
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
	
	public static void main(String...args)
	{
		Node root=create();
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