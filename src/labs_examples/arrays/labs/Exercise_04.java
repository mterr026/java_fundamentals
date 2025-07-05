package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 3, 4},
                {3,6,7,8,9,0},
                {2,3}
        };

        for(int[] number : arr) {
            System.out.println(Arrays.toString(number));
        }
    }
}
