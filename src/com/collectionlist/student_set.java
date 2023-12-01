package com.collectionlist;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Employee data as set
 * 
 * @author prajwal
 */
public class student_set {

	public static void main(String[] args) {

		// create a set of students as linked hashset
		Set<student> studentSet = new LinkedHashSet<student>();

		// add student object
		studentSet.add(new student(1000, "Suresh", 45000));
		studentSet.add(new student(1001, "Jeeva", 400233));
		studentSet.add(new student(1002, "leo", 78000));
		studentSet.add(new student(1003, "Rolex", 56566));
		
		System.out.println(studentSet);
		
		System.out.println("-----------");
		Iterator<student> itr = studentSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------");
		for (student set : studentSet) {
			System.out.println(set.studId);
			System.out.println(set.studName);
			System.out.println(set.fees);
			System.out.println("------");
		}

	}
}

class student {

	public int studId;
	public String studName;
	public double fees;

	

	public student(int studId, String studName, double fees) {   // creating the constructor
		super();
		this.studId = studId;
		this.studName = studName;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "student(studId=" + this.studId + ", studName=" + this.studName + ", fees= Rs" + this.fees + ")";
	};
}