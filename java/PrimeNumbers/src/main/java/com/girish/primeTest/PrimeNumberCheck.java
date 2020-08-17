package com.girish.primeTest;

public class PrimeNumberCheck 
{
	public boolean primeTest(int p)
	{
		boolean isprime = true;
		
		if(p <= 1 && p >= -1)
		{
			isprime = false;
		}
		else
		{
			for(int i = 2; i <= p / 2; i++)
			{
				if(p % i == 0)
				{
					isprime = false;
					break;
				}
			}
		}
		
		return isprime;
	}
}
