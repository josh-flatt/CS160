import java.util.Random;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////
// Lab 1  - A Python Program                                                    //
// Part 1 - Random Number Generator                                             //
// PROGRAMMER:        Joshua Flatt   flat7792@bears.unco.edu                    //
// CLASS:             CS160                                                     //
// TERM:              Fall 2021                                                 //
// INSTRUCTOR:        Dean Zeller                                               //
// SUBMISSION DATE:   9/13/2021                                                 //
//                                                                              //
// DESCRIPTION                                                                  //
// The program is a random number generator that makes the user                 //
// guess a number between 1 and 10. The user gets 3 chances to figure out       //
// what the randomized number was.                                              //
//                                                                              //
// ORIGINAL SOURCE                                                              //
// This code was originally written by:                                         //
//    Author:   Joshua Flatt                                                    //
//    Location: https://trinket.io/python/e065acb568                            //
//                                                                              //
// COPYRIGHT:                                                                   //
// This program is copyright (c)2021 Joshua Flatt and Dean Zeller.              //
//                                                                              //
//////////////////////////////////////////////////////////////////////////////////


public class Joshua_Flatt_CS160_Ass1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int answer = rand.nextInt(11);
		//generates "answer" a random integer between 0 and 10
		int guess1, guess2, guess3;
		String  response1, response2, response3;
		//declares the used variables in the program as integers


		System.out.println("Enter your guess below:");
		Scanner reader1 = new Scanner(System.in);
		response1 = reader1.nextLine();

		guess1 = Integer.parseInt(response1);
		//converts the guessed number into an integer
		System.out.println("Your guess:"+guess1);

		//First Guess
		if (guess1 == answer) {
			System.out.println("You guessed correctly.");
		}
		else if (guess1 != answer) {
			if (guess1 > answer) {
				System.out.println("Your guess was too high!");
			}
			else if (guess1 < answer) {
				System.out.println("Your guess was too low!");
			}
			else {
				System.out.println("How did you get here?");
			}

			//Second Guess
			System.out.println("Enter your second guess below:");
			Scanner reader2 = new Scanner(System.in);
			response2 = reader2.nextLine();

			guess2 = Integer.parseInt(response2);
			if (guess2 == answer) {
				System.out.println("You guessed correctly.");
			}
			else if (guess2 != answer) {
				if (guess2 > answer) {
					System.out.println("Your guess was too high!");
				}
				else if (guess2 < answer) {
					System.out.println("Your guess was too low!");
				}
				else {
					System.out.println("How did you get here?");
				}

				//Third Guess
				System.out.println("Enter your third guess below:");
				Scanner reader3 = new Scanner(System.in);
				response3 = reader3.nextLine();

				guess3 = Integer.parseInt(response3);
				if (guess3 == answer) {
					System.out.println("You guessed correctly.");
				}
				else if (guess3 != answer) {
					if (guess3 > answer) {
						System.out.println("Your guess was too high!");
						System.out.println("The correct answer was: "+answer);
					}
					else if (guess3 < answer) {
						System.out.println("Your guess was too low!");
						System.out.println("The correct answer was: "+answer);
					}
					else {
						System.out.println("How did you get here?");
						System.out.println("The correct answer was: "+answer);
					}
				}
			}
		}
	}
}
