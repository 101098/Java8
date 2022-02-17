package com.string.first;

public class ReverseofSenetence1 {

		public static void main(String[] args) {

		String str ="hello to java world";

		String SplitArray [] = str.split(" ");

		for(int i=SplitArray.length-1; i>=0; i--) {
		System.out.print(SplitArray[i] + " ");
		}
		}



		}
