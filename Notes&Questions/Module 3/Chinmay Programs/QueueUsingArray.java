import java.util.*;

class queue
{
	int f=-1;
	int r=-1;
	int n=10;
	int q[]=new int[n];
	//Scanner sc= new Scanner(System.in);
	void enqueue(Scanner sc)
	{
		if(r==(n-1))
		{
			System.out.println("overflow condition");
		}
		else
		{
			System.out.println("enter data");
			int i=sc.nextInt();
			if(f==-1 && r==-1)
			{
				f=0;
				r=0;
				q[r]=i;
			}
			else
			{
				r=r+1;
				q[r]=i;
			}
		}
	}
	void dequeue()
	{
		if(f==-1 && r==-1)
		{
			System.out.println("underflow");
		}
		else
		{
			f=f+1;
		}
	}
	
	void display()
	{
		System.out.println("Item Are");
		for(int i=f; i<=r; i++)
		{
			System.out.println(q[i]);
		}
	}
}



 class queue_array
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