package com.xworkz.solution;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TaskTester {

	public static void main(String[] args) {

		Collection<Long> doorNos = new ArrayList();

				doorNos.add(115L);
				doorNos.add(420l);
				doorNos.add(840l);
				doorNos.add(420l);
				doorNos.add(100l);
				doorNos.add(31l);
				doorNos.add(420l);
				doorNos.add(31l);
				doorNos.add(729l);
				doorNos.add(370l);
				doorNos.add(370l);
				
				
				// convert to []
				// iterator

				Collection<Long> tempDoorNos = new ArrayList<Long>();
			//tempDoorNos.addAll(doorNos);
				tempDoorNos.add(729l);
				tempDoorNos.add(370l);
				tempDoorNos.add(370l);
				Collection<Long> doorNos2 = new ArrayList();
				doorNos2.add(370l);
				
				tempDoorNos.removeAll(doorNos2);
				
			System.out.println(tempDoorNos.size());
			}

		}
		
		

	