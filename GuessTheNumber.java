import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! You guessed the number!");
            }
        }

        sc.close();
    }
}
