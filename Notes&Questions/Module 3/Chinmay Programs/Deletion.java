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
	Node head=null;
	
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
			System.out.println("Enter 1 to insert the item at beginning, 2 to insert the item at the end, 3 to insert the item at particular location ");
			int m=sc.nextInt();
			switch(m)
			{
				case 1:
				       new_node.next= head;
					   head= new_node;
					   break;
				
                case 2:
                       Node temp=head;
                       while(temp.next!=null)
					   {
						   temp=temp.next;
					   }
                       temp.next=new_node;	
                       break;	
                case 3:
                       System.out.println("enter position of node to be inserted");
                      int
					  p=sc.nextInt();
                       Node temp1=head;
                       for(int i=0; i<(p-1); i++)
					   {
						   temp1=temp1.next;
					   }					
                         new_node.next=temp1.next;
                         temp1.next=new_node;
                         break;						 
			}
		}
		System.out.println("Do you want to add more data.If yes , press : 1");
		n=sc.nextInt();
		}
		while(n==1);
	}
	 
	 public void delete()
	 {
		 int data,n,m,p;
		 Scanner sc= new Scanner(System.in);
		 do
		 {
			 if(head==null)
			 {
				 System.out.println("LL is empty");
			 }
			 else
			 {
				 System.out.println("Enter 1 to delete the item from beginning, 2 to delete the item from the end, 3 to delete the item at specific position");
				 int m1=sc.nextInt();
				 switch(m1)
				 {
					 case 1:
					 Node temp=head;
					 temp=temp.next;
					 head=temp;
					 break;
					 
					 case 2:
					 
					 Node temp1=head;
					 Node ptr=temp1.next;
					 while(ptr.next!=null)
					 {
						 temp1=ptr;
						 ptr=ptr.next;
					 }
					 temp1.next=null;
					 break;
					 
					 case 3:
					 
					 System.out.println("enter position of node to be deleted");
					 int p1=sc.nextInt();
					 Node temp2=head;
					 Node ptr1=temp2.next;
					 for(int i=0; i<(p1-2); i++)
					 {
						 temp2=ptr1;
						 ptr1=ptr1.next;
					 }
					 temp2.next=ptr1.next;
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
		single_creation l1= new single_creation();
		l1.creation();
		
		l1.delete();
		l1.traverser();
	}
}