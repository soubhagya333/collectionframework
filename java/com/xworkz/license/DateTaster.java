package com.xworkz.license;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTaster {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat format =new SimpleDateFormat("MM-DD-YYYY");
		String stringDate =format.format(date);
		System.out.println(stringDate);
		
		SimpleDateFormat format2 =new SimpleDateFormat("MM-DD-YYYY");
		Date date2 =format2.parse("16-10-1996");
		System.out.println(date2);
	}


	
}