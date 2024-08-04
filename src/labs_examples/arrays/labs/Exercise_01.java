package labs_examples.arrays.labs;

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
        int[] arr = new int[10];

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        arr[0] = userInput;
        userInput = scanner.nextInt();
        arr[1] = userInput;
        userInput = scanner.nextInt();
        arr[2] = userInput;
        userInput = scanner.nextInt();
        arr[3] = userInput;
        userInput = scanner.nextInt();
        arr[4] = userInput;
        userInput = scanner.nextInt();
        arr[5] = userInput;
        userInput = scanner.nextInt();
        arr[6] = userInput;
        userInput = scanner.nextInt();
        arr[7] = userInput;
        userInput = scanner.nextInt();
        arr[8] = userInput;
        userInput = scanner.nextInt();
        arr[9] = userInput;

        int sum = 0;   
        for(int i=0;i<arr.length;i++) {
            
            sum += arr[i];
            
        }
        System.out.println(sum);
    }
}