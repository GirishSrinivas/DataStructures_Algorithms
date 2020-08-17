package com.girish.testPrime;

import org.junit.Test;

import com.girish.primeTest.PrimeNumberCheck;

import org.junit.Assert;

public class TestPrime 
{
	// check if the entered number is prime...
	
	@Test
	public void isPrimeTest()
	{
		PrimeNumberCheck pnc = new PrimeNumberCheck();
		
		Assert.assertEquals(true, pnc.primeTest(11));
		
		
	}
}
