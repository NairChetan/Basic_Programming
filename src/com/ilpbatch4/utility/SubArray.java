package com.ilpbatch4.utility;

public class SubArray {

	public static void main(String[] args) {
		int[] array = {1, 3, 12, 15, 10};
		int sum = 30;
		subArray(array, sum);
	}

	private static void subArray(int[] array, int sum) {
		int temp_sum = 0;
		for (int i = 0; i < array.length; i++) {
			temp_sum = array[i];
			for (int j = i+1; j < array.length; j++) {
				temp_sum += array[j];
				if (temp_sum == sum) {
					System.out.println("Indexes are " + i + " and " + j);
				} else if (temp_sum > sum) {
					break;
				}
			}
		}
	}
}