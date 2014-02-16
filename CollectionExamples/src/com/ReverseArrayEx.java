package com;

public class ReverseArrayEx {

	public static void main(String[] args) {

		String g = "POUP";

		///convert into array

		char[] cha = g.toCharArray();

		int d = 0;

		for(int s = cha.length-1; s >= 0; s--){

			//System.out.println(cha[s]);

			//check for palandrum
			if(cha[s]==cha[d]){

				System.out.println(cha[s]);
				System.out.println(cha[d]);
				System.out.println("its a pal");
				
			}else{

				System.out.println("not pal");
				break;
			}
			
			d++;

		}
	}
}
