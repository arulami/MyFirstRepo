package com;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tp = new TreeMap();
		
		tp.put(1, 1);
		tp.put(6, 1);
		tp.put(17, 1);
		tp.put(15, 1);
		
		System.out.println(tp.pollLastEntry());
		
		
	}

}
