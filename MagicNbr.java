package com.string.first;

public class MagicNbr {

	public static void main(String[] args) {
		
		int num = 163;
		
		int sumOfDigits = 0;
		
		while(num>0 || sumOfDigits >9)
		{
			if(num == 0)
			{
				num = sumOfDigits;
				sumOfDigits =0;
			}
			sumOfDigits = sumOfDigits+num%10;
			
			System.out.println(sumOfDigits);
			
			num = num/10;
			
			System.out.println(num);
		}
		
        if(sumOfDigits ==1)
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
	}

}
