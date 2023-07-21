package org.example;

import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class Program {
	private static void acceptRecord(int[] number) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number	:	");
		number[ 0 ] = sc.nextInt();
	}
	private static void printRecord(int[] number) {
		System.out.println("Number	:	"+number[ 0 ]);
	}
	public static void main1(String[] args) {
		int[] number = new int[ 1 ];	
		Program.acceptRecord( number );
		Program.printRecord( number );
	}
	public static void main2(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30 };
		System.out.println( ArrayUtils.toString(arr));	//{10,20,30}
	}
	public static void main(String[] args) {
		int[] arr = null;
		if( ArrayUtils.isNotEmpty(arr)) {
			String[] str = ArrayUtils.toStringArray( ArrayUtils.toObject(arr));
			System.out.println(ArrayUtils.toString(str));
		}
		else
			System.out.println("Array is empty.");
	}
}
