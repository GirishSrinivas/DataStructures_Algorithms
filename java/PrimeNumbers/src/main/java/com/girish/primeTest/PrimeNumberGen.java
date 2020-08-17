package com.girish.primeTest;

public class PrimeNumberGen 
{
	private int range1;
	private int range2;
	private int prime[];
	
	public PrimeNumberGen(int range)
	{
		prime = new int[Math.abs(range)];
		setRange1(range);
	}
	
	public PrimeNumberGen(int range1, int range2)
	{
		if(Math.abs(range1) >= Math.abs(range2))
		{
			prime = new int [Math.abs(range1) - Math.abs(range2)];
		}
		else
		{
			prime = new int [Math.abs(range2) - Math.abs(range1)];
		}
		
		setRange1(range1);
		setRange2(range2);
	}

	public int getRange1() {
		return range1;
	}

	public void setRange1(int range1) {
		this.range1 = range1;
	}

	public int getRange2() {
		return range2;
	}

	public void setRange2(int range2) {
		this.range2 = range2;
	}
}
