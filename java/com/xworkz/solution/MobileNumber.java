package com.xworkz.solution;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class MobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
               Collection<Long> mobileNumbers = new HashSet<Long>();

				mobileNumbers.add(9945781625L);
//				mobileNumbers.add(8547896214L);
//				mobileNumbers.add(7546982161L);
//				mobileNumbers.add(9856478562L);
//				mobileNumbers.add(9988546829L);
//				mobileNumbers.add(9946257153L);
//				mobileNumbers.add(9945645214L);
				mobileNumbers.add(9945768791L);
				mobileNumbers.add(9945798246L);
				mobileNumbers.add(9945754698L);
				mobileNumbers.add(9945781625L);

				Collection<Long> tempmobileNumbers = new ArrayList<Long>();
				Iterator<Long> iterator = mobileNumbers.iterator();
				System.out.println("size of " + mobileNumbers.size()); 

				while (iterator.hasNext()) 
				{
					long phnum =  iterator.next();
					System.out.println("mobile number :"+  phnum);
					
					
					if(tempmobileNumbers.contains(phnum)) {
						System.out.println("duplicate mobile num"+ phnum);
					}
					else {
						System.out.println("added temp"+phnum);
						tempmobileNumbers.add(phnum);
					}
					mobileNumbers.clear();
					
					Iterator<Long > tempItetator =tempmobileNumbers.iterator();
					while(tempItetator.hasNext()) {
						mobileNumbers.add(tempItetator.next());
						
					}
					System.out.println("size of phone number"+ mobileNumbers.size());
				
					


//					if (a % 10 > 3) {
//						System.out.println(a);
//					}
					}

			}

	private static String mobileNumbers() {
		// TODO Auto-generated method stub
		return null;
	}
		}
