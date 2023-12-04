package com.set;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// demonstrates the student using the treeset
public class student_tree_set {

	public static void main(String[] args) {

		TreeSet<String> setOfUniquestudName = new TreeSet<String>();
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		TreeSet<Double> amounts = new TreeSet<Double>();
		
		// add values :: sorted set arranged values in asc order
		setOfUniquestudName.add("Rolex");
		setOfUniquestudName.add("Leo");
		setOfUniquestudName.add("Vikram");
		setOfUniquestudName.add("Anbu");
		setOfUniquestudName.add("Adaikalam");
		setOfUniquestudName.add("Dhilli");

		// Ascending ordered set
		System.out.println(setOfUniquestudName);

		System.out.println("---------------");
		// Descending ordered set
		System.out.println(setOfUniquestudName.descendingSet());
		
		System.out.println("---------------");
		// set iteration with iterator
		Iterator<String> itr = setOfUniquestudName.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------");
		// reverse order iteration with iterator
		Iterator<String> itr2 = setOfUniquestudName.descendingIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("---------------");
		// reverse set iteration with for each
		for (String name : setOfUniquestudName.descendingSet()) {
			System.out.println("The Name :: " + name);
		}
		
		System.out.println("---------------");
		// normal set iteration with for each
		for (String name : setOfUniquestudName) {
			System.out.println("The Name :: " + name);
		}

	}
}