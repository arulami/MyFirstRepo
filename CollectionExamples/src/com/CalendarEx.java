package com;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarEx {

	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.MONTH, 1);
		
		
		Date d = cal.getTime();
		
		System.out.println(d);
		
		Locale locIT = new Locale("it", "IT");
		
		
		DateFormat dfa = DateFormat.getDateInstance(DateFormat.FULL,locIT);
		System.out.println(dfa.format(d));
		
		

	}

}
