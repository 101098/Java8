package com.string.first;

public class ReverseofwordsinSentence {

	public static void main(String[] args)
	{
		String str = "sumantha is a good girl";
		
		String strsplit[] = str.split(" ");
		
		//String rev ="";
		String org = "";
		
		for(String s : strsplit)
		{
			String rev ="";
			for(int i =s.length()-1; i>=0 ; i--)
			{
				rev = rev+s.charAt(i);
		    }
			
			org = org+rev+" ";
		}
		System.out.println(org);
	}
	
}
