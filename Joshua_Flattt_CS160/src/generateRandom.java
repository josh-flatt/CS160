//importing random
import java.util.Random;
import java.util.Scanner;

public class generateRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		int answer = rand.nextInt(11);
		//generates "answer" a random integer between 0 and 10
		System.out.println("Random number:"+answer);
		int guesses_left, guesses_used, x, guess;
		String response;
		//declares the used variables in the program as integers
		guesses_left = 3;
		guesses_used = 1;
		x = guesses_left - guesses_used;
		
		System.out.println("Enter your guess below:");
		Scanner reader1 = new Scanner(System.in);
		response = reader1.nextLine();
		guess = Integer.parseInt(response);
		//converts the guessed number into an integer
		System.out.println("Your guess:"+guess);
		
		
		System.out.println("guesses left:"+guesses_left);
		guesses_left = guesses_left - 1;
		System.out.println("Guesses Left:"+guesses_left);
		System.out.println("This is x: "+x);
	}

}
