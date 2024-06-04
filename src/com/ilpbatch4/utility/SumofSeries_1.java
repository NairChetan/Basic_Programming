package com.ilpbatch4.utility;

public class SumofSeries_1 {

	public static void main(String[] args) {
		int limit = 5;
		sumOfSeries(limit);
	}

	private static void sumOfSeries(int limit) {
		int sum = 0;
		int diff = 0;
		int temp = 1;
		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0 && i != 1) {
				diff += temp;
				temp += 2;
			} else {
				sum += temp;
				temp += 2;
			}

		}
		int total = sum - diff;
		System.out.println("Sum of Series = " + total);

	}

}
