package com;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx {

	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.MONTH, 1);
		
		Date d = cal.getTime();
		
		System.out.println(d);
		
		DateFormat dfa = DateFormat.getDateInstance();
		System.out.println(dfa.format(d));
		
		

	}

}
