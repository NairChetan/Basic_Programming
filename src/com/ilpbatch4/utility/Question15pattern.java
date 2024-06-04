package com.ilpbatch4.utility;

public class Question15pattern {

	public static void main(String[] args) {
		int n = 4;
		patternlast(n);
	}

	private static void patternlast(int n) {
		int charstart = n;
		int numstart = charstart + 1;
		int numend = numstart;
		int C = 65;
		int c = 97;
		int counter = 2;
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (2 * n); j++) {
				System.out.print(" ");
				if(j >= charstart && j < numstart) {
					if(counter%2 == 0) {
					System.out.print((char)C);
					C++;
					counter++;
					continue;
				}else {
					System.out.print((char)c);
					c++;
					counter++;
					continue;
				}}
				else if(j>=numstart && j <= numend) {
					System.out.print(temp);
					temp++;
					continue;
				}
				
			}
			System.out.println("");
			charstart--;
			numend++;
			C = 65;
			c = 97;
			temp = 1;
			counter = 2;
		}
	}
}
