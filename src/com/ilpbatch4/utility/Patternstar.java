package com.ilpbatch4.utility;

public class Patternstar {

	public static void main(String[] args) {
		int limit = 5;
		patternStar(limit);
	}

	private static void patternStar(int limit) {
		for (int i = 1; i <= limit; i++) {
			for (int j = 1; j <= limit; j++) {
				if (i == 1 || i == limit) {
					System.out.print("* ");
				} else if (j == (limit - i)) {
					System.out.println("*");
					break;
				}
				else {
					System.out.print("  ");
				}
			}
			if (i == 1) {
				System.out.println("");
			}
		}
	}
}
