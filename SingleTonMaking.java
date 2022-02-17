
package com.string.first;

public class SingleTonMaking {
	
	private static SingleTonMaking singleTonMaking;
	
	private SingleTonMaking()
	{	
		
	}
	
	public static SingleTonMaking getInstance()
	{
		if(singleTonMaking == null)
		{
			 singleTonMaking = new SingleTonMaking();
		}
		
		return singleTonMaking;
	}

//     class A
//    {
	public static void main(String[] args)
	{
		SingleTonMaking s =singleTonMaking.getInstance();
		SingleTonMaking s1 = SingleTonMaking.getInstance();
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}
    }
