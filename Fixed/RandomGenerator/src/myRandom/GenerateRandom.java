package myRandom;

//importing random
import java.util.Random;
import java.util.Scanner;

public class GenerateRandom {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scnr = new Scanner(System.in);
		int answer = rand.nextInt(11);
		int guesses_left = 3;
		int guesses_used = 0;
		int guess;
		String response;

		// generates "answer" a random integer between 0 and 10
		// System.out.println("Random number:"+answer);
		// declares the used variables in the program as integers

		System.out.println("Enter your guess below:");
		response = scnr.nextLine();
		guess = Integer.parseInt(response);
		// converts the guessed number into an integer
		System.out.println("Your guess:" + guess);

		System.out.println("guesses left:" + guesses_left);
		guesses_left--;
		System.out.println("Guesses Left:" + guesses_left);
		scnr.close();

	}

}
