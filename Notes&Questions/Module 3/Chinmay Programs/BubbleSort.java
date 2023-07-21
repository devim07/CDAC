import java.util.Scanner;

class bubble
{
	public static void main(String...args)
	{
		int n,i,k,a[],ptr,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements do you want to enter");
		n=sc.nextInt();
		a= new int[n]; // this step would be also be written as 'int[]a=new int[n]' 
		
		System.out.println("Enter elements");
		
		for(i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0; i<n-1; i++)
		{
			for(k=0; k<n-i-1; k++)
			{
				if(a[k]>a[k+1])
				{
					temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
		for(i=0; i<n; i++)
		{
			System.out.println("Enter elements" +a[i]);
		}
	}
}