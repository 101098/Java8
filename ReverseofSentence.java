package com.string.first;

public class ReverseofSentence {
	
	public static void main(String[] args)
	{
		String str = "Sumantha is a good girl";
		
		String str1[] = str.split(" ");
		
		//System.out.println(str1);
		
		//String str2 ="";
		
		for(int i =str1.length-1 ; i>=0 ; i--)
		{
			//str2 = str2+str1[i];
			System.out.print(str1[i]+" ");
		}
		//System.out.println("Reverse of Sentence is"+" " +str2);
		
	}

}
