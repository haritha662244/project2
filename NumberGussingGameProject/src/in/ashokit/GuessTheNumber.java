package in.ashokit;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int randomNumber = generateRandomNumber(min, max);
        int attempts = 0;
        int maxAttempts = 5; // Change this value to set the limit of attempts

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I have chosen a number between " + min + " and " + max + ". Guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly!");
                break;
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber);
                break;
            }
        }

        System.out.println("Game over!");
        System.out.println("Your score: " + (maxAttempts - attempts)); // You can modify scoring logic as per your requirement
    }

    private static int generateRandomNumber(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
