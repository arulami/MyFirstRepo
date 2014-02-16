package com;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		//declare an Array
		
		int[] number = {1,5,7,8,0,34,23,1};
		
		//System.out.println(number.toString());
		
for(int s : number){
			
			System.out.println(s);
			
			
		}
		
		Arrays.sort(number);
		
		//System.out.println(number.toString());
		
		for(int s : number){
			
			System.out.println(s);
			
			
		}
		}
		
	}


