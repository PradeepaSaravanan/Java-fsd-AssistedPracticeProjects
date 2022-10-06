package com.JunitTest2;

public class MathUtil {
 
	public static int add(int n, int m)
	{
		return n+m;
	}
	public static int multiply(int n, int m)
	{
		return n*m;
	}
	
	public static boolean isEven(int n )
	{
		return n%2==0;
	}
	
	public static int divide(int n, int m)
	{
		return n/m;
	}
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public int String_Length()
	{
		String str="WelcomeToAll";
		return str.length();
	}
}
