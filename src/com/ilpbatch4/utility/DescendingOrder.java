package com.ilpbatch4.utility;

public class DescendingOrder {

	public static void main(String[] args) {
		int n1 = 40;
		int n2 = 30;
		int n3 = 10;
		descendingOrder(n1, n2, n3);
	}

	private static void descendingOrder(int n1, int n2, int n3) {
		int large = 0;
		int middle = 0;
		int small = 0;
		if(n1>n2 && n1>n3) {
			large = n1;
			if(n2>n3) {
				middle = n2;
				small = n3;	
			}
			else {
				middle = n3;
				small = n2;
			}
		}
		if(n2>n1 && n2>n3) {
			large = n2;
			if(n1>n3) {
				middle = n1;
				small = n3;	
			}
			else {
				middle = n3;
				small = n1;
			}
		}
		if(n3>n1 && n3>n2) {
			large = n3;
			if(n1>n2) {
				middle = n1;
				small = n2;
			}
			else {
				middle = n2;
				small = n1;
			}
			}
		System.out.println("Descending Order");
		System.out.println(large);
		System.out.println(middle);
		System.out.println(small);
		System.out.println("Ascending Order");
		System.out.println(small);
		System.out.println(middle);
		System.out.println(large);
		
		}
	}
