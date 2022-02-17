package com.string.first;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWOIterator {

	public static void main(String[] args)
    {
        List <Integer> people = new ArrayList <>();
        people.add(1);
        people.add(2);
        people.add(3);
        
        System.out.println(people);

        System.out.println(people.get(0));
        System.out.println(people.get(1));
        System.out.println(people.get(2));
    }
}
