package com.string.first;

public class MissingNumber {
	
	public static void main(String[] args)
	{

	int[] array = {4,2,5,3,1};

	int n = array.length+1;

	 int sum = n*(n+1)/2;
	 int actual =0;

	for(int i=0 ; i < array.length ; i++)
	{
	  actual = actual+array[i];
	}

	int diff = sum-actual;

	System.out.println(diff);

	}


}
