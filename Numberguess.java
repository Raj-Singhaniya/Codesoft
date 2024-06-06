import java.util.Random;
import java.util.Scanner;

public class Numberguess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minNumber = 1;
        int maxNumber = 100;
        int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        int attempts = 0;

        System.out.println("Welcome to the  Game! You have to guess a no. :");
        System.out.println("I've picked a number between " + minNumber + " and " + maxNumber + ". Try to guess it!");

        while (true) {
            System.out.print("Enter your guess no. : ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " no. of attempts.");
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Far away! Pick higher number.");
            } else {
                System.out.println("Left back ! Pick a lower number.");
            }
        }

        scanner.close();
    }
}
