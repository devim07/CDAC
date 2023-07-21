import java.util.*;

class Stack
{
 int top=-1;
 int n=10;
 int a[]=new int[n];
 Scanner sc= new Scanner(System.in);
 void push()
 {
  if(top==(n-1))
  {
   System.out.print("overflow");
  }
  else
   {
     System.out.print("enter data");
      int i=sc.nextInt();
     top=top+1;
     a[top]=i;
	 System.out.print("item inserted");
	 }
 }
	 
 void pop()
{ 
  if(top==-1)
  {
    System.out.print("Underflow");
  }
  else{
   top=top-1;
   System.out.print("item deleted");
  }
}  
  void display()
  {
   System.out.print("items are:");
   for(int j=top; j>=0; j--)
   {
    System.out.print(a[j]);
   }
  }
}
class stack_array 
{
   public static void main(String...args)
	{
		Scanner sc=new Scanner (System.in);
		Stack s= new Stack();
		
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
			
			 int l= sc.nextInt();
		}
		
		while(l==0);
			System.out.println("Exit Sucessfully");
	}
}

	  
  
	  
	  
	  
	  
	  
	  
	  
	  
/*	  class Stack
{
 int top=-1;
 int n=10;
 int a[]=new int[n];
 void push()
 {
  if(top==(n-1))
  {
   System.out.print("overflow");
  }
  else
   {
     System.out.print("enter data");
      int i=sc.nextInt();
     top=top+1;
     a[top]=i;
	 System.out.print("item inserted");
	 }
	 
 void pop();
{ 
  if(top==-1)
  {
    System.out.print("Underflow");
}
  else{
   top=top-1;
   System.out.print("item deleted");
}   
  void display()
  {
   System.out.print("items are:");
   for(int j=top; j>=0; j--)
   {
    System.out.print(a[j]);
	}
  }
  public class stack_array {
    public static void main(String args[])
	{
	int d;
	Scanner sc = new Scanner(System.in);
	 stack s=new stack();
	 int l;
	do 
	 {
	  System.out.println("press 1 to push");
	  System.out.println("press 2 to pop");
	  System.out.println("press 3 to display");
	  System.out.println("enter your choice");
	  d=sc.nextInt();
	   switch(d)
	   {
	    case 1:
		{
		 s.push(sc);
		 break;
		 }
		case 2:
        {
       s.pop();
       break;
      case 3:
     {
     s.display();
     break;
      }
	  }
	  System.out.println("Enter 0 to go back to the main menu");
	  System.out.println("Enter any key to exit");
	  l=sc.nextInt();
	  }while(l==0);
	  System.out.print("Exit successfully");
	  }
	  }*/