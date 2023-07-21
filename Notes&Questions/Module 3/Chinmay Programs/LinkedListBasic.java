import java.util.*;
 class single_creation
{
	// create a node
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
	Node head=null; // head var is not static coz class node is inner class and to access head class node we dont have to declared heas as static bt if we create separate class Node then we have to declared head as static
	
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
			head=new_node;     //10
		}
		else
		{
			new_node.next=head;   //30 20 10
			head=new_node;
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
		single_creation l1= new single_creation();
		l1.creation();
		l1.traverser();
	}
}