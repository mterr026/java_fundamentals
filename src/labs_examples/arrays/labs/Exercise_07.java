package labs_examples.arrays.labs;
import java.util.ArrayList;
/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(9);
        System.out.println(arr.get(0));
    }
}
