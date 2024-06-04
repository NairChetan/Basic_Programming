package com.ilpbatch4.utility;

import java.util.Random;
import java.util.stream.IntStream;

public class SortArray {

	public static void main(String[] args) {
		int limit = 10;
		int[] randomIntegerArray = IntStream.generate(() -> new Random().nextInt(3)).limit(limit).toArray();
		int length = randomIntegerArray.length;
		for (int i = 0; i < randomIntegerArray.length; i++) {
			System.out.println(randomIntegerArray[i]);
		}
		sortArray(randomIntegerArray, limit);
	}

	private static void sortArray(int[] randomIntegerArray, int length) {
		int temp = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < (length - i - 1); j++) {
				if (randomIntegerArray[j] > randomIntegerArray[j + 1]) {
					temp = randomIntegerArray[j + 1];
					randomIntegerArray[j + 1] = randomIntegerArray[j];
					randomIntegerArray[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		for (int i = 0; i < length; i++) {
			System.out.println(randomIntegerArray[i]);
		}
	}
}
