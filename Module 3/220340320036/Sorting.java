import java.util.*;

class Sorting{
	static void insertionSort(int arr[]){
		int i,key;
		int n=arr.length;
		int j, temp;
		for(i=1; i<n; i++){
			key=arr[i];
			for(j=i-1; (j>=0 && key<arr[j]); j--){
				arr[j+1]=arr[j];
				display(arr);
			}
			arr[j+1]=key;
		}
	}
	
	static void display(int arr[]){
		for(int each:arr)
			System.out.print(each+" ");
		System.out.println();
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		insertionSort(arr);
		display(arr);
	}
}