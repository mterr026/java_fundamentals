package labs_examples.conditions_loops.labs;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 12: ");
        int number = scanner.nextInt();

        switch(number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("Obctober");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");

        }
    }



}
