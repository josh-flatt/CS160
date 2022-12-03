
////////////////////////////////////////////////////////////////////////////////////
// Lab 1 – A Python Program                                                       //
// Part 3 - A simple calculator                                                   //
// PROGRAMMER:        Joshua Flatt   flat7792@bears.unco.edu                      //
// CLASS:             CS160                                                       //
// TERM:              Fall 2021                                                   //
// INSTRUCTOR:        Dean Zeller                                                 //
// SUBMISSION DATE:   9/13/2021                                                   //
//                                                                                //
// DESCRIPTION                                                                    //
// The program is a simple calculator, where the user can choose 2 numbers        //
// and choose to add, multiply, subtract, or divide them together.                //
//                                                                                //
// ORIGINAL SOURCE                                                                //
// This code was originally written by:                                           //
//    Author:   Author not mentioned                                              //
//    Location: https://www.programiz.com/python-programming/examples/calculator  //
//                                                                                //
// COPYRIGHT:                                                                     //
// This program is copyright (c)2021 Joshua Flatt, James Pelletier,               //
// (unnamed author), and Dean Zeller.                                             //
//                                                                                //
////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
public class James_Pelletier_CS160_Ass1 {

	static float x, y;
	static float z;
	static int choice;
	
	//adds two numbers
	public static void add(float x , float y) {
		z = (x+y);
	}
	
	//subtracts two numbers
	public static void subtract(float x , float y) {
		z = (x-y);
	}
	
	//multiplies two numbers
	public static void multiply(float x , float y) {
		z = (x*y);
	}
	
	//divides two numbers
	public static void divide(float x , float y) {
		z = (x/y);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Select operation");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		
		//"Choice" assigned an integer from user input
		//"choice" creates decision on which operation of x and y 
		Scanner reader0 = new Scanner(System.in);
		System.out.println("Enter choice(1/2/3/4):");
		String response0 = reader0.nextLine();	
		choice = Integer.parseInt(response0);

		
		//"x" and "y" assigned float values from user input
		//x
		Scanner reader1 = new Scanner(System.in);
		System.out.println("Enter your first number.");
		String response1 = reader1.nextLine();	
		x = Float.parseFloat(response1);
		
		//y
		System.out.println("Enter your second number.");
		Scanner reader2 = new Scanner(System.in);
		String response2 = reader2.nextLine();
		y = Float.parseFloat(response2);
		
		//closes the scanners
		reader0.close();
		reader1.close();
		reader2.close();
		
		if (choice == 1) {
			add(x,y);
			System.out.println(x+" + "+y+" = "+z);
		}
		
		else if (choice == 2) {
			subtract(x,y);
			System.out.println(x+" - "+y+" = "+z);
		}
		
		else if (choice == 3) {
			multiply(x,y);
			System.out.println(x+" * "+y+" = "+z);
		}
		
		else if (choice == 4) {
			divide(x,y);
			System.out.println(x+" / "+y+" = "+z);
		}
		
		else {
			System.out.println("Invalid Input");
		}
		
	}


}
