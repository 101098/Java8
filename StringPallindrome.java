package com.string.first;

import java.util.HashSet;
import java.util.Set;

public class StringPallindrome {
	public static void main(String [] args)
	{
Set<String> testSet = new HashSet<String>();

testSet.add("hello");
testSet.add("hi");
testSet.add("hello");
System.out.println(testSet);
//boolean first = testSet.add("hello");
//System.out.println(first); // Prints "true"
//boolean second = testSet.add("hello");
//System.out.println(second);

}
}