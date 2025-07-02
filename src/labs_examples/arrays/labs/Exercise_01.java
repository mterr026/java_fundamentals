package labs_examples.arrays.labs;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        int sum = 0;
        double avg = 0;

        for (int i = 0; i <= 9; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }
        System.out.println(sum);
        System.out.println((avg + (double)sum) / 10.0);

    }
}