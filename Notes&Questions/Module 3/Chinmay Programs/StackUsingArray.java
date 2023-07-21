import java.util.*;

class stack
{
	int top=-1;
	int n=10;
	int a[]=new int[n];
	Scanner sc= new Scanner(System.in);
	void push()
	{
		//System.out.println("Enter the Value");
		if(top== (n-1))
		{
			System.out.println("Overflow");
		}
		else
		{
			System.out.println("Enter the Value");
			int i=sc.nextInt();
			top=top+1;
			a[top]=i;
			System.out.println("item inserted");
		}
	}
	void pop()
	{
		if(top== -1)
		{
			System.out.println("Underflow");
		}
		else
		{
			System.out.println("Enter the Value");
			top=top-1;
			System.out.println("Item Inserted");
		}
	}
	
	void display()
	{
		System.out.println("Item Inserted");
		for(int j=top; j>=0; j--)
		{
			System.out.println(a[j]);
		}
	}
}



 class stack_array
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner (System.in);
		stack s= new stack();
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
					s.push();
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
		
		while(l==0);   // coz of ; after while the control goes to again 'do' loop 
			System.out.println("Exit Sucessfully");
	}
}