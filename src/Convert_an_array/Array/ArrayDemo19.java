/*
experiment number:21
experiment name : Write a Java program to convert an ArrayList to an array.
 */

package Convert_an_array.Array;

import java.util.ArrayList;

public class ArrayDemo19 {
    public static void main(String[] args) {
        // Create a new ArrayList of strings.
        ArrayList<String> list = new ArrayList<String>();

        // Add strings to the ArrayList.
        list.add("Python");
        list.add("Java");
        list.add("PHP");
        list.add("C#");
        list.add("C++");
        list.add("Perl");

        // Create a new string array with the same size as the ArrayList.
        String[] my_array = new String[list.size()];

        // Convert the ArrayList to an array and store it in my_array.
        list.toArray(my_array);

        // Iterate through the elements of the string array and print each element.
        for (String string : my_array) {
            System.out.println(string);
        }
    }
}
