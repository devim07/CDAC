package org.example;

import java.util.Arrays;

public class Program {
	public static void main8(String[] args) {
		int[] arr = new int[ 3 ];
		//System.out.println(arr.toString());	//[I@aec6354
		System.out.println( Arrays.toString(arr) );	//[0, 0, 0]
	}
	public static void main7(String[] args) {
		int[] collection = new int[ 3 ];
		for( int element : collection ) {
			System.out.println(element);
		}
	}
	public static void main6(String[] args) {
		int[] arr = new int[ 3 ];
		for( int index = 0; index < 3; ++ index )
			System.out.println( arr[ index ] );
	}
	public static void main5(String[] args) {
		int[] arr = new int[ 3 ];
		System.out.println( arr[ 0 ] );
		System.out.println( arr[ 1 ] );
		System.out.println( arr[ 2 ] );
	}
	public static void main4(String[] args) {
		int[] arr = new int[ -3 ]; //NegativeArraySizeException	
	}
	public static void main3(String[] args) {
		int[] arr = new int[ 3 ];
	}
	public static void main2(String[] args) {
		int[ ] arr = null;
		arr = new int[ 3 ];
	}
	public static void main1(String[] args) {
		//new int[ 3 ];	//Anonymous Array Instance
		
		//Reference Declaration
		int arr1[ ];	//OK
		int[ ] arr2;	//OK: Recommended
		//int[ arr3 ]	//Not OK
	}
}
