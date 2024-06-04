package com.ilpbatch4.utility;

import java.util.Random;
import java.util.stream.IntStream;

public class FindOutMissingNumber {

	public static void main(String[] args) {
		int limit = 10;
		int[] randomIntegerArray = IntStream.generate(() -> new Random().nextInt(limit)).limit(limit).toArray();
		for (int i = 0; i < randomIntegerArray.length; i++) {
			System.out.println(randomIntegerArray[i]);
		}
		missingNumber(randomIntegerArray, limit);
	}

	private static void missingNumber(int[] randomIntegerArray, int limit) {
		int[] array = new int[limit];
		int[] miss_number = new int[limit];
		int mn = 0;
		for (int i = 0; i < randomIntegerArray.length; i++) {
			array[i] = i;
		}

		for (int i = 0; i < randomIntegerArray.length; i++) {
			for (int j = 0; j < randomIntegerArray.length; j++) {
				if (array[i] == randomIntegerArray[j]) {
					break;
				}
				if (j == (randomIntegerArray.length - 1)) {

					miss_number[mn] = array[i];
					mn++;
				}
			}
		}
		System.out.println("Missing Numbers");
		for (int i = 0; i < mn; i++) {

			System.out.println(miss_number[i]);

		}
	}
}