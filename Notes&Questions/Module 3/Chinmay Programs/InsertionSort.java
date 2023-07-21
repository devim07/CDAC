import java.util.Scanner;

class InsertionSort
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
		
		for(i=1; i<=n-1; i++)  // in this sort we will sort from 1st index not 0th index
		{
			temp=a[i];
			j=i-1;
			while(temp<a[j] && j>-1)
			{
				a[j+1]=a[j];
				j=j-1; // after comparing with previous value to go for next previous value we have to go to the previous index and coz of this line we achieved that
			}
			a[j+1]=temp;
		}
		for(i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
	}
}