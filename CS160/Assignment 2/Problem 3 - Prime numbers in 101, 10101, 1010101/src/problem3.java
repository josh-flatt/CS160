
/*****************************************************************************
 *                          Assignment 2 - Functions                         *
 *       Problem 3- Prime numbers in iterations of 101, 10101, 1010101...    *
 *                                                                           *
 * PROGRAMMER:           Joshua Flatt	flat7792@bears.unco.edu              *
 * CLASS:                CS160                                               *
 * TERM:                 Fall 2021                                           *
 * INSTRUCTOR:           Dean Zeller                                         *
 * SUBMISSION DATE:      9/14/2021                                           *
 *                                                                           *
 * DESCRIPTION                                                               *
 * The program looks for which iterations of 101, 10101, 1010101...etc       *
 * are prime numbers.                                                        *
 *                                                                           *
 * PROBLEM SOLVED                                                            *
 * The program tested the first 100 iterations of 101, finding that the      *
 * 1st iteration (101) and possibly the 18th are prime. The program for      *
 * some reason could not compute the 18th iteration of 101.                  *
 *                                                                           *
 * COPYRIGHT:                                                                *
 * This program is copyright (c)2021 Joshua Flatt, Dean Zeller, and Richard  *
 * Grassl.                                                                   *
 *                                                                           *
 *****************************************************************************/


public class problem3 
{

	public static void main(String[] args)
	{
		prime10101(1,9);
		System.out.println();
		//prime10101(18,18);
		System.out.println("Iteration 18 could be prime, hangs program");
		System.out.println();
		prime10101(19,100);
	}
	
	public static boolean isPrime(int n)
	{
		for (int i = 2; i < (Math.floorDiv(n, 2)); i++)
		{
			if (n % i == 0) { return false; }
		}
		return true;
	}
	
	public static boolean isPrime2(long n)
	{
		if (n == 2) { return true; }
		if (n == 3) { return true; }
		if (n % 2 == 0) { return false; }
		if (n % 3 == 0) { return false; }
		int i = 5;
		int w = 2;
		while ((i * i) <= n)
		{
			if (n % i == 0) { return false; }
			i += w;
			w = 6 - w;
		}
		return true;
	}
	
	public static void prime10101(int start, int end)
	{
		String numString = "1";
		for (int i = 0; i < start; i++)
		{
			numString += "01";
		}
		for (int i = start; i < end + 1; i++)
		{
			long num = Long.parseLong(numString);
			System.out.println("Doing iteration "+i+" "+num);
			if (isPrime2(num))
				System.out.println(num+" is prime!");
			numString += "01";
		}
	}
}
