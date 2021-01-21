package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		//framework 
		// fixed size
		// no methods to manipulate
		// no alogo
		/// not dynamic
		String cadbury = "eclairs";
		String nestle = "Kitkat";
		String campco = "MilkyBar";
		String parle = "Kiss me";
		String amul = "Dark Chocolate";
		// element
		Collection chocolates = new ArrayList();
		boolean added = false;
		added = chocolates.add(campco);
		System.out.println(added);
		added = chocolates.add(nestle);
		System.out.println(added);
		added = chocolates.add(cadbury);
		System.out.println(added);
		added = chocolates.add(amul);
		System.out.println(added);
		added = chocolates.add(parle);
		System.out.println(added);

		int totalElements = chocolates.size();
		System.out.println("totalElements: " + totalElements);

		String hersheys = "hersheys kiss";
		boolean removed = chocolates.remove(null);
		System.out.println("Removed : " + removed);
		String ref = null;
		if (ref != null) {
			System.out.println(ref.toString());
			// return true;
			}
		added = chocolates.add(null);
		System.out.println("added null:" + added);
		added = chocolates.add(null);
		System.out.println("added null:" + added);
		// else return false;
		totalElements = chocolates.size();
		System.out.println("totalElements: " + totalElements);

		// chocolates.clear();
		chocolates.add(parle);
		totalElements = chocolates.size();
		System.out.println("totalElements after adding duplicate: " + totalElements);
		chocolates.remove(parle);
		chocolates.remove(parle);
		totalElements = chocolates.size();
		System.out.println("totalElements: " + totalElements);

		// List chocolateList = new ArrayList();

		System.out.println("looping chocolates");

		Object[] convertedChocolates = chocolates.toArray();
		for (int i = 0; i < convertedChocolates.length; i++) {
			System.out.println(convertedChocolates[i]);
		}

		System.out.println("looping using iterator********");

		Iterator iterator = chocolates.iterator();
		//hasNext(),next();remove();
		while (iterator.hasNext()) {
			System.out.println("element present");
			Object str = iterator.next();
			System.out.println(str);
			
		
	        ArrayList<Integer>  list = new ArrayList<Integer>( 
	                Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)); 
	        System.out.println("ArrayList with duplicates: " + list); 
	  
	      
	        ArrayList<Integer> newList = removeDuplicates(list); 
	  
	   
	        System.out.println("ArrayList with duplicates removed: "  + newList); 
	    } 
	}

	private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> newList) {
		// TODO Auto-generated method stub
		return newList;
	} 
			
}