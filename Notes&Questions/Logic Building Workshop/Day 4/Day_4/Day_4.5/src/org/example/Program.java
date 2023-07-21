package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(50);
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		//Collections.sort( list );
		list.sort(null);
		System.out.println(list);
		
	}
	public static void main5(String[] args) {
		Collection<Integer> collection = new ArrayList<>();
		collection.add(20);
		collection.add(40);
		collection.add(60);
		
		List<Integer> list = new ArrayList<>( );	
		list.add(10);	//list.add( Integer.valueOf(10));
		list.add(20);	//list.add( Integer.valueOf(20));
		list.add(30);	//list.add( Integer.valueOf(30));
		list.add(40);	//list.add( Integer.valueOf(40));
		list.add(50);	//list.add( Integer.valueOf(50));
		list.add(60);	//list.add( Integer.valueOf(50));
		list.add(70);	//list.add( Integer.valueOf(50));
		
		if( list.containsAll(collection)) {
			//list.removeAll(collection);
			list.retainAll(collection);
			System.out.println(list);
		}else
			System.out.println("Elements not found.");
	}
	public static void main4(String[] args) {
		List<Integer> list = new ArrayList<>( );	
		list.add(10);	//list.add( Integer.valueOf(10));
		list.add(20);	//list.add( Integer.valueOf(20));
		list.add(30);	//list.add( Integer.valueOf(30));
		list.add(40);	//list.add( Integer.valueOf(40));
		list.add(50);	//list.add( Integer.valueOf(50));
		list.add(60);	//list.add( Integer.valueOf(50));
		list.add(70);	//list.add( Integer.valueOf(50));
		
		Integer key = new Integer(50);
		if( list.contains(key)) {
			boolean removedStatus = list.remove(key);
			
			System.out.println("Removed Status is: "+removedStatus);
			
			System.out.println(list);
		}else
			System.out.println(key+" not found");
	}
	public static void main3(String[] args) {
		List<Integer> list = new ArrayList<>( );	
		list.add(10);	//list.add( Integer.valueOf(10));
		list.add(20);	//list.add( Integer.valueOf(20));
		list.add(30);	//list.add( Integer.valueOf(30));
		list.add(40);	//list.add( Integer.valueOf(40));
		list.add(50);	//list.add( Integer.valueOf(50));
		list.add(60);	//list.add( Integer.valueOf(50));
		list.add(70);	//list.add( Integer.valueOf(50));
		
		Integer key = new Integer(50);
		if( list.contains(key)) {
			int index = list.indexOf(key);
			Integer element = list.remove(index);
			System.out.println("Removed element is: "+element);
			System.out.println(list);
		}else
			System.out.println(key+" not found");
	}
	public static void main2(String[] args) {
		List<Integer> collection = new ArrayList<>( );
		collection.add(60);
		collection.add(70);
		collection.add(80);
		
		List<Integer> list = new ArrayList<>( collection );
		if( !list.isEmpty() )
			list.forEach(System.out::println);
		else
			System.out.println("List is empty.");
	}	
	public static void main1(String[] args) {
		List<Integer> collection = new ArrayList<>( );
		collection.add(60);
		collection.add(70);
		collection.add(80);
		
		List<Integer> list = new ArrayList<>( );	
		list.add(10);	//list.add( Integer.valueOf(10));
		list.add(20);	//list.add( Integer.valueOf(20));
		list.add(30);	//list.add( Integer.valueOf(30));
		list.add(40);	//list.add( Integer.valueOf(40));
		list.add(50);	//list.add( Integer.valueOf(50));
		//list.addAll(collection);
		list.addAll(2,collection);
		
		list.forEach(System.out::println);
	}	
}
