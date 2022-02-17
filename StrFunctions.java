package com.string.first;

public class StrFunctions {

	public static void main(String[] args) {
		
		String s1 = "Sumantha"; // it doesnt have any object in heap memory  , no address
		String s2 = new String("Sumantha");// it creates object in heap memory , so it have address
		String s3 = new String("sumantha");
		String s4 = "Reddy";
		
		System.out.println(s1.compareTo(s2)); //compareTo method returns zero if strings are equal .
		System.out.println(s1.equals(s2)); // returns boolean value and compare the state or content.
		System.out.println(s1==s2);//returns boolean value and compare the addresses
		System.out.println(s1.charAt(4)); // index starts from 0
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.contains("an"));
		System.out.println(s1.concat(s4));
		System.out.println(s1+s4); // internally , it does new StringBuffer(s1).append(s4);
		String con = s1+s4;
		StringBuffer sb = new StringBuffer(s1).append(s4);
		System.out.println(sb);
		
		System.out.println(s1.endsWith("r"));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.contentEquals("Sumantha"));
		System.out.println(s1.indexOf("a")); 
		System.out.println(s1.lastIndexOf("a"));// last occurence of character
		System.out.println(con.intern()); // to fetch the string from string pool 
		System.out.println(s1.lastIndexOf("m", 1)); // returns the index of character if exists before the given index , else returns -1
		System.out.println(s1.replace("a", "s"));
		System.out.println(s1.trim());
		
		StringBuilder sb1 = new StringBuilder("sumantha");
		System.out.println(sb1.reverse()); // it is like changing the value , so string does not have direct reverse operation
	}

}
