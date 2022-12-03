
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
 * This program is copyright (c)2021 Joshua Flatt, Dean Zeller, and Richard  *
 * Grassl.                                                                   *
 *                                                                           *
 *****************************************************************************/

public class problem1 
{

	public static int leftSide(int n)
	{
		int total = 0;
		for (int i=0;i<(n+1);i++)
		{
			total += i;
		}
		return(total);
	}
	
	public static int rightSide(int n)
	{
		int total = n*(n+1)/2;
		return(total);
	}
	
	public static void testEqualityVerbose(int startAt, int upTo)
	{
		System.out.println("Verbose Mode Testing");
		System.out.println("Testing equality for all numbers from "+startAt+" to "+upTo+" (verbose mode)");
		int totalEqual = 0;
		int totalNotEqual = 0;
		for (int i=startAt; i<(upTo+1);i++)
		{
			int left = leftSide(i);
			int right = rightSide(i);
			String message;
			if (left == right)
			{
				message = "equal";
				totalEqual += 1;
			}
			else
			{
				message = "not equal";
				totalNotEqual += 1;
			}
			System.out.println(i+"   "+left+"   "+right+"   "+message);
		}
		System.out.println("There were "+totalEqual+" lines correct.");
		System.out.println("There were "+totalNotEqual+" lines not correct.");
	}
	public static void testEqualitySummary(int startAt, int upTo, int progressSkipValue, int progressUpdateValue)
	{
		System.out.println("Summary Mode Testing");
		System.out.println("Printing n every "+progressUpdateValue+" iterations.");
		int totalEqual = 0;
		int totalNotEqual = 0;
		for (int i=startAt; i<(upTo+1);i++)
		{
			int left = leftSide(i);
			int right = rightSide(i);
			if (left != right)
			{
				System.out.println(i+"  "+left+"  "+right);
				totalNotEqual += 1;
			}
			else
			{
				totalEqual +=1;
			}
			if (i%progressUpdateValue == 0)
				System.out.println("  n = "+i);
			if (i%progressSkipValue == 0)
				System.out.println("#");
		}
		System.out.println();
		System.out.println("There were "+totalEqual+" lines correct.");
		System.out.println("There were "+totalNotEqual+" lines not correct.");
	}
	
	
	public static void main(String[] args)
	{
		testEqualityVerbose(0,25);
		testEqualitySummary(0, 10000, 1000, 10000);

	}

}
