import java.util.*;
 class DoublyLL
{
	// create a node
	static class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	Node head=null; // head var is not static coz class node is inner class and to access head class node we dont have to declared heas as static bt if we create separate class Node then we have to declared head as static
	Node tail=null;
	
	public void creation()
	{
		int data, n;
		Scanner sc= new Scanner(System.in);
		do
		{
		System.out.println("Enter data");
		data=sc.nextInt();
		Node new_node= new Node(data); // coz of this line control goes to line no 5 and new node got data and next part
		
		//adding a new node
		if(head==null)       // this statement executed only once coz we link head with the node at line no 31 and after that else part executed always
		{
			head=new_node;
			tail=new_node;
		}
		else
		{
			System.out.println("Enter 1 to insert the item at beginning, 2 to insert the item at the end, 3 to insert the item at particular location ");
			int m=sc.nextInt();
			switch(m)
			{
				case 1:
				       new_node.next=head;
					   head.prev=new_node;
			           head=new_node;
			           
				       break;
                case 2:
                       tail.next=new_node;
					   new_node.prev=tail;
					   tail=new_node;
					   break;
                case 3:
                       System.out.println("enter position of node to be inserted");
                      int p=sc.nextInt();
                       Node temp1=head;
					   Node ptr1=temp1.next;
                       for(int i=1; i<(p-1); i++)
					   {
                           temp1=ptr1;						  
						  ptr1=ptr1.next;
					   }					
                         new_node.prev=temp1;
						 new_node.next=ptr1;
						 temp1.next=new_node;
						 ptr1.prev=new_node;
						 
                         break;						 
			}
		}
		System.out.println("Do you want to add more data.If yes , press : 1");
		n=sc.nextInt();
		}
		while(n==1);
	}
	
	// to get the data from node we need to traverse the pointer so for that we create new pointer temp
	public void traverser()
	{
		Node temp= head;   // if head have node then coz of this line temp also point to same node that head pointed
		if(head==null) // for checking L.L. is existing or not
		{
		   System.out.println("LL does not exist");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;                // temp traverse coz of this line
			}
		}
	}
	
	
	public static void main(String...args)
	{
		DoublyLL l1= new DoublyLL();
		l1.creation();
		l1.traverser();
	}
}