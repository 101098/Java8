package com.string.first;

public class Reversechar {

	public static void main(String[] args) {
		
		String str = "sumantha";

		String rev = "";

		for(int i = str.length()-1 ; i>=0 ; i--)
		{
		   rev = rev+str.charAt(i);
		}
        System.out.println(rev);
	}

}
