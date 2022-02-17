package com.string.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate
{

public static void main(String[] args)
{

        String str ="sumantha";

        char[] c = str.toCharArray();
        
        Map<Character , Integer> map = new HashMap<>();

        for(char ch : c)
       {
         map.put(ch , map.containsKey(ch)?map.get(ch)+1:1);

        }
        for(Entry<Character , Integer> entry : map.entrySet())
                  {
              if(entry.getValue() >1)
         {
  System.out.println(entry.getKey()+"  "+entry.getValue());
}
}
}
}
