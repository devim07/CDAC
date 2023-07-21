package org.example;

import java.util.Arrays;

public class Program {
	private static void print(int[] arr) {
//		for( int index = 0; index < arr.length; ++ index ){
//			System.out.println(arr[ index ] );
//		}
		System.out.println( Arrays.toString( arr ));
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr1 = new int[ ] { 10, 20, 30 };
		Program.print( arr1 );
		
		int[] arr2 = new int[ ] { 10, 20 };
		Program.print( arr2 );
		
		int[] arr3 = new int[ ] { 10, 20, 30, 40, 50 };
		Program.print( arr3 );
	}

	public static void main2(String[] args) {
		double[] arr = new double[  ] { 10.1, 20.2, 30.3 };	//OK
		
		//double element = arr[ -1 ]; //ArrayIndexOutOfBoundsException
		
		//double element = arr[ 3 ]; //ArrayIndexOutOfBoundsException
		
		double element = arr[ 1 ]; //20.2
		
		System.out.println(element);
	}
	public static void main1(String[] args) {
		//double[] arr = new double[ 3 ] { 10.1, 20.2, 30.3 };	//Not OK
		
		//double[] arr = new double[  ];	//NOT OK
		
		//double[] arr = new double[ 3 ];	//OK
		
		//double[] arr = new double[  ] { 10.1, 20.2, 30.3 };	//OK
		
		double[] arr =  { 10.1, 20.2, 30.3 };	//OK
		System.out.println( Arrays.toString(arr));
//		for( double element : arr )
//			System.out.println(element);
	}
}
