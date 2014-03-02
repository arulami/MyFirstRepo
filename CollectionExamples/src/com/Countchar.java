package com;

public class Countchar {

	public static void main(String[] args) {

		String check = "AAABBBBBBGHHTTRRPP";

		//convert to charArray
		char[] ch = check.toCharArray();
		//int i =0;
		int count=0;
		for(int i = 0; i<check.length();i++){
			char c1=check.charAt(i);

			for(char c:ch){
				
				if(c==c1){
					//count
					System.out.println(c);
					count++;
				}
			}
			
		//	count = count;
			System.out.println(check.charAt(i)+ " " + count);

		}



	}

}
