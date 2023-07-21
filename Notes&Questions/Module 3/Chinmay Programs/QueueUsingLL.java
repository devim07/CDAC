import java.util.*;

class queue
{
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
	Node f=null;
	Node r=null;
	//Scanner sc= new Scanner(System.in);
	void enqueue(Scanner sc)
	{
		System.out.println("Enter data");
		int data=sc.nextInt();
		Node new_node=new Node(data);
		if(f==null)
		{
			f=new_node;
			r=new_node;
		}
		else
		{
			r.next=new_node;
			r=new_node;
		}
	}
	void dequeue()
	{
		if(f==null)
		{
			System.out.println("underflow");
		}
		else
		{
			f=f.next;
		}
	}
	
	void display()
	{
		Node temp=f;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
}



 class queue_ll
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner (System.in);
		queue s= new queue();
		int l;
		
		do
		{
			System.out.println("Press 1 to enqueue");
			System.out.println("Press 2 to dequeue");
			System.out.println("Press 3 to display");
			System.out.println("Enter your choice");
			int d=sc.nextInt();
			
			switch(d)
			{
				case 1:
				{
					s.enqueue(sc);
					break;
				}
				case 2:
				{
					s.dequeue();
					break;
				}
				case 3:
				{
					s.display();
					break;
				}
			}
			System.out.println("Enter 0 to go back to main menu");
			System.out.println("Enter Any Key To Exit");
			
			//int l= sc.nextInt();  // it gets error coz now its local variable and it doesnt go to while() coz its out of scope so we have to 1st declared at line no 54 to make it global
			l=sc.nextInt();
		}
		
		while(l==0);   // coz of ; after while the control goes to again 'do' loop 
			System.out.println("Exit Sucessfully");
	}
}