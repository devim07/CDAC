package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		list.forEach(System.out::println);
	}
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<>( );	
		list.add(10);	//list.add( Integer.valueOf(10));
		list.add(20);	//list.add( Integer.valueOf(20));
		list.add(30);	//list.add( Integer.valueOf(30));
		list.add(40);	//list.add( Integer.valueOf(40));
		list.add(50);	//list.add( Integer.valueOf(50));
		
		Object[] arr1 = list.toArray();
		System.out.println( Arrays.toString(arr1));
		
		Integer[] arr2 = new Integer[ list.size() ]; 
		list.toArray(arr2);	
		System.out.println( Arrays.toString(arr2));
	}	
}
