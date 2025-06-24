package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        byte typeByte = 127;
        short typeShort = 2048;
        int typeInt = 1233124;
        long typeLong = 1233582585;
        float typeFloat = 1.02124f;
        double typeDouble = 1.234322342;
        boolean typeBoolean = false;
        char typeChar = 'f';

        System.out.println("Byte: " + typeByte);
        System.out.println("Short: " + typeShort);
        System.out.println("Int: " + typeInt);
        System.out.println("Long: " + typeLong);
        System.out.println("Float: " + typeFloat);
        System.out.println("Double: " + typeDouble);
        System.out.println("Boolean: " + typeBoolean);
        System.out.println("Char: " + typeChar);
    }

}
