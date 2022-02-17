package com.string.first;

import java.util.Arrays;

public class Anagram {
	
	public void check()
	{
	  String str1 = "Sumantha";
	  String str2 = "Reddy";

	 char[] ch1 = str1.toCharArray();
	 char[] ch2 = str2.toCharArray();

	  if(str1.length() == str2.length())
	{
	   Arrays.sort(ch1);
	   Arrays.sort(ch2);
	}

	if(Arrays.equals(ch1 , ch2))
	{
	 System.out.println("Anagram");
	}
	}

	public static void main(String[] args) {
		
		Anagram a = new Anagram();
		
		a.check();

	}

}
