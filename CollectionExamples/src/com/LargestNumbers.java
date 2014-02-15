package com;

public class LargestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sd = new int[] { 5, 2, 3, 4, 5,6 };
		int s = LargestNumbers.findLargest(sd);
		System.out.println(s);
	}

	public static int findLargest(int[] numbers) {

		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i];
			}

		}

		return largest;

	}

}
