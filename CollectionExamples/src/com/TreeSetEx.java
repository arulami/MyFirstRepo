package com;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(11);
		ts.add(19);
		ts.add(12);
		ts.add(16);
		ts.add(17);
		ts.add(18);
		ts.add(14);
		ts.add(15);
		
		System.out.println(ts.ceiling(13));
		
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollFirst());
		
		//System.out.println(ts.floor(13));
		
		System.out.println(ts.lower(14));
		
		System.out.println(ts.descendingSet());
		
		
		
		
	}

}
