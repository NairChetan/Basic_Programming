package com.ilpbatch4.utility;

import java.util.Random;
import java.util.stream.IntStream;

public class FindOutDuplicateNumber {

	public static void main(String[] args) {
		int limit = 10;
		int[] randomIntegerArray = IntStream.generate(() -> new Random().nextInt(limit)).limit(limit).toArray();
		for (int i = 0; i < randomIntegerArray.length; i++) {
			System.out.println(randomIntegerArray[i]);
		}
		findDuplicate(randomIntegerArray, limit);
	}

	private static void findDuplicate(int[] randomIntegerArray, int limit) {
		int[] array = new int[limit];
		int[] duplicate_number = new int[limit];
		int dn = 0;
		int total_duplicate = 0;
		for (int i = 0; i < randomIntegerArray.length; i++) {
			array[i] = i;
		}
		for (int i = 0; i < randomIntegerArray.length; i++) {
			int counter = 0;
			for (int j = 0; j < randomIntegerArray.length; j++) {
				if (array[i] == randomIntegerArray[j]) {
					counter++;}
				if (counter > 1) {
					duplicate_number[dn] = array[i];
					total_duplicate++;
					dn++;
					break;
				}
			}
		}
		System.out.println("Numbers that appear more than once: "+total_duplicate);
		System.out.println("Duplicate numbers are: ");
		for(int i = 0; i < dn; i++) {
			System.out.println(duplicate_number[i]);
		}

	}

}
