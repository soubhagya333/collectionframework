package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForEachTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> names= new ArrayList<String>();
       names.add("mad");
       names.add("kappi");
       names.add("jyoo");
       
//       for each
       //for(Type ref "collection)
		for(String name:names) {
		System.out.println(name);
		if(name.equals("mad")) {
//			names.remove(name);
		}
		
	}
		
//		iterator
		Iterator<String > iterator =names.iterator();
		while(iterator.hasNext()) {
			String name=iterator.next();
			
			if(name.equals("mad")) {
				iterator.remove();
			}
			}
		System.out.println(names);
		System.out.println("size after removing mad"+ "  "+names.size());
	}
}
