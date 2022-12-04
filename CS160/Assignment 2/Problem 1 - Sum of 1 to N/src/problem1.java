/*****************************************************************************
 *                          Assignment 2 - Functions                         *
 *                          Problem 1 - Sum of 1..n                          *
 *                                                                           *
 * PROGRAMMER:           Joshua Flatt	flat7792@bears.unco.edu              *
 * CLASS:                CS160                                               *
 * TERM:                 Fall 2021                                           *
 * INSTRUCTOR:           Dean Zeller                                         *
 * SUBMISSION DATE:      9/14/2021                                           *
 *                                                                           *
 * DESCRIPTION                                                               *
 * The program attempts to determine if 1+2+3...+n is truly equal to         *
 * n(n+1)/2.                                                                 *
 *                                                                           *
 * PROBLEM SOLVED                                                            *
 * The program tested the theorem in the range n=0 to n=1001, finding that   *
 * 1+2+3...+n == n(n+1)/2 with zero exceptions in the range.                 *
 *                                                                           *
 * COPYRIGHT:                                                                *
 * This program is copyright (c)2021-2022 Joshua Flatt, Dean Zeller, and     *
 * Richard Grassl.                                                           *
 *                                                                           *
 *****************************************************************************/

public class problem1 
{
	public static void main(String[] args)
	{
		testEqualityVerbose(0, 25);
		testEqualitySummary(0, 10000);
	}
	
	public static void testEqualityVerbose(int start, int upperBound)
	{
		System.out.println("Verbose Mode Testing");
		System.out.println("Testing equality for all numbers from "+start+" to "+upperBound+" (verbose mode)");
		int countEqual = 0;
		int countNotEqual = 0;
		for (int i=start; i<(upperBound+1);i++)
		{
			int left = summation(i);
			int right = formula(i);
			String message;
			if (left == right)
			{
				message = "equal";
				countEqual += 1;
			}
			else
			{
				message = "not equal";
				countNotEqual += 1;
			}
			System.out.println(i+"   "+left+"   "+right+"   "+message);
		}
		System.out.println("There were "+countEqual+" lines correct.");
		System.out.println("There were "+countNotEqual+" lines not correct.");
	}
	
	public static void testEqualitySummary(int start, int upperBound)
	{
		System.out.println("Summary Mode Testing");
		System.out.println("Printing n every 1,000 iterations.");
		int countEqual = 0;
		int countNotEqual = 0;
		for (int i=start; i<(upperBound+1);i++)
		{
			int summation = summation(i);
			int formula = formula(i);
			if (summation != formula)
			{
				System.out.println(i+"  "+summation+"  "+formula);
				countNotEqual++;
			}
			else
				countEqual++;
			if (i % 1000 == 0)
				System.out.println(" n = "+i);
		}
		System.out.println();
		System.out.println("There were "+countEqual+" lines correct.");
		System.out.println("There were "+countNotEqual+" lines not correct.");
	}
	
	public static int summation(int n)
	{
		int sum = 0;
		for (int i = 0; i < (n+1); i++)
		{
			sum += i;
		}
		return(sum);
	}
	
	public static int formula(int n)
	{
		int total = n*(n+1)/2;
		return(total);
	}
}
