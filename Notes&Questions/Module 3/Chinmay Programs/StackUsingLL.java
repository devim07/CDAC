import java.util.*;

class stack1
{
	//Scanner sc=new Scanner(System.in);  // at line no 19 if we dont catch sc in push we required this line otherwise it is ok
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
	Node top=null;
	
	void push(Scanner sc)
	{
		System.out.println("Enter data");
		int data=sc.nextInt();
		Node new_node=new Node(data);
		if(top==null)
		{
			top=new_node;
		}
		else
		{
			new_node.next=top;
			top=new_node;
		}
	}
	
	void pop()
	{
		if(top==null)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			//head=head.next;
			top=top.next;
		}
		
	}
	
	void display()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}



 class stack_array
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner (System.in);
		stack1 s= new stack1();
		int l;
		
		do
		{
			System.out.println("Press 1 to push");
			System.out.println("Press 2 to pop");
			System.out.println("Press 3 to display");
			System.out.println("Enter your choice");
			int d=sc.nextInt();
			
			switch(d)
			{
				case 1:
				{
					s.push(sc);  // we pass the ref var of Scanner to push() 
					break;
				}
				case 2:
				{
					s.pop();
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
		
		while(l==0);  // coz of ; after while the control goes to again 'do' loop
			System.out.println("Exit Sucessfully");
	}
}