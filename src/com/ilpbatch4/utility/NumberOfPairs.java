package com.ilpbatch4.utility;

import java.util.Random;
import java.util.stream.IntStream;

public class NumberOfPairs {

	public static void main(String[] args) {
		int N = 10;
		int K = 30;
		findPairs(N, K);
	}

	private static void findPairs(int N, int K) {
		int counter = 0;
		int[] randomArray = IntStream.generate(() -> new Random().nextInt(K)).limit(N).toArray();
		for (int i = 0; i < randomArray.length; i++) {
			System.out.println(randomArray[i]);
		}
		for(int i = 0;i < randomArray.length;i++) {
			for(int j = 0; j <randomArray.length; j++) {
				if(randomArray[i]+randomArray[j] == K) {
					counter++;
				}
			}
		}
		System.out.println("Number of pairs of element in array whose sum is "+K+" ="+(counter/2));
}
}
