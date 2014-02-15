package com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListsEx {

	public static void main(String[] args) {
		
		
		getIntTest(60.0,8);
		// TODO Auto-generated method stub
		LinkedList<Integer> lint = new LinkedList<Integer>();
		
		lint.add(2);
		lint.add(32);
		lint.add(23);
		lint.add(21);
		lint.add(29);
		lint.add(26);
		
		
		System.out.println(lint.getLast());
		
		Iterator gh = lint.iterator();
		
		while(gh.hasNext()){
			System.out.println(gh.next());
		}
		
		
		
	}
	
	
	public static void getIntTest(double s, int g){
		System.out.println("pass");
	}

}
