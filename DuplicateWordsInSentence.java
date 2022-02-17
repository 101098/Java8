package com.string.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWordsInSentence {

	public static void main(String[] args) {
		
		String str = "I am java java am am";
		
		String[] str1 = str.split(" ");
		
		Map<String , Integer> map = new HashMap<>();
		
		List<Integer> list = new ArrayList<>();
		
		for(String string : str1 )
		{
			map.put(string,map.containsKey(string)?map.get(string)+1:1);
		}
		
		for(Entry<String,Integer> entry : map.entrySet())
		{
			if(entry.getValue() >1)
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		
		}
		
		Set<String> s = map.keySet();
		Collection<Integer> s1 =map.values();
		System.out.println(s1);
		
        List<Integer> i= s1.stream().sorted().collect(Collectors.toList());
        
        System.out.println(i);
        
         
	}

}
