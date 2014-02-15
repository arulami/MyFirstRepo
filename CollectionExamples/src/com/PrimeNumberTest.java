package com;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sd = PrimeNumberTest.isPrimeNumber(13);
		System.out.println(sd);
	}
	
	public static boolean isPrimeNumber(int number){
		boolean primeNumber =  false;
		if((number==1)||((number==2))||((number%2)==0)){
			return primeNumber;	
		}
		
		for(int i = 3;i<=number/i;i++){
			if(number%i==0){
				return false;
			}
			//i++;
		}
		return true;
	}

}
