package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(50);
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(30);
		
		List<Integer> linkedList = new LinkedList<>( list );
		System.out.println(linkedList );	
	}
}
