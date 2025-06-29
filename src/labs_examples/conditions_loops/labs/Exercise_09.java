package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean winningNumber = false;
        System.out.println("Guess a number between 1 and 100");

        while (!winningNumber) {
            int guess = scanner.nextInt();
            if(guess == 27) {
                winningNumber = true;
                System.out.println("You guessed Correctly");
                break;
            } else {
                System.out.println("Guess again");
            }
        }
    }
}
