import java.util.*;
 class circularLL
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
	Node head=null;
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
			new_node.next=head;
		}
		else
		{
			new_node.next=head;
			head=new_node;
			tail.next=head;
			
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
			do 
			{
				System.out.println(temp.data);
				temp=temp.next;                // temp traverse coz of this line
			}
			while(temp!=head);   //In SLL we traverse the pointer till the temp(pointer) is not equal to null but In CLL we traverse the tail till head is not equal to head coz head also hold the address of 1st node and last node next part also hold the same address so if while traversing the tail got the address of 1st node then it should be the last node of LL
		}
	}
	
	
	public static void main(String...args)
	{
		single_creation l1= new single_creation();
		l1.creation();
		
         
		l1.traverser();
	}
}