import java.util.Scanner;

class selectionSort
{
	public static void main(String...args)
	{
		int n,i,j,loc,a[],ptr,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("number of elements want to enter");
		n=sc.nextInt();
		a=new int[n];
		
		System.out.println("Enter Elements");
		
		for(i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("=============================");
		for(i=0; i<n-1; i++)
		{
			loc=i;
			for(j=i+1; j<n; j++)
			{
				if(a[j]<a[loc])
				{
					loc=j;
				}
			}
			temp=a[i];
			a[i]=a[loc];
			a[loc]=temp;
		}
		for(i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
	}
}