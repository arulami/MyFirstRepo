package com;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap linkedHash = new LinkedHashMap();
		
		linkedHash.put(1, "wert");
		linkedHash.put(2, "4");
		
		System.out.println(linkedHash.containsValue("4"));
	}

}
