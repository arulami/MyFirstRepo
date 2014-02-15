package com;

import java.util.TreeSet;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLargestNumber.getLargestNumbers(new int[] {2,4,5});
	}
	
	public static int getLargestNumbers(int[] s){
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for(int i = 0; i<=s.length-1;i++){
			ts.add(s[i]);
		}
		
		System.out.println(ts);
		System.out.println(ts.last());
		System.out.println(ts.remove(ts.last()));	
		System.out.println(ts.last());
		return 0;
		
	}

}
