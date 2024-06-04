package com.ilpbatch4.utility;

public class PatternNumbers {

	public static void main(String[] args) {
		int rows = 5;
		pattern(rows);
	}
 
	private static void pattern(int rows) {
		int columns = 1;
		int start = 0;	
		int middle = (rows+1)/2;
		int space = rows/2;
		for(int i = 1; i<=rows; i++)
		{
			for(int j = 1;j<=space;j++)
			{
				System.out.print(" ");
			}
			if(i<middle)
			{
				start = i;
				space = space - 1;
			}
			else
			{
				start = rows + 1 - i;
				space = space + 1;
			}
			for(int j = 1;j<=columns;j++)
			{
				int mid = (columns+1)/2;
				System.out.print(start);
				if( j < mid)
				{
					start--;
				}
				else
				{
					start++;
				}
			}
			if(i<middle)
			{
				columns += 2;
			}
			else
			{
				columns -= 2;
			}
			System.out.println("");
		}
	}
 
}
