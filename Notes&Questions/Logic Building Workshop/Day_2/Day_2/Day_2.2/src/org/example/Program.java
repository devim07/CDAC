package org.example;

import java.util.Arrays;

class Complex{
	private int real;
	private int imag;
	public Complex() {
		// TODO Auto-generated constructor stub
	}
	public Complex(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	@Override
	public String toString() {
		return "Complex [real=" + real + ", imag=" + imag + "]";
	}
}
public class Program {
	public static void main(String[] args) {
		//Array of instances
		Complex[] arr = new Complex[ 3 ];	//Array of references
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ] = new Complex();
		
		
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ].toString());
	}
	public static void main5(String[] args) {
		Complex[] arr = new Complex[ 3 ];	//Array of references
		arr[ 0 ] = new Complex(10,20);
		arr[ 1 ] = new Complex(30,40);
		arr[ 2 ] = new Complex(50,60);
		
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ].toString());
	}
	public static void main4(String[] args) {
		Complex[] arr = new Complex[ 3 ];	//Array of references
		arr[ 0 ] = new Complex();
		arr[ 1 ] = new Complex();
		arr[ 2 ] = new Complex();
		
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ].toString());
	}
	public static void main3(String[] args) {
		//null is literal in Java;
		//Complex c1 = null;
		//c1 => null reference variable / c1 is null object
		Complex[] arr = new Complex[ 3 ];	//Array of references
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ].toString());
	}
	public static void main2(String[] args) {
		Complex[] arr = new Complex[ 3 ];	//Array of references
		System.out.println(Arrays.toString(arr));	//[null, null, null]
	}
	public static void main1(String[] args) {
		int n1,n2,n3;
		//int[] arr = new int[ 3 ];
		
		Complex c1;
		Complex c2;
		Complex c3;
		//Complex[] arr = new Complex[ 3 ];	//Array of reference
	}
}
