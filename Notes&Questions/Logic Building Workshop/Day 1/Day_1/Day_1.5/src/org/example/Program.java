package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	private static void acceptRecord(int[] arr) {
		if( arr != null ) {
			Scanner sc = new Scanner(System.in);
			for( int index = 0; index < arr.length; ++ index ) {
				System.out.print("Enter element	:	");
				arr[ index ] = sc.nextInt();
			}
			sc.close();
		}
	}
	private static void printRecord(int[] arr) {
		System.out.println( Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = new int[ 3 ];
		//int[] arr = null;
		Program.acceptRecord( arr );
		Program.printRecord( arr );
	}
}
