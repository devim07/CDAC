class LinkedListOperation
{
	static Node head;
static class Node
{
	
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
	void display()
	{
		Node n;
		n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	void insertAtBeg(int new_Data)
	{
		Node new_node=new Node(new_Data);//new node
		new_node.next=head;//
		head=new_node;
		
	}
	void insertAtPosition(Node prev,int new_data)
	{
	if(head==null)
	{
		System.out.println("iinsersion is not possible");
		
	}
	Node new_node=new Node(35);//new node
	
	new_node.next=prev.next;
    prev.next=new_node;	
	}

public static void main(String args[])
  {
   LinkedListOperation l=new LinkedListOperation();
   l.head=new Node(10);
   Node e2=new Node(20);
   Node e3=new Node(30);
   Node e4=new Node(40);
   l.head.next=e2;
   e2.next=e3;
   e3.next=e4;	
   l.display();
   System.out.println("After inserting at beggining:");
   l.insertAtBeg(5);
   l.display();
   l.insertAtPosition(l.head.next.next,35);
   System.out.println("After inserting at position:");
   l.display();
  }
}