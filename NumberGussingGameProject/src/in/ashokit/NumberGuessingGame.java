package in.ashokit;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
	    public static void main(String[] args) {
	        final int MIN_NUMBER = 1;
	        final int MAX_NUMBER = 100;
	        final int MAX_ATTEMPTS = 5;

	        Random random = new Random();
	        int targetNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
	        int attempts = 0;

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I have picked a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");
	        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it.");

	        while (attempts < MAX_ATTEMPTS) {
	            System.out.print("Enter your guess: ");
	            int guess = scanner.nextInt();
	            attempts++;

	            if (guess == targetNumber) {
	                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                break;
	            } else if (guess < targetNumber) {
	                System.out.println("The number is higher.");
	            } else {
	                System.out.println("The number is lower.");
	            }
	        }

	        if (attempts == MAX_ATTEMPTS) {
	            System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
	        }

	        scanner.close();
	    }
	}

