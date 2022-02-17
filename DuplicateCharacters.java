package com.string.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String str = "sumantha";
		
		char[] ch =str.toCharArray();
		
		System.out.println(ch);
		
		Map<Character , Integer> map = new HashMap<>();
		
		for(char c : ch)
		{
			//Map<Character , Integer> map = new HashMap<>();
			
			map.put(c, map.containsKey(c)?map.get(c)+1:1);
			
		}
		
//		Set<Entry<Character, Integer>> entry = map.entrySet();
//		
//		for(Entry<Character, Integer> e : entry)
//		{
//			if(e.getValue() > 1)
//			{
//				System.out.println(e.getKey()+" "+e.getValue());
//			}
//		}
		
        for(Entry<Character , Integer> entry : map.entrySet())
        {
        	if(entry.getValue() >1)
        	{
        		System.out.println(entry.getKey()+" "+entry.getValue());
        	}
        }
	}

}
