package com.collectionlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

/**
 * This class demonstrate Vector List collection
 * 
 * @author khanw
 */
public class stack_list {

	public static void main(String[] args) {

		// list of cities
		List<String> listOfstates = new Stack<String>(); // to store string collection
		List<Integer> listOfNumbers  = new Vector<Integer>(); // to store int collection
		List<Double> listOfPrice  = new Vector<Double>();     // to store double collection
		
		// add cities
		listOfstates.add("karnataka");
		listOfstates.add("maharashtra");
		listOfstates.add("kerala");
		listOfstates.add("gujarat");
		listOfstates.add("uttar pradesh");

		// print list
		System.out.println(listOfstates);

		// print index 3 value
		System.out.println("index 3 : " + listOfstates.get(3));

		System.out.println("-----------------");

		// iteration over list by iterator
		Iterator<String> itr = listOfstates.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------------");
		// for loop with counter
		for (int index = 0; index < listOfstates.size(); index++) {
			System.out.println("The index : " + index + " and value : " + listOfstates.get(index));
		}

		System.out.println("-----------------");
		// enhance for loop
		for (String city : listOfstates) {
			System.out.println("The state : " + city);
		}
		
	}
}