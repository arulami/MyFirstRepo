package com;

import java.util.TreeSet;

public class MyLogic {

	public static void main(String[] args) {
		
		MyLogic.secondlargest(new int[]{1,2,6,7,9,3});
	}
	
	public static int secondlargest(int[] numbers){
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for(int i :numbers){
			ts.add(i);
		}
		
		System.out.println(ts.last());
		System.out.println(ts.remove(ts.last()));
		System.out.println(ts.last());
		return 0;
		
	}

}
