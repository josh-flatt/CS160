
//////////////////////////////////////////////////////////////////////////////////
// Lab 1 – A Python Program                                                     //
// Part 2 - Prime Number Test                                                   //
// PROGRAMMER:        Joshua Flatt   flat7792@bears.unco.edu                    //
// CLASS:             CS160                                                     //
// TERM:              Fall 2021                                                 //
// INSTRUCTOR:        Dean Zeller                                               //
// SUBMISSION DATE:   9/13/2021                                                 //
//                                                                              //
// DESCRIPTION                                                                  //
// Checks if a given number is prime, and if not, prints all factors of         //
// the given number.                                                            //
//                                                                              //
// ORIGINAL SOURCE                                                              //
// This code was originally written by:                                         //
//    Author:   Unknown                                                         //
//    Location: Programiz.com                                                   //
//                                                                              //
// COPYRIGHT:                                                                   //
// This program is copyright ©2021 Joshua Flatt, Tim Falin,                     //
// Parewa Labs Pvt. Ltd., and Dean Zeller.                                      //
//                                                                              //
//////////////////////////////////////////////////////////////////////////////////


import java.util.*;



public class Timothy_Falin_CS160_Ass1 {

	public static void main(String[] args) {
		//Declares the variables
		String response;
		int num, x, lowest, prime;
		Boolean isPrime=false;
		x = 0;
		lowest = 1;
		
		//Creates user input to value "num" to find prime numbers
		Scanner reader1 = new Scanner(System.in);
		System.out.println("Enter a number:");
		response = reader1.nextLine();
		num = Integer.parseInt(response);
		reader1.close();
		
		
		
		//prime numbers are greater than 2		
		if (num>2) {
			
			//checks to see if the number is prime or not
			for (int i=2;i<num;i++) {
				prime=num%i;
				//runs if the number is not prime
				if (prime==0) {
					isPrime=false;
					break;
				}
				//runs if the number is prime
				else if (prime!=0) {
					isPrime=true;
					break;
				}
			}
		
			//finds factors
			for (int i=2; i<num; i++) {
				
				if (isPrime==false) {
					
				
					if ((num % i )==0 && i<(Math.floorDiv(num, lowest))) {
					System.out.println(i+" times "+ Math.floorDiv(num, i)+" is "+num);
					x = x+1;
					if (x==1) {
						lowest = i;
						
						}
					}
					
					if ((num % i)==0 && i==(Math.floorDiv(num, lowest))) {
					System.out.println(i+" times "+ Math.floorDiv(num, i)+" is "+num);
					x = x+1;
					System.out.println(num+" is not a prime number. It has "+x+" factors besides 1 and itself.");
					break;
					}
					
				}
				if (isPrime==true) {
					System.out.println(num+" is a prime number.");
					break;
				}

			}
		}
		
		//If there are no factors of "num"
		else {
			System.out.println(num+" is a prime number.");
		}
	

	}

}
