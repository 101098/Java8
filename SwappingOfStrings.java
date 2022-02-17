package com.string.first;

public class SwappingOfStrings {
	
	public static void main(String [] args)
	{
		String s1 ="sumantha";
		String s2 ="Reddy";
		
	s1= s1 + s2;
	
	System.out.println(s1);
	
		 s2 = s1.substring(0, s1.length() - s2.length());
		 
		 System.out.println(s2 +"length"+" "+s2.length());
		 System.out.println(s1+"lenght"+" "+s1.length());
		 s1= s1.substring(s2.length()); // it returns from 8 which is length of s2 now
		
		
		System.out.println("s1 ="+ s1);
		System.out.println("s2 =" + s2);
				
	}

}
