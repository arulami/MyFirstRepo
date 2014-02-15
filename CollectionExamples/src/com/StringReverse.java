package com;

public class StringReverse {

	public static void main(String[] args) {
		
		String x = "Novell";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = x.length()-1; i>=0;i--){
			sb.append(x.charAt(i));
		}
		
		System.out.println(sb);
	}

}
