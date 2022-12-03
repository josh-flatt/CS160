
//////////////////////////////////////////////////////////////////////////////////
//                Assignment 3/4 - Quiz Show Simulation, part 1                 //
//                                                                              //
// PROGRAMMER:        Joshua Flatt   flat7792@bears.unco.edu                    //
// CLASS:             CS160                                                     //
// TERM:              Fall 2021                                                 //
// INSTRUCTOR:        Dean Zeller                                               //
// SUBMISSION DATE:   10/15/2021                                                 //
//                                                                              //
// DESCRIPTION                                                                  //
// The program is a quiz that engages the user through characterization         //
// of the test. The score is also kept track of and shown to the user at the    //
// end of the game.                                                             //
//                                                                              //
// ORIGINAL SOURCE                                                              //
// This code is original.                                                       //
//                                                                              //
// COPYRIGHT:                                                                   //
// This program is copyright (c)2021 Joshua Flatt and Dean Zeller.              //
//                                                                              //
//////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class assignment3 
{
	static String name0, date0;
	static boolean passfail = false;
	static String pf_a = "failed";
	static String pf_b = "Congrats!";
	//Score board Creation
	static int scoreboard = 0;
	static boolean score = false;
	public static int scoring(boolean score)
	{
		if (score == true)
			return scoreboard+=1;
		else
			return scoreboard+=0;
	}
	
	//Opener
	public static void quizopener()
	{
		//Input setup
		Scanner namescnr = new Scanner(System.in);
			
		System.out.println("+------------------------------------------------------+");
		System.out.println("|         Welcome to Josh's GED progress quiz!         |");
		System.out.println("| Today you are taking a quiz to see if you could pass |");
		System.out.println("|           the exam to receive your GED.              |");
		System.out.println("|    To pass, you must score at least 6/10 correct.    |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("  Enter your name:");
		name0 = namescnr.nextLine();
		System.out.println("  Enter the date:");
		date0 = namescnr.nextLine();
		System.out.println("  Welcome, "+name0+".");
		System.out.println("  Running quiz now...");
	}
	
	//Question 1
	public static void question1()
	{
	   /*******************************************************************************
	    * Question 1 - Square Root                                                    *
	    * User will find the square root of a random integer with accuracy of 0.01.   *
	    * Question type 4 (Mathematical Range)                                        *
	    *******************************************************************************/
		Random r = new Random();
		int answer = r.nextInt(20);
		double accuracy = 0.01;
		double ans_pow = Math.sqrt(answer);
		Scanner q1input = new Scanner(System.in);
		System.out.println("  Question 1:");
		System.out.println("  What is the square root of "+answer+"? (Within 0.01) => ");
		String x = q1input.nextLine();
		System.out.println("  Your answer: "+x);
		double response = Double.parseDouble(x);
		if (Math.abs(ans_pow-response)<accuracy)
		{
			System.out.println("  Correct!");
			scoring(true);
			System.out.println("  Your score: "+scoreboard);
		}
		else
		{
			System.out.println("  Wrong!");
			System.out.printf("  The correct answer was: %.2f",ans_pow);
			System.out.println();
			scoring(false);
			System.out.println("  Your score: "+scoreboard);
		}
	}
	
	//Question 2
	public static void question2()
	{
	   /*******************************************************************************
	    * Question 2 - 20th President                                                 *
	    * User will state the name of the 20th President of the United States.        *
	    * Question type 3 (Multiple string responses)                                 *
	    *******************************************************************************/
		List<String> answer = new ArrayList<String>();
		answer.add("garfield");
		answer.add("james garfield");
		Scanner q2input = new Scanner(System.in);
		System.out.println("  Question 2:");
		System.out.println("  Who was the 20th President of the US? =>");
		String x = q2input.nextLine();
		System.out.println("  Your answer: "+x);
		String guess = x.toLowerCase();
		if (answer.contains(guess))
		{
			System.out.println("  Correct!");
			scoring(true);
		}
		else
		{
			System.out.println("  Incorrect.");
			System.out.println("  The correct answers were: "+answer);
			scoring(false);
			System.out.println("  Your score: "+scoreboard);
		}
	}
	
	//Question 3
	public static void question3()
	{
	   /*******************************************************************************
		* Question 3 - Difference                                                     *
		* User will find the difference of two integers as an exact answer.           *
		* Question type 2 (Exact Mathematical Answer)                                 *
		*******************************************************************************/
		Random r = new Random();
		int a = r.nextInt(500);
		int b = r.nextInt(500);
		Scanner q1input = new Scanner(System.in);
		System.out.println("  Question 3:");
		System.out.println("  What is "+a+"-"+b+"? =>");
		String x = q1input.nextLine();
		System.out.println("  Your answer: "+x);
		int response = Integer.parseInt(x);
		if (response == (a-b))
		{
			System.out.println("  Correct!");
			scoring(true);
			System.out.println("  Your score: "+scoreboard);
		}
		else
		{
			System.out.println("  Wrong!");
			System.out.println("  The correct answer was: "+(a-b));
			scoring(false);
			System.out.println("  Your score: "+scoreboard);
		}
	}
	
	//Question 4
	public static void question4()
	{
	   /*******************************************************************************
		* Question 4 - Capitol of NY                                                  *
		* User will enter the name of the Capital of New York.                        *
		* Question type 1 (Exact String)                                              *
		*******************************************************************************/
		String answer = "albany";
		Scanner q4input = new Scanner(System.in);
		System.out.println("  Question 4:");
		System.out.println("  What is the Capitol of New York? =>");
		String x = q4input.nextLine();
		System.out.println("  Your answer: "+x);
		String response = x.toLowerCase();
		if (response.equals(answer))
		{
			System.out.println("  Correct!");
			scoring(true);
			System.out.println("  Your score: "+scoreboard);
		}
		else
		{
			System.out.println("  Wrong!");
			System.out.println("  The correct answer was: "+answer);
			scoring(false);
			System.out.println("  Your score: "+scoreboard);
		}
	}
	
	//Question 5
	public static void question5()
	{
	   /*******************************************************************************
		* Question 5 - Highest Number                                                 *
		* User will enter the highest integer in a randomly generated list.           *
		* Question type 2 (Exact Mathematical Answer)                                 *
		*******************************************************************************/
		Random r = new Random();
		int length = r.nextInt(25);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(7);
		int answer = 0;
		for (int i=0;i<length;i++)
		{
			l1.add(r.nextInt(100));
		}
		for (Integer d:l1)
		{
			if (d>answer)
				answer = d;
		}
		//System.out.println(highest);
		Scanner q5input = new Scanner(System.in);
		System.out.println("  Question 5:");
		System.out.println("  What is the largest number in the following list?");
		System.out.println("  "+l1);
		String x = q5input.nextLine();
		System.out.println("  Your answer: "+x);
		int response = Integer.parseInt(x);
		if (response == answer)
		{
			System.out.println("  Correct!");
			scoring(true);
			System.out.println("  Your score: "+scoreboard);
		}
		else
		{
			System.out.println("  Wrong!");
			System.out.println("  The correct answer was: "+answer);
			scoring(false);
			System.out.println("  Your score: "+scoreboard);
		}
	}
	
	//Question 6
	public static void question6()
	{
	   /*******************************************************************************
		* Question 6 - Mt Rushmore                                                    *
		* User will enter the name of any president that appears on Mt Rushmore.      *
		* Question type 3 (Multiple Strings)                                          *
		*******************************************************************************/
		ArrayList<String> presidents = new ArrayList<String>();
		presidents.add("washington");
		presidents.add("george washington");
		presidents.add("jefferson");
		presidents.add("thomas jefferson");
		presidents.add("roosevelt");
		presidents.add("theodore roosevelt");
		presidents.add("lincoln");
		presidents.add("abraham lincoln");
		Scanner q6input = new Scanner(System.in);
		System.out.println("  Question 6:");
		System.out.println("  What is the name of a President on Mt. Rushmore? =>");
		String x = q6input.nextLine();
		System.out.println("  Your answer: "+x);
		String guess = x.toLowerCase();
		if (presidents.contains(guess))
		{
			System.out.println("  Correct!");
			scoring(true);
			System.out.println("  Your score: "+scoreboard);
		}
		else
		{
			System.out.println("  Wrong!");
			System.out.println("  The correct answers were:");
			System.out.println(presidents);
			scoring(false);
			System.out.println("  Your score: "+scoreboard);
		}
	}
	
	//Question 7
	public static void question7()
	{
	   /*******************************************************************************
		* Question 7 - List sum                                                       *
		* User will calculate the exact sum of a random list of integers.             *
		* Question type 2 (Exact Mathematical Answer)                                 *
		*******************************************************************************/
		//creates random length arraylist<integer>
		Random r = new Random();
		int length = r.nextInt(10);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(7);
		for (int i=0;i<length;i++)
		{
			l1.add(r.nextInt(100));
		}
		//generates the sum of the arraylist numbers
		int answer = 0;
		for(int i=0;i<l1.size();i++)
		{      
			answer += l1.get(i);
		}
		//sum tester below
		//System.out.println(answer);
		Scanner q7input = new Scanner(System.in);
		System.out.println("  Question 7:");
		System.out.println("  What is the sum of the numbers below?");
		System.out.println("  "+l1);
		String x = q7input.nextLine();
		System.out.println("  Your answer: "+x);
		int response = Integer.parseInt(x);
		if (response == answer)
		{
			System.out.println("  Correct!");
			scoring(true);
			System.out.println("  Your score: "+scoreboard);
		}
		else
		{
			System.out.println("  Wrong!");
			System.out.println("  The correct answer was: "+answer);
			scoring(false);
			System.out.println("  Your score: "+scoreboard);
		}
	}
	
	//Question 8
	public static void question8()
	{
	   /*******************************************************************************
		* Question 8 - Division                                                       *
		* User will enter find (x/y).                                                 *
		* Question type 4 (Mathematical Range)                                        *
		*******************************************************************************/
		Random r = new Random();
		double a = r.nextInt(100);
		double b = r.nextInt(100);
		double answer = (a/b);
		double accuracy = 0.01;
		//System.out.println(answer);
		Scanner q8input = new Scanner(System.in);
		System.out.println("  Question 8:");
		System.out.printf("  What is %.0f/%.0f?",a,b);
		System.out.println("  (Within 0.01) =>");
		String x = q8input.nextLine();
		System.out.println("  Your answer: "+x);
		double response = Double.parseDouble(x);
		if (Math.abs(answer-response)<accuracy)
		{
			System.out.println("  Correct!");
			scoring(true);
			System.out.println("  Your score: "+scoreboard);
		}
		else
		{
			System.out.println("  Wrong!");
			System.out.printf("  The correct answer was: %.2f",answer);
			System.out.println();
			scoring(false);
			System.out.println("  Your score: "+scoreboard);
		}
	}
	
	//Question 9
	public static void question9()
	{
	   /*******************************************************************************
		* Question 9 - Super Bowl Winner                                              *
		* User will enter the name of the team who most recently won the Super Bowl.  *
		* Question type 1 (Exact String)                                              *
		*******************************************************************************/
		String answer = "buccaneers";
		Scanner q9input = new Scanner(System.in);
		System.out.println("  Question 9:");
		System.out.println("  Who is the team that won the most recent Super Bowl? =>");
		String x = q9input.nextLine();
		System.out.println("  Your answer: "+x);
		String response = x.toLowerCase();
		if (response.equals(answer))
		{
			System.out.println("  Correct!");
			scoring(true);
			System.out.println("  Your score: "+scoreboard);
		}
		else
		{
			System.out.println("  Wrong!");
			System.out.println("  The correct answer was: "+answer);
			scoring(false);
			System.out.println("  Your score: "+scoreboard);
		}
	}
	
	//Question 10
	public static void question10()
	{
	   /*******************************************************************************
		* Question 10 - Random Average                                                *
		* User will find the average of a random list with accuracy of 0.01.          *
		* Question type 4 (Mathematical Range)                                        *
		*******************************************************************************/
		Random r = new Random();
		int length = r.nextInt(10);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(7);
		for (int i=0;i<length;i++)
		{
			l1.add(r.nextInt(100));
		}
		//generates the sum of the arraylist numbers
		int answer = 0;
		for(int i=0;i<l1.size();i++)
		{      
			answer += l1.get(i);
		}
		//converts integers to doubles to create an average
		double length_1 = (double)(length+1);
		double answer_1 = (double)(answer);
		double avg = (answer_1/length_1);
		double accuracy = 0.01;
		//avg tester below
		//System.out.println(avg);
		Scanner q10input = new Scanner(System.in);
		System.out.println("  Question 10:");
		System.out.println("  What is the average of the numbers below?");
		System.out.println("  Within 0.01");
		System.out.println("  "+l1);
		String x = q10input.nextLine();
		System.out.println("  Your answer: "+x);
		double response = Double.parseDouble(x);
		if (Math.abs(avg-response)<accuracy)
		{
			System.out.println("  Correct!");
			scoring(true);
			System.out.println("  Your score: "+scoreboard);
		}
		else
		{
			System.out.println("  Wrong!");
			System.out.printf("  The correct answer was: %.2f",avg);
			System.out.println();
			scoring(false);
			System.out.println("  Your score: "+scoreboard);
		}
	}
	
	//Determines % score and pass/fail
	public static void finality()
	{
		String percent = String.valueOf(scoreboard*10)+("%");
		System.out.println("  ("+percent+")");
		if (scoreboard > 5)
		{
			pf_a = "passed";
			pf_b = "Congrats!";
		}
		else
		{
			pf_a = "failed";
			pf_b = "Better luck next time!";
		}
	}
	
	//Closing remarks
	public static void quizcloser()
	{
		System.out.println("  Final score: "+scoreboard+"/10.");
		System.out.println("  Name: "+name0);
		System.out.println("  Date: "+date0);
		finality();
		System.out.println("  60% is required to pass.");
		System.out.println("  You "+pf_a+". "+pf_b); 
	}
	
	//Motif between questions
	public static void breaker()
	{
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();	
	}
	
	//Runs all of the program; leaves a door open to 
	//randomize the order of the questions
	public static void quizrun()
	{
		quizopener();
		breaker();
		question1();
		breaker();
		question2();
		breaker();
		question3();
		breaker();
		question4();
		breaker();
		question5();
		breaker();
		question6();
		breaker();
		question7();
		breaker();
		question8();
		breaker();
		question9();
		breaker();
		question10();
		breaker();
		quizcloser();
	}
	
	
	public static void main(String[] args) 
	{
		quizrun();
	}

	
}
