package com.ilpbatch4.utility;

public class SumOfSeries_2 {

	public static void main(String[] args) {
		int limit = 4;
		sumOfSeries(limit);
	}

	private static void sumOfSeries(int limit) {
		int sum = 0;
		int a = 0;
		int b = 1;
		int fib = 0;
		for(int i = 1;i<=limit;i++) {
			fib = a+b;
			a = b;
			b = fib;
			sum += fib*fib*fib;
		}
		System.out.println("Sum of the Series = "+sum);
	}

}
