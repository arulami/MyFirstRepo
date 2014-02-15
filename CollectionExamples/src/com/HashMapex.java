package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hp = new HashMap<Integer, String>();
		hp.put(1, "S");
		hp.put(3, "A");
		hp.put(null, "H");
		
		Iterator hj = hp.entrySet().iterator();
		
		while(hj.hasNext()){
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) hj.next();
			System.out.println(entry.getKey());
		//	System.out.println(entry.getValue());
			
		}
		//System.out.println(hp.get(null));

	}

}
