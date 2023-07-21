package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>( );	
		list.add(10);	//list.add( Integer.valueOf(10));
		list.add(20);	//list.add( Integer.valueOf(20));
		list.add(30);	//list.add( Integer.valueOf(30));
		list.add(40);	//list.add( Integer.valueOf(40));
		list.add(50);	//list.add( Integer.valueOf(50));
		
		System.out.println(list.toString());	//[10, 20, 30, 40, 50]
	}	
	public static void main6(String[] args) {
		List<Integer> list = new ArrayList<>( );	
		list.add(10);	//list.add( Integer.valueOf(10));
		list.add(20);	//list.add( Integer.valueOf(20));
		list.add(30);	//list.add( Integer.valueOf(30));
		list.add(40);	//list.add( Integer.valueOf(40));
		list.add(50);	//list.add( Integer.valueOf(50));
		
		Integer element = null;
		//ListIterator<Integer> itr = list.listIterator();
		//ListIterator<Integer> itr = list.listIterator(2);
		//ListIterator<Integer> itr = list.listIterator(4);
		ListIterator<Integer> itr = list.listIterator(list.size());
		
		while( itr.hasNext()) {
			element = itr.next();
			System.out.print(element+"	");
		}
		
		System.out.println();
		
		while( itr.hasPrevious()) {
			element = itr.previous();
			System.out.print(element+"	");
		}
	}
	public static void main5(String[] args) {
		List<Integer> list = new ArrayList<>( );	//Type inference
		list.add(10);	//list.add( Integer.valueOf(10));
		list.add(20);	//list.add( Integer.valueOf(20));
		list.add(30);	//list.add( Integer.valueOf(30));
		list.add(40);	//list.add( Integer.valueOf(40));
		list.add(50);	//list.add( Integer.valueOf(50));
		
		//void accept(T t)
		//Consumer<Integer> c =  element -> System.out.println(element);
		//list.forEach(c);
		
		//list.forEach( element -> System.out.println(element) );
		
		//Consumer<Integer> c =  System.out::println;
		//list.forEach(c);
		
		list.forEach(System.out::println);	
	}
	public static void main4(String[] args) {
		List<Integer> list = new ArrayList<>( );	//Type inference
		list.add(10);	//list.add( Integer.valueOf(10));
		list.add(20);	//list.add( Integer.valueOf(20));
		list.add(30);	//list.add( Integer.valueOf(30));
		list.add(40);	//list.add( Integer.valueOf(40));
		list.add(50);	//list.add( Integer.valueOf(50));
		
		/* Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		} */
		
		for( Integer element : list )
			System.out.println(element);
		
	}
	public static void main3(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30 };
		//int element1 = arr[ arr.length ];	//ArrayIndexOutOfBoundsException
		
		String str = "CDAC";
		//char ch = str.charAt(str.length());	//StringIndexOutOfBoundsException
		
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(30);
		//Integer element2 = list.get( list.size() );	//IndexOutOfBoundsException
	}
	public static void main2(String[] args) {
		List<Integer> list = new ArrayList<>( );	//Type inference
		list.add(10);	//list.add( Integer.valueOf(10));
		list.add(20);	//list.add( Integer.valueOf(20));
		list.add(40);	//list.add( Integer.valueOf(40));
		list.add(50);	//list.add( Integer.valueOf(50));
		list.add(2, 30);//list.add( 2, Integer.valueOf(30));
		
		System.out.println("Size	:	"+list.size());	//Size	:	5
		if( !list.isEmpty()) {
			for( int index = 0; index < list.size(); ++ index ) {
				Integer element = list.get(index);
				System.out.println(element);
			}
		}else
			System.out.println("list is empty.");
	}
	public static void main1(String[] args) {
		//public ArrayList()
		ArrayList<Integer> list1 = new ArrayList<>( );
		List<Integer> list2 = new ArrayList<>( );	//Upcasting
		Collection<Integer> list3 = new ArrayList<>( );	//Upcasting	
	}
}
