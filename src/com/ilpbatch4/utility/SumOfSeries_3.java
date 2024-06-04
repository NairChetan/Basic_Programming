package com.ilpbatch4.utility;
import java.lang.Math;
public class SumOfSeries_3 {

	public static void main(String[] args) {
		int limit = 4;
		sumOfSeries(limit);
	}

	private static void sumOfSeries(int limit) {
		int temp = 1;
		int power = 1;
		int sum = 0;
		int diff = 0;
		int total = 0;
		for(int i = 1; i <= limit; i++) {
			if(i%2==0 && i!=1) {
				diff += (int)Math.pow(temp,power);
				temp += 2;
				power += 1;
				}
			else {
				sum += (int)Math.pow(temp,power);
				temp += 2;
				power += 1;
			}
		}
		total = sum - diff;
		System.out.println("Sum of the series = "+total);
	}
}
