package com;

import java.util.TreeSet;

public class DuplicateArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"A","N", "M", "M"};

		TreeSet <String> ts = new TreeSet<String>();
		
		//start

		for(String s : str){

			if(!ts.add(s)){
				System.out.println(s);

			}
		}

	}

}
