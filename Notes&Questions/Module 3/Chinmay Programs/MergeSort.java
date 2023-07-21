import java.util.*;
class Merge
{
	
	void merge1(int a[], int start, int mid, int end)
	{
		int l = mid - start + 1;
		int r = end - mid;
		int left_subarray[] = new int[l];
		int right_subarray[] = new int[r];
		
		for (int i=0; i<l; ++i)
			left_subarray[i]=a[start + 1];
		for (int j=0; j<r; ++j)
			right_subarray[j]=a[mid+1+j];
		
		int i=0, j=0;
		int k=start;
		while(i<l && j<r)
		{
			if (left_subarray[i] <= right_subarray[j])
			{
				a[k]= left_subarray[i];
				i++;
			}
			else
			{
				a[k]= right_subarray[j];
				j++;
			}
			k++;
		}
		
		while (i<l)
		{
			a[k]= left_subarray[i];
			i++;
			k++;
		}
		
	}
	
	
	void mergesort(int a[], int start, int end)
	{
		if (start < end)
		{
			int mid= (start + end)/2;
			mergesort(a, start, mid);
			mergesort(a, mid + 1, end);
			merge1(a, start, mid, end);
		}
	}
	
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
		
		Merge m1= new Merge();
		m1.mergesort(a,0,n-1);
		
		
		for(i=0; i<n; i++)
		{
			System.out.println(a[i] + " ");
		}
	}
}