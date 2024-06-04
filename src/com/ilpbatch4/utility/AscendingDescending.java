package com.ilpbatch4.utility;

public class AscendingDescending {
	public static void main(String[] args) {
		int array[] = { 12, 10, 14, 1 };
		ascenddescend(array);
	}

	private static void ascenddescend(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp = 0;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
		}
	}

}
