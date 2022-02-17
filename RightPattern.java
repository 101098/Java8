package com.string.first;

public class RightPattern {

	public static void main(String[] args) {
		
		int i;
		int j;
		int row = 6;
		
		for(i=0 ; i<row ; i++)
		{
			for(j=row-i ; j>1 ;j--)
			{
				System.out.println("");
			}
			
			for(j=0 ; j<=i ;j++)
			{
			
			System.out.println("*");
			
			}
		}

	}

}
