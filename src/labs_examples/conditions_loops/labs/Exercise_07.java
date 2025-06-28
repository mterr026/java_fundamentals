package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //take users input as a string
        String word = scanner.nextLine();
        String vowels = "aeiou";
        //set the count to 0 for while loop
        int count = 0;

        while(count != word.length()) { //while count is less than the length of users word
            int number = word.charAt(count); //convert the current character of users word to its ASCII value
            if(vowels.indexOf(number) >= 0) { //check if current character is part of vowels string
                System.out.println("The first vowel is: " + (char)number); //print out the first vowel in users word
                break;
            }
            count++;
        }
    }
}
