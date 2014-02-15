package com;

public class Fcatorialtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fcatorialtest.factorial(3));
		
	}
	
	public static int factorial(int number){
		
		int result =1;
		for(int i = 1; i<=number;i++){
			result = result * i;
		}
		
		System.out.println(result);
		return result;
	}

}
