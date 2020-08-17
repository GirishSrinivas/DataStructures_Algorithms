package com.girish.testPrime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.girish.primeTest.PrimeNumberCheck;

@RunWith(Parameterized.class)
public class ParameterizedPrimeTest
{
	private PrimeNumberCheck p;
	private int input;
	private boolean expected;
	
	@Before
	public void init()
	{
		p = new PrimeNumberCheck();
	}
	
	@Parameters
	public static List<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{2, true},
			//{2, new Object[] {1,2,3,4}},
			{4, false},
			{1, false},
			{5, true}
		});
	}
	
	public ParameterizedPrimeTest(int input, boolean expected) 
	{
		this.input = input;
		this.expected = expected;
	}
	
	@Test
	public void primeTest() 
	{
		assertEquals(expected, p.primeTest(input));
	}

}
