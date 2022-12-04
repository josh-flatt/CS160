import java.lang.Math;

/*****************************************************************************
 *                          Assignment 2 - Functions                         *
 *                 Problem 2 - Perfect square of n in 1!+2!+...n!            *
 *                                                                           *
 * PROGRAMMER:           Joshua Flatt	flat7792@bears.unco.edu              *
 * CLASS:                CS160                                               *
 * TERM:                 Fall 2021                                           *
 * INSTRUCTOR:           Dean Zeller                                         *
 * SUBMISSION DATE:      9/14/2021                                           *
 *                                                                           *
 * DESCRIPTION                                                               *
 * The program looks for perfect squares of n in the sequence                *
 * 1!+2!+3!...n!.                                                            *
 *                                                                           *
 * PROBLEM SOLVED                                                            *
 * The program found multiple perfect squares of n in the sequence of        *
 * factorials, until the numbers become too large for the program to handle. *
 *                                                                           *
 * COPYRIGHT:                                                                *
 * This program is copyright (c)2021-2022 Joshua Flatt, Dean Zeller, and     *
 * Richard Grassl.                                                           *
 *                                                                           *
 *****************************************************************************/


public class problem2
{
	public static void main(String[] args)
	{
		System.out.println(sumOfFactorials(13));
		
		for (int i=1;i<35;i++)
		{
			System.out.println(i+" --> "+sumOfFactorials(i));
			if (isPerfectSquare(sumOfFactorials(i)))
			{
				System.out.println("It holds for i = "+i);
			}
		}
	}
	
	public static long factorial(int n)
	{
		if (n == 1 || n == 0) 
		{
			return 1;
		}
	    return n * factorial(n - 1);
	}
	
	public static boolean isPerfectSquare(long n)
	{
		double sqrt = Math.sqrt(n);
		sqrt = sqrt*100;
		if (sqrt % 100 == 0)
		{
			return true;
		}
		return false;
	}
	
	public static long sumOfFactorials(long n)
	{
		long sum = 0;
		for (int i=1;i<(n+1);i++)
		{
			sum += factorial(i);
		}
		return sum;			
	}
	
}
